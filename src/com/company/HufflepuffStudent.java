package com.company;

public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String fullName, int transgress, int magic, int hardworking, int loyal, int honest) {
        super(fullName, transgress,magic);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    private int ability() {
        return hardworking + loyal + honest;
    }

    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int ability1 = this.ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуфферндуец %s лучше чем пуфферндуец %s: %d VS %d%n", getFullName(), hufflepuffStudent.getFullName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуфферндуец %s лучше чем пуфферндуец %s: %d VS %d%n", hufflepuffStudent.getFullName(), getFullName(), ability2, ability1);
        } else {
            System.out.printf("Пуфферндуец %s такой же, как пуфферндуец %s: %d VS %d%n", hufflepuffStudent.getFullName(), getFullName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d;", super.toString(), hardworking, loyal, honest);
    }
}
