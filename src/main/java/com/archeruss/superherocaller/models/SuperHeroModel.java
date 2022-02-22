package com.archeruss.superherocaller.models;


import java.util.List;

public class SuperHeroModel {

    private Integer id;
    private String name;
    private List incidents;
    private String longitude;
    private String latitude;
    private String telephone;

    public SuperHeroModel(Integer id, String name, List incidents, String longitude, String latitude, String telephone) {
        this.id = id;
        this.name = name;
        this.incidents = incidents;
        this.longitude = longitude;
        this.latitude = latitude;
        this.telephone = telephone;
    }

    public SuperHeroModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getIncidents() {
        return incidents;
    }

    public void setIncidents(List incidents) {
        this.incidents = incidents;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
