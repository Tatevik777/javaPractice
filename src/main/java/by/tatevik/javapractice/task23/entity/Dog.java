package by.tatevik.javapractice.task23.entity;

public abstract class Dog extends Animal{

    private String sound;

    public Dog(String name, String sound){
        super(name);
        this.sound=sound;
    }

    public void makeSound(){
        System.out.println(" Dog makes sound " + sound);
    }

    public void jump(){
        System.out.println(" jump ");
    }

    public void run(){
        System.out.println(" run ");
    }

    public void toBite(){
        System.out.println(" bite ");
    }
}
