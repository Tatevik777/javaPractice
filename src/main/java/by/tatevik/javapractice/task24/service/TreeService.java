package by.tatevik.javapractice.task24.service;

import by.tatevik.javapractice.task24.entity.Tree;

public class TreeService {

    public void printTree(Tree tree){
        System.out.println(tree);
    }
    public void bloom(Tree tree){
       tree.bloom();
    }

    public void isCoveredWithFrost(Tree tree) {
        tree.isCoveredWithFrost();
    }

    public void fallLeaves(Tree tree) {
        tree.fallLeaves();
    }

    public void turnYellow(Tree tree) {
      tree.turnYellow();
    }
}
