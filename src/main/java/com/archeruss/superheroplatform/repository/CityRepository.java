package com.archeruss.superheroplatform.repository;

import com.archeruss.superheroplatform.models.CityModel;
import com.archeruss.superheroplatform.models.Incident;
import com.archeruss.superheroplatform.models.SuperHeroModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityRepository {
    private final MysqlConn database;

    public CityRepository() {
        this.database = new MysqlConn();
    }
    public List<CityModel> getAll() throws SQLException {
        try {
            Connection conn = database.getDatabaseConnection();
            String query = "SELECT id, name, longitude, latitude FROM superhero.city";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<CityModel> cityList = new ArrayList<>();
            while (rs.next()) {
                CityModel city = new CityModel(rs.getInt("id"), rs.getString("name"), rs.getString("longitude"), rs.getString("latitude"));
                cityList.add(city);
            }
            return cityList;
        } catch (SQLException e) {
            throw e;
        }
    }
    public boolean createCity(CityModel city) throws SQLException {
        try {
            Connection conn = database.getDatabaseConnection();
            String query = "INSERT INTO city(name,longitude,latitude) VALUES(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, city.name);
            stmt.setString(2, city.longitude);
            stmt.setString(3, city.latitude);
            return stmt.execute();
        } catch (SQLException exception) {
            throw exception;
        }
    }

}
