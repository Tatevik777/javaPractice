package by.tatevik.javapractice.task24.entity;

import java.util.Arrays;

public class Tree {

    private Branch[] branches;

    public Branch[] getBranches() {
        return branches;
    }

    public Tree(){

        int branchAmmount = 5 + (int) Math.random() * 35;

        Branch[] branches = new Branch[branchAmmount];
        for (int i = 0; i < branches.length; i++) {
            branches[i] = new Branch();
        }

        this.branches=branches;
    }

    public void bloom(){
        System.out.println("дерево зацвело");
    }

    public void isCoveredWithFrost() {
        System.out.println("дерево покрывается инеем");
        for (int i = 0; i < branches.length; i++) {
            branches[i].isCoveredWithFrost();
        }
    }

    public void fallLeaves() {
        System.out.println("дерево сбросило листья");
        for (int i = 0; i < branches.length; i++) {
            branches[i].fallLeaves();
        }
    }

    public void turnYellow() {
        System.out.println("дерево  пожелтело");
        for (int i = 0; i < branches.length; i++) {
            branches[i].turnYellow();
        }
    }


    @Override
    public String toString() {
        return "Tree{" +
                "branches=" + Arrays.toString(branches) +
                '}';
    }
}
