package by.tatevik.javapractice.task23.entity;

public class Puppy extends Dog{

    public Puppy(String name, String sound){
        super(name,sound);


    }

    public void tryToRemoveBabyCollar(){
        System.out.println(" Puppy tries to remove collar ");
    }
}
