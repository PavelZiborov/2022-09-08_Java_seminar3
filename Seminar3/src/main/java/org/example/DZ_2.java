package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class DZ_2 {
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        long startTime = System.nanoTime();

        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        // заполнение случайными числами от  до
        for (int i = 0; i < 1000001; i++) {
            list.add(rnd.nextInt(-100000,100000));
        }
        System.out.printf("Изначальный список: %s\n",list);


        list.sort(Comparator.naturalOrder());
        System.out.printf("Отсортированный список: %s\n",list);
        System.out.printf("Мнимальное значение: %s\n",list.get(0));
        System.out.printf("Максимальное значение: %s\n",list.get(list.size()-1));
        System.out.printf("Среднее значение: %s\n",list.get((list.size())/2));




//        int min = list.get(0);
//        System.out.printf("Изначальное минимальное значение: %s\n",min);
//        int max = list.get(0);
//        System.out.printf("Изначальное максимальное значение: %s\n\n",max);
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < min) {
//                min = list.get(i);
//            }
//            if (list.get(i) > max) {
//                max = list.get(i);
//            }
//        }
//        list.sort(Comparator.naturalOrder());
//        System.out.printf("Мнимальное значение: %s\n",min);
//        System.out.printf("Максимальное значение: %s\n\n",max);
//        System.out.printf("Среднее значение: %s\n",list.get((list.size())/2));




        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.printf("Время выполнения кода: %s",duration);
    }
}
