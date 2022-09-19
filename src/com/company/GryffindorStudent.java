package com.company;

public class GryffindorStudent extends HogwartsStudent {
    private int nobility;//
    private int honor;
    private int bravery;

    public GryffindorStudent(String fullName, int transgress, int magic, int nobility, int honor, int bravery) {
        super(fullName, transgress,magic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int ability() {
        return nobility + honor + bravery;
    }

    public void compareGryffindor(GryffindorStudent gryffindorStudent) {
        int ability1 = this.ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Грифиндорец %s лучше чем грифиндорец %s: %d VS %d%n", getFullName(), gryffindorStudent.getFullName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Грифиндорец %s лучше чем грифиндорец %s: %d VS %d%n", gryffindorStudent.getFullName(), getFullName(), ability2, ability1);
        } else {
            System.out.printf("Грифиндорец %s такой же, как грифиндорец %s: %d VS %d%n", gryffindorStudent.getFullName(), getFullName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; блогородство: %d; честь: %d; храбрость: %d;", super.toString(), nobility, honor, bravery);
    }
}
