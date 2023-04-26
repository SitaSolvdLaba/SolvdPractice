package org.classhierarchy;

public class BoardingPass extends Airlines {

    private String passengerName;
    private int seatNumber;
    private String arrival;
    protected String arrivalTime;

    public BoardingPass(String name, String location, String nameAirlines, String contact, String passengerName, int seatNumber, String arrival, String arrivalTime) {
        super(name, location, nameAirlines, contact);
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.arrival = arrival;
        this.arrivalTime = arrivalTime;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void getBoardingPassInfo() {
        System.out.println(name + ", " + location + ", " + nameAirlines + ", " + contact + ", " + passengerName + ", " + seatNumber);
    }


    @Override
    protected void fly() {
        System.out.println(passengerName + " arrives at " + arrivalTime);
    }
}
