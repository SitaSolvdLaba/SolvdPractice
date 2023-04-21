package org.ClassHierarchy;

public class Crew extends Airlines{

    private String nameOfCrew;
    private String position;
    private int flight;

    public Crew(String name, String location, String nameAirlines, String contact, String nameOfCrew, String position, int flight) {
        super(name, location, nameAirlines, contact);
        this.nameOfCrew = nameOfCrew;
        this.position = position;
        this.flight = flight;
    }



    public String getNameOfCrew() {
        return nameOfCrew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    public void crewInfo(){
        System.out.println(name + ", " + location + ", " + nameAirlines + ", " + contact + ", " + nameOfCrew + ", " + position + ", " + flight);
    }
}
