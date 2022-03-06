package com.archeruss.superheroplatform.repository;

import com.archeruss.superheroplatform.models.Incident;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IncidentRepository {
    private final MysqlConn database;

    public IncidentRepository() {
        this.database = new MysqlConn();
    }

    public List<Incident> getAll() throws SQLException {
        try {
            Connection conn = database.getDatabaseConnection();
            String query = "SELECT id, label FROM superhero.incidents";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Incident> incidentList = new ArrayList<>();
            while (rs.next()) {
                Incident incident = new Incident(rs.getInt("id"), rs.getString("label"));
                incidentList.add(incident);
            }
            return incidentList;
        } catch (SQLException e) {
            throw e;
        }
    }
    public Incident getById(Integer id) throws SQLException {
        System.out.println(id);
        try {
            Connection conn = database.getDatabaseConnection();
            String query = "SELECT id, label FROM superhero.incidents WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            Incident incident = null;
            while (rs.next()){
                incident = new Incident(rs.getInt("id"), rs.getString("label"));
            }
            return incident;

        } catch (SQLException e) {
            throw e;
        }
    }
}
