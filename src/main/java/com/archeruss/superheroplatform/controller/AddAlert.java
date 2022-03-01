package com.archeruss.superheroplatform.controller;

import com.archeruss.superheroplatform.repository.CityRepository;
import com.archeruss.superheroplatform.repository.IncidentRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.sql.SQLException;

@Path("/add-alert")
@WebServlet(name = "add-alert", value = "/add-alert")

public class AddAlert extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    @GET
    @Produces("text/html")
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        IncidentRepository incidentRepo = new IncidentRepository();
        CityRepository cityRepository = new CityRepository();

        try {
            req.setAttribute("allIncidents", incidentRepo.getAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            req.setAttribute("villes", cityRepository.getAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("pages/addAlert.jsp").forward(req, res);

    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
    }
}
