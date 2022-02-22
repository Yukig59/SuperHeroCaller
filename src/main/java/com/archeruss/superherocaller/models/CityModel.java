package com.archeruss.superherocaller.models;

import sun.jvm.hotspot.ui.tree.CStringTreeNodeAdapter;

public class CityModel {
    private Integer id;
    private String longitude;
    private String latitude;
    private String incident;

    public CityModel(Integer id, String longitude, String latitude, String incident) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.incident = incident;
    }

    public CityModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getIncident() {
        return incident;
    }

    public void setIncident(String incident) {
        this.incident = incident;
    }
}
