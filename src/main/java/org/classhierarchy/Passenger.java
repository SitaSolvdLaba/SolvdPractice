package org.classhierarchy;

import java.util.HashSet;
import java.util.Set;

public class Passenger extends Airport implements PassengerOperations{

    private String passengerName;
    private int id;

    public Passenger(String name, String location, String passengerName, int id) {
        super(name, location);
        this.passengerName = passengerName;
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected void getPassengerInfo(){
        System.out.println(name + ", " + location + ", " + passengerName + ", " + id);
    }


    @Override
    public void addFlight(String flightNumber) {
        System.out.println("Add " + flightNumber + " to id 75485961");
    }

    @Override
    public void cancelReservations(int reservation) {
        System.out.println("Cancel " + reservation + " reservation to id 4758126694");
    }

    Set<Passenger> passengers = new HashSet<Passenger>();
}
