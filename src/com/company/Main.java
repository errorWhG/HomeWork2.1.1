package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(homeWork2(geterateRandomAge(), geterateRandometemperature()));
        System.out.println(homeWork2(geterateRandomAge(), geterateRandometemperature()));
        System.out.println(homeWork2(geterateRandomAge(), geterateRandometemperature()));
        System.out.println(homeWork2(geterateRandomAge(), geterateRandometemperature()));
        System.out.println(homeWork2(geterateRandomAge(), geterateRandometemperature()));

}
    public static String homeWork2 (int age, int temperature) {
        System.out.println("Возраст:" + age + "Temperature:" +temperature);

        if (age>= 20 && age <=45 && temperature >= -20 && temperature <=30){
            return "Можно идти гулять";

        }else if (age > 15 && temperature >= -14 && temperature <=25){
            return "Можно идти гулять";

        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
        return  "Можно идти гулять";

        } else {
        return "Оставайтесь дома";
        }
    }
        // Здраствуйте учитель спасибо вам за доп время
    public static int geterateRandomAge(){
        Random random = new Random();
        return random.nextInt(50);
    }

    public static int geterateRandometemperature(){
        Random random = new Random();
        return random.nextInt(45);
    }
}