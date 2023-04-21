package org.ClassHierarchy;

public class Passenger extends Airport {

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

    public  void passengerInfo(){
        System.out.println(name + ", " + location + ", " + passengerName + ", " + id);
    }


}
