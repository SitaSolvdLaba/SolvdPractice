package org.classhierarchy;

public class Seat extends Passenger {

    String classType;
    int seatNumber;

    public Seat(String name, String location, String passengerName, int id, String classType, int seatNumber) {
        super(name, location, passengerName, id);
        this.classType = classType;
        this.seatNumber = seatNumber;
    }

    public  void getSeatInfo(){
        System.out.println(name + ", " + location + ", " + getPassengerName() + ", " + getId() + ", "  + classType + ", " + seatNumber);
    }
}
