package org.classhierarchy;

final class Terminal extends  Airport {

    String terminalNumber;
    final int capacity;
    String airlines;

    public Terminal(String name, String location, String terminalNumber, int capacity, String airlines) {
        super(name, location);
        this.terminalNumber = terminalNumber;
        this.capacity = capacity;
        this.airlines = airlines;
    }

    public void getTerminalInfo(){
        System.out.println(name + ", " + location + ", " + terminalNumber + ", " + capacity + ", " + airlines);
    }
}
