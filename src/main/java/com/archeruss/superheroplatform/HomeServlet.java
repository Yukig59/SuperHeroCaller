package com.archeruss.superheroplatform;

import com.archeruss.superheroplatform.models.Incident;
import com.archeruss.superheroplatform.repository.IncidentRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "homeServlet", value = "/")
public class HomeServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IncidentRepository incidentRepo = new IncidentRepository();

        try {
            req.setAttribute("allIncidents", incidentRepo.getAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}