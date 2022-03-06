package com.archeruss.superheroplatform.models;



public class CityModel {
    public Integer id;
    public String name;
    public Float lon;
    public Float lat;

    public CityModel(Integer id, String name, Float lon, Float lat) {
        this.id = id;
        this.name = name;
        this.lon = lon;
        this.lat = lat;
    }
    public CityModel(String name, Float lon, Float lat) {
        this.name = name;
        this.lon = lon;
        this.lat = lat;
    }

    public CityModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
