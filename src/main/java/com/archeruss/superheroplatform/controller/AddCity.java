package com.archeruss.superheroplatform.controller;

import com.archeruss.superheroplatform.models.CityModel;
import com.archeruss.superheroplatform.models.SuperHeroModel;
import com.archeruss.superheroplatform.repository.CityRepository;
import com.archeruss.superheroplatform.repository.SuperheroRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.sql.SQLException;


@Path("/add-city")
@WebServlet(name = "add-city", value = "/add-city")
public class AddCity extends HttpServlet {
   @Override
   public void init() throws ServletException {
      super.init();

   }
   @Override
   @GET
   @Produces("text/html")
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");

      req.getRequestDispatcher("pages/addCity.jsp").forward(req, res);
   }
   @POST
   @Produces("text/html")
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String name = req.getParameter("name");
      String longitude = req.getParameter("longitude");
      String latitude = req.getParameter("latitude");

      CityModel city = new CityModel(name,longitude,latitude);
      try {
         CityRepository repo = new CityRepository();
         repo.createCity(city);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      req.setCharacterEncoding("UTF-8");

      this.doGet(req, res);

   }
}
