package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(friday(33, -11));
        System.out.println(friday(23,5));
        System.out.println(friday(17, -7));
        System.out.println(friday(23, 45));
        System.out.println(friday( generateRandomAge(),generateRandomTemperature()));

    }

    public static String friday(int age, int temperature) {
        if (age> 20 && age < 45 && (temperature > -20 && temperature < 30)) {
            return "Можно идти гулять 1";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять 2";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять 3";
        } else {
            return "Оставайтесь дома";
        }

    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(60);
        System.out.println("age=" +age);
        return age;

    }
    public static int generateRandomTemperature() {
        Random random = new Random();
        int temperature = random.nextInt(45);
        System.out.println("temperature="+temperature);
        return temperature;

    }


}
