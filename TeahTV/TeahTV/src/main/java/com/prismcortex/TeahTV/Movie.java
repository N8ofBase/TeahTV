package com.prismcortex.TeahTV;

import javax.persistence.Entity;

@Entity
public class Movie extends AbstractEntity{

    private String title;

    private int year_released;

    private String director;

    private String category;

    private String disc;

    private String location;

    public Movie() {

    }

    public Movie(String title, int year_released, String director, String category, String disc, String location) {
        this.title=title; this.year_released=year_released; this.director=director; this.category=category;
        this.disc=disc; this.location=location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear_released() {
        return year_released;
    }

    public void setYear_released(int year_released) {
        this.year_released = year_released;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {return title;}

}
