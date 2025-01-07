package by.tatevik.javapractice.task24.main;

import by.tatevik.javapractice.task24.entity.Tree;
import by.tatevik.javapractice.task24.service.TreeService;

public class Main {

    /*Создать объект класса Дерево, используя классы Лист, Ветка.
     Методы:
      1)зацвести
      2)опасть листьям
      3)покрыться инеем
      4)пожелтеть листьями.
     */

    public static void main(String[] args) {

        Tree tree =new Tree();
        TreeService treeService= new TreeService();
        treeService.printTree(tree);
        treeService.fallLeaves(tree);
        System.out.println(tree);
    }
}
