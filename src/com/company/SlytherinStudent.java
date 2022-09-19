package com.company;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlytherinStudent(String fullName, int transgress, int magic, int cunning,
                            int decisiveness, int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, transgress,magic);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    private int ability() {
        return cunning + decisiveness + ambition + resourcefulness + thirstForPower;
    }

    public void companyRavenclaw(SlytherinStudent slytherinStudent) {
        int ability1 = this.ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеринец %s лучше чем слизеринец %s: %d VS %d%n", getFullName(), slytherinStudent.getFullName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше чем слизеринец %s: %d VS %d%n", slytherinStudent.getFullName(), getFullName(), ability2, ability1);
        } else {
            System.out.printf("Слизеринец %s такой же, как слизеринец %s: %d VS %d%n", slytherinStudent.getFullName(), getFullName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость : %d; жажда власти: %d;", super.toString(), cunning, decisiveness, ambition, resourcefulness, thirstForPower);
    }
}
