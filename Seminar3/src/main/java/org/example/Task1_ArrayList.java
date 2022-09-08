package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task1_ArrayList {
    public static void main(String[] args) {

        Random rnd = new Random(); // объявление рандома
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(-5,5)); // nextInt(-5,5) от и до
        }
//        System.out.println(list);
        list.sort(Comparator.naturalOrder());
//        System.out.println(list);

        // заполнение листа случайными элементами из списка
        ArrayList<String> planets = new ArrayList<String>();
        String[] array = new String[] {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Плутон", "Сатурн", "Уран"};

        for (int i = 0; i < 15; i++) {
            planets.add(array[rnd.nextInt(array.length)]);
        }
        System.out.println(planets);
        planets.sort(Comparator.naturalOrder());
        System.out.println(planets);

        int count = 1;
        for (int i = 0; i < planets.size()-1; i++) {
            if (planets.get(i).equalsIgnoreCase(planets.get(i+1))) {
                count++;
            } else {
//                System.out.println("Планета: " + planets.get(i) + " | Количество: " + count);
                System.out.printf("Планета %s повторяется %s раз(а)\n",planets.get(i), count);
                count = 1;
            }
        }
        for (int i = 0; i < planets.size()-1; i++) {
            if (planets.get(i).equalsIgnoreCase(planets.get(i+1))) {
                planets.remove(i);
                i--;
            }
        }
        System.out.println(planets);
    }
}