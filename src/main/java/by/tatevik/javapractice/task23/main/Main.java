package by.tatevik.javapractice.task23.main;

import by.tatevik.javapractice.task23.entity.Puppy;
import by.tatevik.javapractice.task23.service.AnimalService;

public class Main {
    /*
    Создать объект класса «Щенок», используя классы «Животное», «Собака».
     Методы:
     1)выводит на консоль имя
     2)подать голос
     3)прыгать
     4)бегать
     5)кусать
      )пытаться снять «детский» ошейник
    */
    public static void main(String[] args) {

        Puppy puppy=new Puppy("Jack","Woofff");
        AnimalService animalService=new AnimalService();

        animalService.printName(puppy);
        animalService.jump(puppy);
        animalService.bite(puppy);
        animalService.run(puppy);
        animalService.tryToRemoveCollar(puppy);

    }
}
