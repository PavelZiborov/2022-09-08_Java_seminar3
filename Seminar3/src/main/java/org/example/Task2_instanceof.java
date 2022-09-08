package org.example;
import java.util.ArrayList;

public class Task2_instanceof {
    public static void main(String[] args) {
        /*
        Создать список типа ArrayList<Object>.
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */

//        boolean b1 = arr.get(0) instanceof String; - проверка элемента на принадлежность к классу String
//        boolean b2 = arr.get(0) instanceof Integer; - проверка элемента на принадлежность к классу Integer



        ArrayList<Object> arr = new ArrayList<>();
        arr.add("Привет");
        arr.add(123);
        arr.add(5);
        arr.add("мир");
        arr.add(10);
        System.out.println(arr);

        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i) instanceof Integer) {
                arr.remove(i);
            }
            else
                i++;
        }
        System.out.println(arr);


    }
}
