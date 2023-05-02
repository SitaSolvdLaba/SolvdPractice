package org.classhierarchy;

import java.util.ArrayList;
import java.util.List;

public class Flight extends Airlines implements FlightOperations{

    private int flightNumber;
    private String departureTime;
    private String gate;

    public Flight(String name, String location, String nameAirlines, String contact, int flightNumber, String departureTime, String gate) {
        super(name, location, nameAirlines, contact);
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.gate = gate;
    }

    public  void getFlightInfo(){
        System.out.println(name + ", " + location + ", " + nameAirlines + ", " + contact + ", " + flightNumber + ", "+ departureTime + ", " + gate);
    }


    public int getFlightNumber(){
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    @Override
    public void addPassenger(String passengerId) {
        System.out.println("Add " + passengerId + " to flight");
    }

    @Override
    public void removePassenger(String passengerId) {
        System.out.println("Remove " + passengerId + " + from flight");

    }

    List<Flight> flights = new ArrayList<Flight>();


}
