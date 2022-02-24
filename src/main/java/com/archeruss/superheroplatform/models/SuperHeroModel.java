package com.archeruss.superheroplatform.models;


public class SuperHeroModel {

    public Integer id;
    public String name;
    public Integer incident1;
    public Integer incident2;
    public Integer incident3;
    public String longitude;
    public String latitude;
    public Integer telephone;

    public SuperHeroModel(String name, Integer incident1, Integer incident2, Integer incident3, String longitude, String latitude, Integer telephone) {
        this.name = name;
        this.incident1 = incident1;
        this.incident2 = incident2;
        this.incident3 = incident3;
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

    public Integer getIncident1() {
        return incident1;
    }

    public void setIncident1(Integer incident1) {
        this.incident1 = incident1;
    }

    public Integer getIncident2() {
        return incident2;
    }

    public void setIncident2(Integer incident2) {
        this.incident2 = incident2;
    }

    public Integer getIncident3() {
        return incident3;
    }

    public void setIncident3(Integer incident3) {
        this.incident3 = incident3;
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

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
}
