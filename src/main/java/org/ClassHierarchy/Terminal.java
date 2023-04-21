package org.ClassHierarchy;

public class Terminal extends  Airport {

    String terminalNumber;
    int capacity;
    String airlines;

    public Terminal(String name, String location, String terminalNumber, int capacity, String airlines) {
        super(name, location);
        this.terminalNumber = terminalNumber;
        this.capacity = capacity;
        this.airlines = airlines;
    }

    public void terminalInfo(){
        System.out.println(name + ", " + location + ", " + terminalNumber + ", " + capacity + ", " + airlines);
    }
}