package org.classhierarchy;

public class Airport {

    String name;
    String location;

    public Airport(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void getAirportInfo() {
        System.out.println(name + ", " + location);
    }


}
