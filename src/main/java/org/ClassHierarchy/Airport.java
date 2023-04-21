package org.ClassHierarchy;

public class Airport {

    String name;
    String location;

    public Airport(String name, String location){
        this.name = name;
        this.location = location;
    }

    public void airportInfo(){
        System.out.println(name +", " + location);
    }


}
