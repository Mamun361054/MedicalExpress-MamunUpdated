package com.ador.medicalexpress;

/**
 * Created by DORBESH on 12/27/2016.
 */

public class Hospital {

    private String h_name,h_status,h_open,h_phone,lat,lng;
    private int h__img;

    public Hospital(String h_name, String h_status, String h_open, String h_phone, int h__img) {
        this.h_name = h_name;
        this.h_status = h_status;
        this.h_open = h_open;
        this.h_phone = h_phone;
        this.h__img = h__img;
    }

    public Hospital(String h_name, String h_status, String h_open, String h_phone, int h__img, String lat, String lng) {
        this.h_name = h_name;
        this.h_status = h_status;
        this.h_open = h_open;
        this.h_phone = h_phone;
        this.h__img = h__img;
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }


    public String getH_name() {

        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    public String getH_status() {
        return h_status;
    }

    public void setH_status(String h_status) {
        this.h_status = h_status;
    }

    public String getH_open() {
        return h_open;
    }

    public void setH_open(String h_open) {
        this.h_open = h_open;
    }

    public String getH_phone() {
        return h_phone;
    }

    public void setH_phone(String h_phone) {
        this.h_phone = h_phone;
    }

    public int getH__img() {
        return h__img;
    }

    public void setH__img(int h__img) {
        this.h__img = h__img;
    }
}
