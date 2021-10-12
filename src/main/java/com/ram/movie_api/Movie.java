package com.ram.movie_api;

import org.springframework.context.annotation.EnableMBeanExport;

public class Movie {
    private final long id;
    private final String name;
    private final String actor;
    private final String year;

    public Movie(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.actor = builder.name;
        this.year = builder.year;
    }

    public static class Builder{
        private  long id;
        private  String name;
        private  String actor;
        private  String year;

        public Builder id(long id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder actor(String actor){
            this.actor = actor;
            return this;
        }
        public Builder year(String year){
            this.year = year;
            return this;
        }

        public Movie build(){
            return new Movie(this);
        }

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getActor() {
        return actor;
    }

    public String getYear() {
        return year;
    }
}
