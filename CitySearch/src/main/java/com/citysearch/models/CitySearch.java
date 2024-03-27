package com.citysearch.models;

import java.util.Collections;
import java.util.List;

public class CitySearch {
    public static List<String> search(String inputString) {
        List<String> result = Collections.emptyList();
        Cities cities = new Cities();
        List<String> cityList = cities.getCities();
        if(inputString.length() >= 2)
        {
            result = cityList.stream()
                    .filter(city -> city.toLowerCase().contains(inputString.toLowerCase()))
                    .toList();
        }
        if(inputString.equals("*")) result = cityList;
        return result;

    }
}
