package com.archeruss.superheroplatform.models;

public class Incident {
    public Integer id;
    public String label;

    public Incident(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Incident() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
