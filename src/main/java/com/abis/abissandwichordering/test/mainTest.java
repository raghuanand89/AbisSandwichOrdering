package com.abis.abissandwichordering.test;

import com.abis.abissandwichordering.exceptions.MaxLimitReachedException;
import com.abis.abissandwichordering.model.*;
import com.abis.abissandwichordering.repository.OrderRepository;
import com.abis.abissandwichordering.repository.PersonRepository;
import com.abis.abissandwichordering.repository.SandwichRepository;

import java.io.IOException;

public class mainTest {
    public static void main(String[] args) throws IOException, MaxLimitReachedException {
/*        Sandwich sandwich = new SpecialSandwich();

        SpecialSandwich specialSandwich = new SpecialSandwich("Special","Cocktail","ouef, sauce cocktail, crudites","Cocktail","eiren, cocktailsaus, salade",5.75);
        Sandwich normalSandwich = new NormalSandwich("Cheese", "Emmental fromage", "Emmental kaas", 3.90);

 */
// load sandwiches from input file
        SandwichRepository sandwichRepository = new SandwichRepository();
// load persons directly from constructor - hardcoded
        PersonRepository personRepository = new PersonRepository();
// instantiate OrderRepository to add individual orders
        OrderRepository orderRepository = new OrderRepository();
// create one order : one order is one per ordering person
        Order order1 = new Order();
// ready sandwich1
        Sandwich sandwich1 = sandwichRepository.getSandwichByNameFromRepository("gouda");
        sandwich1.setBreadType(BreadType.BROWN);
        sandwich1.setHasSalad(true);
        order1.addNewOrder(personRepository.getStudentByName("raghunath", "singh"), sandwich1 );
// ready sandwich2
        Sandwich sandwich2 = sandwichRepository.getSandwichByNameFromRepository("PINKY");
        sandwich2.setBreadType(BreadType.WHITE);

        order1.addSandwich(sandwich2);
//      System.out.println(order1);
        orderRepository.addOrder(order1);

        Order order2 = new Order();
        order2.addNewOrder(personRepository.getStudentByName("patrick", "garain"), sandwichRepository.getSandwichByNameFromRepository("gouda"));
        orderRepository.addOrder(order2);

        // ready sandwich3
        Sandwich sandwich3 = sandwichRepository.getSandwichByNameFromRepository("florida");
        sandwich3.setBreadType(BreadType.BROWN);

        Order order3 = new Order();
        order3.addNewOrder(personRepository.getStudentByName("alain", "vitry"), sandwichRepository.getSandwichByNameFromRepository("salami"), "no egg in sandwich");
        order3.addSandwich(sandwich3);
        orderRepository.addOrder(order3);
//      System.out.println(order2);

//        System.out.println(orderRepository);
        orderRepository.printAllOrdersFromOrderRepository();


        //manager.addEntryToCSV(specialSandwich);
        //manager.addEntryToCSV(normalSandwich);
/*
        Person manager1 = new Manager("Hailey", "Reeds", "h-reeds@gmail.com");
        ((Manager)manager1).addEntryToCSV(new Sandwich("Special","Cheesy-FR","Contents-FR","Cheesy-NL","Contents-NL",5.50));

        System.out.println(personRepository.getStudentsByCourse("java"));
//        System.out.println(personRepository.getStudentsByCourse("c++"));


 */







    }
}
