package org.launchcode;

import org.launchcode.comparators.AreaComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
//        NameComparator comparator = new NameComparator();


//        StateComparator comparator = new StateComparator();

//        PopulationComparator comparator = new PopulationComparator();

        AreaComparator comparator = new AreaComparator();

        cities.sort(comparator);

        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
