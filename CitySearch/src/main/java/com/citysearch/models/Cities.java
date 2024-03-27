package com.citysearch.models;

import java.util.List;

public class Cities {
    private final List<String> cityList;

    public Cities() {
        this.cityList = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valencia",
                "Vancouver", "Amsterdam", "Vienna", "Sydney", "New York City", "London", "Bangkok",
                "Hong Kong","Dubai", "Rome", "Istanbul");

    }

    public List<String> getCities() {
        return cityList;
    }
}
