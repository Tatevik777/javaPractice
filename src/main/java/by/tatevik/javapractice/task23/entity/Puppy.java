package by.tatevik.javapractice.task23.entity;

public class Puppy extends Dog{

    public Puppy(String name, String sound){
        super(name,sound);


    }

    public void tryToRemoveBabyCollar(){
        System.out.println(" Puppy" + getName()+" tries to remove collar ");
    }
}
