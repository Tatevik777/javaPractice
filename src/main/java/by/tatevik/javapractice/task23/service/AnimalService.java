package by.tatevik.javapractice.task23.service;

import by.tatevik.javapractice.task23.entity.Puppy;

public class AnimalService {

    public void printName(Puppy puppy){
        System.out.println(puppy.getName());
    }

    public void makeSound(Puppy puppy){
    puppy.makeSound();
    }

    public void jump(Puppy puppy){
        puppy.jump();
    }

    public void run(Puppy puppy){
        puppy.run();
    }
    public void bite(Puppy puppy){
        puppy.toBite();
    }

    public void tryToRemoveCollar(Puppy puppy){
        puppy.tryToRemoveBabyCollar();

    }
}
