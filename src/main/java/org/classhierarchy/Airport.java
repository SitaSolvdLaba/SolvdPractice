package org.classhierarchy;

public class Airport implements AirportOperations {

    String name;
    String location;

    public Airport(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void getAirportInfo() {
        System.out.println(name + ", " + location);
    }



    @Override
    public void scheduleFlight(String flight) {
        System.out.println(flight + " is scheduled");
    }

    @Override
    public void cancelFlight(String flight) {
        System.out.println(flight + " is canceled");
    }
}
