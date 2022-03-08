package com.archeruss.superheroplatform.services;

import com.archeruss.superheroplatform.models.CityModel;
import com.archeruss.superheroplatform.models.SuperHeroModel;
import com.archeruss.superheroplatform.repository.SuperheroRepository;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceGPS {
protected static final String apiKey = "26584dd9b494a536a239863e63e974d1";

    public String getFromCoordinates(double lon, double lat) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        String url = "http://api.openweathermap.org/geo/1.0/reverse?lat="+lat+"&lon="+lon+"&limit=1&appid="+apiKey;
        System.out.println(url);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson g = new Gson();
        return g.toJson(response.body());
    }
    public static CityModel getFromCityString(String ville) throws IOException, InterruptedException {
        ville = ville.replace(" ", "%20");
        HttpClient client = HttpClient.newHttpClient();
        String url = "https://api.openweathermap.org/geo/1.0/direct?q="+ville+"&appid=" + apiKey;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

    //Conversion de mon résult en Array
    JSONArray array = new JSONArray(response.body());
    //Récupération du premier élément
    JSONObject json = (JSONObject) array.get(0);
        return new CityModel(json.getString("name"), json.getFloat("lon"), json.getFloat("lat") );
    }

    public static double GetDistanceBetweenIncidentAndHero(double lat1, double lon1,double lat2, double lon2) {
        // The math module contains a function
        // named toRadians which converts from
        // degrees to radians.
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 6371;

        // calculate the result
        return(c * r);
    }
    public static List<SuperHeroModel> getNearHeros(String ville, int incidentId) throws SQLException, IOException, InterruptedException {
        CityModel city = ServiceGPS.getFromCityString(ville);
        List<SuperHeroModel> nearHeros = new ArrayList<SuperHeroModel>();
        List<SuperHeroModel> heroList = SuperheroRepository.getAllHeros();
        int i = 0;
        while (i < heroList.size()){
            if (ServiceGPS.GetDistanceBetweenIncidentAndHero(Double.valueOf(heroList.get(i).longitude),city.lon,Double.valueOf(heroList.get(i).latitude),city.lat) <=50000 && (heroList.get(i).incident1 == incidentId || heroList.get(i).incident2 == incidentId || heroList.get(i).incident3 == incidentId  )){
                nearHeros.add(heroList.get(i));
            }
            i++;
        }
        return nearHeros;
    }
}
