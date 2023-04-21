package org.ClassHierarchy;

public class Security extends Airport {

    String securityCheckpoint;

    public Security(String name, String location, String securityCheckpoint) {
        super(name, location);
        this.securityCheckpoint = securityCheckpoint;
    }

    public void securityInfo(){
        System.out.println(name + ", " + location + ", " + securityCheckpoint);
    }
}
