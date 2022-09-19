package com.company;

import static java.lang.String.format;

public abstract class HogwartsStudent {

    private String fullName;
    private int magic;
    private int transgress;

    public HogwartsStudent(String fullName, int magic, int transgress ) {
        this.fullName = fullName;
        this.magic = magic;
        this.transgress = transgress;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return magic + transgress;
    }

    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше чем студет %s: %d VS %d%n", getFullName(), hogwartsStudent.getFullName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше чем студет %s: %d VS %d%n", hogwartsStudent.getFullName(), getFullName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n", hogwartsStudent.getFullName(), getFullName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент: %s; Сила магии: %d; сила трансгрессии: %d;", fullName, magic, transgress);
    }
}
