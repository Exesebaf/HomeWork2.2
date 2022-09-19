package com.company;

public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public RavenclawStudent(String fullName, int transgress, int magic, int smart, int wise, int witty, int creativity) {
        super(fullName, transgress,magic);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int ability() {
        return smart + wise + witty + creativity;
    }

    public void companyRavenclaw(RavenclawStudent ravenclawStudent) {
        int ability1 = this.ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше чем когтевранец %s: %d VS %d%n", getFullName(), ravenclawStudent.getFullName(), ability1, ability2);
        }else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше чем когтевранец %s: %d VS %d%n", ravenclawStudent.getFullName(), getFullName(), ability2, ability1);
        } else {
            System.out.printf("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n", ravenclawStudent.getFullName(), getFullName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; остроумие: %d; творцество: %d;", super.toString(), smart, wise, witty, creativity);
    }
}
