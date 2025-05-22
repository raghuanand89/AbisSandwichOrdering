package com.abis.abissandwichordering.repository;

import com.abis.abissandwichordering.model.Order;
import com.abis.abissandwichordering.model.Sandwich;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class OrderRepository {
    ArrayList<Order> orders = new ArrayList<Order>();

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public String toString() {
        return "OrderRepository{" +
                "orders=" + orders +
                '}';
    }

    public void printAllOrdersFromOrderRepository() throws IOException {
        File orderfile = new File("resources/outputorder.txt");
        File logfile = new File("resources/logfile.txt");


        FileWriter fileorderWriter = new FileWriter(orderfile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileorderWriter);

        FileWriter filelogWriter = new FileWriter(logfile, true);
        BufferedWriter bufferedlogWriter = new BufferedWriter(filelogWriter);


        System.out.println(String.format("%1$-10s%2$-15s%3$-10s%4$-15s%5$-15s%6$-20s%7$-50s%8$-10s", "Last Name", "First Name", "Course", "Sandwich Type", "Bread Type", "Sandwich Name", "Description", "Salad?"));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");


        for (Order order : orders) {
            for (Sandwich sandwich : order.getSandwiches()) {
                String stringToWrite = String.format("%1$-10s%2$-15s%3$-10s%4$-15s%5$-15s%6$-20s%7$-50s%8$-10s",
                        order.getPerson().getLastName().toUpperCase(),
                        order.getPerson().getFirstName(),
                        order.getPerson().getCourseName(),
                        sandwich.getSandwichType(),
                        sandwich.getBreadType(),
                        sandwich.getSandwichNameNL(),
                        sandwich.getSandwichContentNL(),
                        sandwich.getHasSalad(),
                        order.getOrderRemarks()
                );
                bufferedWriter.write(stringToWrite);
                bufferedWriter.newLine();

                Date date = new Date();
                Timestamp ts = new Timestamp(date.getTime());

                bufferedlogWriter.write(ts + ";" + order.getPerson().getLastName().toUpperCase()
                        + ";" + order.getPerson().getFirstName()
                        + ";" + order.getPerson().getCourseName()
                        + ";" + sandwich.getSandwichType()
                        + ";" + sandwich.getBreadType()
                        + ";" + sandwich.getSandwichNameNL()
                        + ";" + sandwich.getSandwichContentNL()
                        + ";" + sandwich.getHasSalad()
                        + ";" + sandwich.getPrice()
                        + ";" + order.getOrderRemarks());
                bufferedlogWriter.newLine();


                System.out.println(String.format("%1$-10s%2$-15s%3$-10s%4$-15s%5$-15s%6$-20s%7$-50s%8$-10s",
                        order.getPerson().getLastName().toUpperCase(),
                        order.getPerson().getFirstName(),
                        order.getPerson().getCourseName(),
                        sandwich.getSandwichType(),
                        sandwich.getBreadType(),
                        sandwich.getSandwichNameNL(),
                        sandwich.getSandwichContentNL(),
                        sandwich.getHasSalad(),
                        order.getOrderRemarks()
                ));

            }


        }
        bufferedWriter.close();
        bufferedlogWriter.close();
    }

}
