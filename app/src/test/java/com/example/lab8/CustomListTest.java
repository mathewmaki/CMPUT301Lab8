package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityList = new ArrayList<>();

    @Test
    public void testAddCity() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(1, list.getCount());

    }
    @Test
    public void testHasCity() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        assertEquals(false, list.hasCity(new City("Saskatoon", "Saskatchewan")));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList(null, cityList);
        assertEquals(0, list.countCities());
        City city1 = new City("Edmonton", "Alberta");
        list.addCity(city1);
        assertEquals(1, list.countCities());
        City city2 = new City("Saskatoon", "Saskatchewan");
        list.addCity(city2);
        assertEquals(2, list.countCities());
        list.deleteCity(city2);
        assertEquals(1, list.countCities());
    }

}
