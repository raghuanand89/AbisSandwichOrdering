package com.abis.abissandwichordering.model;

import java.io.*;

public class Manager extends Person {
    private String managerEmail;

    public Manager(String firstname, String lastname, String managerEmail)  {
        super(firstname, lastname,null);
        this.managerEmail = managerEmail;
    }


    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    /*
    @Override
    String getFirstName() {
        return firstName;
    }

    @Override
    String getLastName() {
        return lastName;
    }

    @Override
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
*/



    public void addEntryToCSV(Sandwich sandwich) throws IOException {
        String entryToCSV = sandwich.sandwichType + ";" + sandwich.sandwichNameFR + ";" + sandwich.getSandwichContentFR() + ";" + sandwich.sandwichNameNL + ";" + sandwich.getSandwichContentNL() + ";" + sandwich.price;
        File file = new File("resources/inputsandwich.csv");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("\n" + entryToCSV);
        bw.close();
    }



}
