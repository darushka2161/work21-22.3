package com.company;

public class Main {

    public static void main(String[] args) {

        ChairsFactory chairsFactory = new Factory();
        Client client = new Client();
        System.out.println(client.Sit(chairsFactory.createMagicChair()));
        System.out.println(client.Sit(chairsFactory.createMultifunctionalChair()));
        System.out.println(client.Sit(chairsFactory.createVictorianChair()));
    }
}
