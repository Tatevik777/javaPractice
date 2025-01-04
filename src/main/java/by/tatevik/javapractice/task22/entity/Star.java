package by.tatevik.javapractice.task22.entity;

public class Star {

    private String name;

    private int weight;

    public Star(){
    }

    public Star(String name, int weight){
        this.name=name;
        this.weight=weight;
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

    public String toString(){
        String starInfo;
        StringBuilder sb=new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append("weight").append(' ');
        sb.append(weight);
        starInfo=sb.toString();
        return starInfo;
    }
}
