package com.archeruss.superheroplatform.repository;

import com.archeruss.superheroplatform.models.CityModel;

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
            String query = "SELECT id, name, lon, lat FROM superhero.city";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<CityModel> cityList = new ArrayList<>();
            while (rs.next()) {
                CityModel city = new CityModel(rs.getInt("id"), rs.getString("name"), rs.getFloat("lon"), rs.getFloat("lat"));
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
            String query = "INSERT INTO city(name,lon,lat) VALUES(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, city.name);
            stmt.setFloat(2, city.lon);
            stmt.setFloat(3, city.lat);
            return stmt.execute();
        } catch (SQLException exception) {
            throw exception;
        }
    }

}
