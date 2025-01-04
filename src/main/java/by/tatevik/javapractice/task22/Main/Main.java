package by.tatevik.javapractice.task22.Main;

import by.tatevik.javapractice.task22.entity.Moon;
import by.tatevik.javapractice.task22.entity.Planet;
import by.tatevik.javapractice.task22.entity.Star;
import by.tatevik.javapractice.task22.entity.StarSystem;
import by.tatevik.javapractice.task22.service.StarSystemService;

public class Main {

      /*
    task19.
    Создать объект класса «Звездная система», используя классы «Планета»,
     «Звезда», «Луна». Методы: 1) выводит на консоль количество планет в
     звездной системе, 2) выводит название звезды, 3) добавляет планеты в систему.
    */

    public static void main(String[] args) {

        Star star=new Star("Sirius",4532708);

        Moon moonPL1=new Moon("Moon-555",44080809);
        Moon moonPL2=new Moon("Moon-777",34080809);

        Moon[]  moonsArr=new Moon[2];
        moonsArr[0]=moonPL1;
        moonsArr[1]=moonPL2;

        Planet planet1=new Planet("Earth-5",100067687,moonsArr);

        Planet planet2=new Planet();
        planet2.setName("Mars");
        planet2.setWeight(45676978);

        Planet planet3=new Planet("Jupiter",965965960, moonsArr);

        Planet[] planetArr = new Planet[3];
        planetArr[0]=planet1;
        planetArr[1]=planet2;
        planetArr[2]=planet3;

        StarSystem starSystem=new StarSystem("G-55",star,planetArr);
        System.out.println(starSystem);

        StarSystemService starSystemService=new StarSystemService();
        starSystemService.printPlanetAmmount(starSystem);
        starSystemService.printStarName(starSystem);

        Planet planet4=new Planet();
        planet4.setName("Saturn");
        planet4.setWeight(4566646);

        starSystemService.addPlanet(starSystem,planet4);

        System.out.println(starSystem);
        starSystemService.printPlanetAmmount(starSystem);
        starSystemService.printStarName(starSystem);


}}
