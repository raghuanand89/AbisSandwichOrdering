package com.abis.abissandwichordering.model;

import com.abis.abissandwichordering.exceptions.MaxLimitReachedException;

import java.util.ArrayList;

public class Order {
    Person person;
    ArrayList<Sandwich> sandwiches =  new ArrayList<>();
    String orderRemarks;

    public void addNewOrder(Person person, Sandwich sandwich, String orderRemarks) {
        this.person = person;

        if (sandwiches.size() < 2) {
            sandwiches.add(sandwich);
        } else {
            throw new RuntimeException("Maximum sandwiches reached (2)");
        }

        this.orderRemarks = orderRemarks;
    }

    public void addNewOrder(Person person, Sandwich sandwich) {
        this.person = person;
        if (sandwiches.size() < 2) {
            sandwiches.add(sandwich);
        } else {
            throw new RuntimeException("Maximum sandwiches reached (2)");
        }
    }
    public void addSandwich(Sandwich sandwich) throws MaxLimitReachedException {
        if (sandwiches.size() < 2) {
            sandwiches.add(sandwich);
        } else {
            throw new MaxLimitReachedException("Maximum sandwiches reached (2)");
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "person=" + person +
                ", sandwiches=" + sandwiches +
                ", orderRemarks='" + orderRemarks + '\'' +
                '}';
    }

    void setBreadTypeWHITE(BreadType breadType) {
        breadType = BreadType.WHITE;
    }

    void setBreadTypeBROWN(BreadType breadType) {
        breadType = BreadType.BROWN;
    }

    public Person getPerson() {
        return person;
    }

    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }


    public String getOrderRemarks() {
        return orderRemarks;
    }


    public void setPerson(Person person) {
        this.person = person;
    }

    public void setSandwiches(ArrayList<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }


    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks;
    }


}
