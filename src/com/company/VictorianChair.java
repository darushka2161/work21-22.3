package com.company;

public class VictorianChair implements Chairs{
    protected String type_of_chair;

    public VictorianChair(){}

    public void create()
    {
        type_of_chair = "VictorianChair";
    }

    public String type_of_chair()
    {
        return type_of_chair;
    }
}