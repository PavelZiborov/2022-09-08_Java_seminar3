package org.example;

import java.util.ArrayList;
import java.util.Random;

public class DZ_1 {
    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        // заполнение случайными числами от -10 до 10
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(-10,11));
        }
        System.out.printf("Изначальный список: %s\n",list);
        System.out.printf("Количество элементов: %s\n\n",list.size());

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i)%2==0) {
                list.remove(i);
                i--;
                size--;
            }
        }
        System.out.printf("Список только из нечетных чисел: %s\n",list);
        System.out.printf("Новое количество элементов: %s\n",list.size());
    }
}
