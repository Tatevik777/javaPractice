package by.tatevik.javapractice.task22.entity;

import java.util.Arrays;

public class StarSystem {
    private String name;
    private Star star;
    private Planet[] planetArr;

    public StarSystem(){}

    public StarSystem(String name,Star star,Planet[] planetArr){
        this.name=name;
        this.star=star;
        this.planetArr=planetArr;
    }

    public Planet[] getPlanetArr(){
        return planetArr;
    }

    public void setPlanetArr(Planet[] planetArr){
        this.planetArr=planetArr;
    }

    public Star getStar(){
        return star;
    }

    public void setStar(){
        this.star=star;
    }

    public String toString(){
        String systemInfo;
        StringBuilder sb=new StringBuilder();
        sb.append("Starsystem")
                .append(' ').append("name=").append(name).append('\'').append("\n ")
        .append(" stars in the system: ").append(star).append("\n ")
                .append("planets: ");
        int index=0;
        while (index<planetArr.length){
            sb.append(planetArr[index].getName()).append(' ');
            ++index;
        }
        sb.append('}');
        return sb.toString();
    }
}
