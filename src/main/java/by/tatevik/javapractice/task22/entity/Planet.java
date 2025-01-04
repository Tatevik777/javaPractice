package by.tatevik.javapractice.task22.entity;

import java.util.Arrays;

public class Planet {
    private String name;
    private int weight;
    private Moon[] moonArr;

    public Planet(){

    }

    public Planet(String name, int weight, Moon[] moonArr){
        this.name=name;
        this.weight=weight;
        this.moonArr=moonArr;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public Moon[] getMoonArr(){
        return moonArr;
    }

    public void setMoonArr(Moon[] moonArr){
        this.moonArr=moonArr;
    }

    public String toString(){
        String planetInfo;
        StringBuilder sb=new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(weight);
        sb.append(" ");
        sb.append(Arrays.toString(moonArr));
        planetInfo=sb.toString();
        return planetInfo;
    }
}
