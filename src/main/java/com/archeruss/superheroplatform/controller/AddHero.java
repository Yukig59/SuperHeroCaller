package com.archeruss.superheroplatform.controller;

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

@Path("/add-hero")
@WebServlet(name = "add-hero", value = "/add-hero")

public class AddHero extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    @GET
    @Produces("text/html")
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        IncidentRepository incidentRepo = new IncidentRepository();

        try {
            req.setAttribute("allIncidents", incidentRepo.getAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setCharacterEncoding("UTF-8");

        req.getRequestDispatcher("pages/addHeros.jsp").forward(req, res);

    }
}
