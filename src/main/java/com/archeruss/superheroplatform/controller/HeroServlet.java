package com.archeruss.superheroplatform.controller;

import com.archeruss.superheroplatform.models.SuperHeroModel;
import com.archeruss.superheroplatform.repository.SuperheroRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "hero", value = "/hero")
public class HeroServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SuperheroRepository heroReop = new SuperheroRepository();
        List<SuperHeroModel> heroList = null;
        try {
            heroList = heroReop.getAllHeros();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("heroList", heroList);
        request.getRequestDispatcher("pages/allHeros.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("heroName");
        Integer Tel = Integer.valueOf(request.getParameter("telephone"));
        String longitude = request.getParameter("longitude");
        String latitude = request.getParameter("latitude");
        Integer incident1 = Integer.valueOf(request.getParameter("incident1"));
        Integer incident2 = Integer.valueOf(request.getParameter("incident2"));
        Integer incident3 = Integer.valueOf(request.getParameter("incident3"));
        SuperHeroModel hero = new SuperHeroModel(name, incident1, incident2, incident3, longitude, latitude, Tel);
        try {
            SuperheroRepository repo = new SuperheroRepository();
            repo.createHero(hero);
            this.doGet(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void destroy() {
    }
}