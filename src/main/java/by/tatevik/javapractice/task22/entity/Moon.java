package by.tatevik.javapractice.task22.entity;

public class Moon {
    private String name;
    private int weight;

    public Moon(){

    }

    public Moon(String name, int weight){
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
        String MoonInfo;
        StringBuilder sb=new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(weight);
        MoonInfo=sb.toString();
        return MoonInfo;
    }
}
