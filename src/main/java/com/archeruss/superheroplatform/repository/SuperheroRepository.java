package com.archeruss.superheroplatform.repository;

import com.archeruss.superheroplatform.models.SuperHeroModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuperheroRepository {
    private final MysqlConn database;

    public SuperheroRepository() {
        this.database = new MysqlConn();
    }

    public boolean createHero(SuperHeroModel sh) throws SQLException {
        try {
            Connection conn = database.getDatabaseConnection();
            String query = "INSERT INTO heros(name,incident1,incident2,incident3,longitude,latitude,telephone) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, sh.name);
            stmt.setInt(2, sh.incident1);
            stmt.setInt(3, sh.incident2);
            stmt.setInt(4, sh.incident3);
            stmt.setString(5, sh.longitude);
            stmt.setString(6, sh.latitude);
            stmt.setInt(7, sh.telephone);
            return stmt.execute();
        } catch (SQLException exception) {
            throw exception;
        }
    }

    public List<SuperHeroModel> getAllHeros() throws SQLException {
        try {
            Connection conn = database.getDatabaseConnection();
            String query = "SELECT * FROM heros";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<SuperHeroModel> heroList = new ArrayList<>();
            while (rs.next()) {
                SuperHeroModel hero = new SuperHeroModel(rs.getString("name"), rs.getInt("incident1"), rs.getInt("incident2"), rs.getInt("incident3"), rs.getString("longitude"), rs.getString("latitude"), rs.getInt("telephone"));
                heroList.add(hero);
            }
            return heroList;
        } catch (SQLException exception) {
            throw exception;
        }

    }
}
