package by.tatevik.javapractice.task24.entity;

import java.util.Arrays;

public class Leaf {

    private static int counter = 0;
    private int number;
    private LeafColour leafColour = LeafColour.GREEN;
    private boolean isFallen = Boolean.FALSE;

    public Leaf() {
        number = counter++;
    }

    public LeafColour getLeafColour() {
        return leafColour;
    }

    public void setLeafColour(LeafColour leafColour) {
        this.leafColour = leafColour;
    }

    public boolean isFallen() {
        return isFallen;
    }

    public void setFallen(boolean fallen) {
        isFallen = fallen;
    }

    public void isCoveredWithFrost() {
        System.out.println("лист номер" + number + " покрылся инеем");
    }

    public void fall() {
        isFallen=Boolean.TRUE;
        System.out.println("лист номер" + number + " опал");
    }

    public void turnYellow() {
        leafColour=LeafColour.YELLOW;
        System.out.println("лист номер" + number + " пожелтел");
    }


    @Override
    public String toString() {
        return "Leaf{" +
                "number=" + number +
                ", leafColour=" + leafColour +
                ", isFallen=" + isFallen +
                '}';
    }
}
