package com.company;

public class Main {
    public static void main (String[] args){
        System.out.println(plansForADay(35,20));
        System.out.println(plansForADay(18, 19));
        System.out.println(plansForADay(44, 15));
        System.out.println(plansForADay(46, 5));
        System.out.println(plansForADay(46, 30));
            }

    public static String plansForADay (double age, double temperature) {
        if (20 < age && 45 > age && -20 < temperature && temperature < 30)
        return "Можно идти гулять";
        else if (20 > age && 0 < temperature && 20 > temperature)
        return "Можно идти гулять";
        else if (age > 45 && temperature > -10 && temperature < 25)
        return "Можно идти гулять";
        else return "Оставайтесь дома";

    }
}
