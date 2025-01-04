package by.tatevik.javapractice.task22.service;

import by.tatevik.javapractice.task22.entity.Planet;
import by.tatevik.javapractice.task22.entity.StarSystem;

public class StarSystemService {

    public void printPlanetAmmount(StarSystem starSystem){
        System.out.println("planet ammount " + starSystem.getPlanetArr().length);
    }

    public void  printStarName(StarSystem starSystem){
        System.out.println("star name: " + starSystem.getStar().getName());
    }

    public void addPlanet(StarSystem starSystem, Planet planet){
        int oldSize= starSystem.getPlanetArr().length;
       int size= oldSize + 1;
       Planet[] planetArr=new Planet[size];
       int index=0;
       while (index<oldSize){
           planetArr[index]=starSystem.getPlanetArr()[index];
           ++index;
       }
       planetArr[index]=planet;
       starSystem.setPlanetArr(planetArr);
    }
}
