package com.abis.abissandwichordering.repository;

import com.abis.abissandwichordering.model.BreadType;
import com.abis.abissandwichordering.model.Sandwich;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SandwichRepository {
    ArrayList<Sandwich> sandwiches = new ArrayList<>();

    public SandwichRepository() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("resources/inputsandwich.csv"));
        // Read and ignore title
        br.readLine();
        int i = 0;
        String readLine;
        while ((readLine = br.readLine()) != null) {
            String[] values = readLine.split(";");
            //Type;NameFR;ContentFR;NameNL;ContentNL;Price


            Sandwich sandwich = new Sandwich(values[0], values[1], values[2], values[3], values[4], Double.parseDouble(values[5]), BreadType.WHITE);
            sandwiches.add(sandwich);


        }
//        System.out.println(sandwiches);



    }

    public Sandwich getSandwichByNameFromRepository(String sname) {
        return (sandwiches.stream().filter(s1 -> s1.getSandwichNameNL().equalsIgnoreCase(sname) || s1.getSandwichNameFR().equalsIgnoreCase(sname))
                .findFirst().orElseThrow(() -> new RuntimeException("sandwich not found!")));

    }



}

