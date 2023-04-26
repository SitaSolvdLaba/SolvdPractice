package org.classhierarchy;

public class Security extends Airport {

    String securityCheckpoint;

    public Security(String name, String location, String securityCheckpoint) {
        super(name, location);
        this.securityCheckpoint = securityCheckpoint;
    }

    protected void getSecurityInfo(){
        System.out.println(name + ", " + location + ", " + securityCheckpoint);
    }
}
