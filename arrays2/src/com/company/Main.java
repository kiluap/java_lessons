package com.company;

import java.util.Arrays;

public class Main {
    public static void ShowArray(String[] a){
        for (int i=0; i < a.length;i++)
            System.out.print(a[i]+", ");
    }

    public static void main(String[] args) {
        int count = 0;
        String[] first={"Гоша","Коля","Оля","Лена","Ксюша"};
        String[] second={"Коля","Ксюша"};

        //сравневаем элементы, делаем их нул, считаем сколько элементов удалится
        for(int i=0;i<first.length;i++)
            for (int j=0;j<second.length;j++)
                if (first[i] == second[j]) {
                    first[i] = null;
                    count++;
                    break; // если в первом массиве одинаковые имена удалять будем только одно
                }
        // Создаём новый массив уменьшенного размера добавляем в него не пустые значения из первого(можно ли for each?)
        String[] resalt = new String[first.length-count];
        count=0;
        for(int i=0;i<first.length;i++)
            if (first[i]!=null){
                resalt[count]=first[i];
                count++;
            }
        //вывод элементов и их количества
        ShowArray(resalt);
        System.out.println(resalt.length);

    }
}