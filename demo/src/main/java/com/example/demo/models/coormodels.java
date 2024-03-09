package com.example.demo.models;

import java.util.List;

public class coormodels {
    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getMode_name() {
        return mode_name;
    }

    public void setMode_name(String mode_name) {
        this.mode_name = mode_name;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public List<List<Double>> getLoc() {
        return loc;
    }

    public void setLoc(List<List<Double>> loc) {
        this.loc = loc;
    }

    private double id;
    private String mode_name;
    private String frame;
    private List<List<Double>> loc;
}
