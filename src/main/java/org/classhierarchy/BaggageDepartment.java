package org.classhierarchy;

import java.util.LinkedList;
import java.util.Queue;

public class BaggageDepartment extends Airport {

    private int quantityCheckedIn;
    private double weight;

    public BaggageDepartment(String name, String location, int quantityCheckedIn, double weight) {
        super(name, location);
        this.quantityCheckedIn = quantityCheckedIn;
        this.weight = weight;
    }

    public int getQuantityCheckedIn() {
        return quantityCheckedIn;
    }

    public void setQuantityCheckedIn(int quantityCheckedIn) {
        this.quantityCheckedIn = quantityCheckedIn;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getBaggageInfo() {
        System.out.println(name + ", " + location + ", " + quantityCheckedIn + ", " + weight);
    }


    Queue<String> baggageQueue = new LinkedList<String>();

}
