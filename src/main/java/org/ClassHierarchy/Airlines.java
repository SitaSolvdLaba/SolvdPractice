package org.ClassHierarchy;

public class Airlines extends Airport {

    String nameAirlines;
    String contact;

    public Airlines(String name, String location, String nameAirlines, String contact) {
        super(name, location);
        this.nameAirlines = nameAirlines;
        this.contact = contact;
    }
    public void airlinesInfo(){
        System.out.println(name + ", " + location + ", " + nameAirlines + ", " + contact);
    }


}
