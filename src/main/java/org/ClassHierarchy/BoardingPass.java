package org.ClassHierarchy;

public class BoardingPass extends Airlines {

    private String passengerName;
    private int seatNumber;

    private String arrival;

    public BoardingPass(String name, String location, String nameAirlines, String contact, String passengerName, int seatNumber) {
        super(name, location, nameAirlines, contact);
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
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

    public void boardingPassInfo(){
        System.out.println(name + ", " + location + ", " + nameAirlines + ", " + contact + ", " + passengerName + ", " + seatNumber);
    }

}
