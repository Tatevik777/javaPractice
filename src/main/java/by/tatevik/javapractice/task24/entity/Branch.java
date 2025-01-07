package by.tatevik.javapractice.task24.entity;

import java.util.Arrays;

public class Branch {

    private static int counter = 0;
    private int number;
    private Leaf[] leaves;


    public Branch() {

        number = ++counter;

        int leafAmmount = (int) (Math.random() * 20);

        Leaf[] leaves = new Leaf[leafAmmount];

        for (int i = 0; i < leaves.length; i++) {
            leaves[i] = new Leaf();
        }

        this.leaves=leaves;
    }

    public Leaf[] getLeaves() {
        return leaves;
    }

    public void isCoveredWithFrost() {
        System.out.println("\n ветка номер" + number + " покрылась инеем");

        for (int i = 0; i < leaves.length; i++) {
            leaves[i].isCoveredWithFrost();
        }
    }

    public void fallLeaves() {
        System.out.println("\n ветка номер" + number + " сбросила листья");
        for (int i = 0; i < leaves.length; i++) {
            leaves[i].fall();
        }
    }

    public void turnYellow() {
        System.out.println("\n ветка номер" + number + " пожелтела ");
        for (int i = 0; i < leaves.length; i++) {
            leaves[i].turnYellow();
        }
    }

    @Override
    public String toString() {
        return "Branch{" +
                "number=" + number +
                ", leaves=" + Arrays.toString(leaves) +
                '}';
    }
}