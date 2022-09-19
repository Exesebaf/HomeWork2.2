package com.company;

import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли ");
        RavenclawStudent luna = generateRavenclawStudent("Полумна Лавгуд");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори");

        harry.print();
        ron.print();
        luna.print();
        draco.print();
        cedric.print();
        harry.compareHogwarts(draco);
        harry.compareGryffindor(ron);


    }
    private static GryffindorStudent generateGryffindorStudent(String fullName){
        return new GryffindorStudent(
                fullName,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String fullName) {
        return new HufflepuffStudent(
                fullName,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static RavenclawStudent generateRavenclawStudent(String fullName) {
        return new RavenclawStudent(
                fullName,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static SlytherinStudent generateSlytherinStudent(String fullName) {
        return new SlytherinStudent(
                fullName,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }



























}