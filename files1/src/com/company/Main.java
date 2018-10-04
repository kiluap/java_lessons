package com.company;

import java.io.File;
import java.lang.String;
import java.util.*;


public class Main {

    //выбор директории и типа файлов
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dir, tip;
        System.out.print("Введите путь к папке - ");
        dir = in.nextLine();
        System.out.print("Введите тип файла - ");
        tip = in.next();

        List<Files> NeedFiles  = new ArrayList<Files>();

        File directory = new File(dir);
        if (directory.isDirectory()) {
            // получаем все объекты в каталоге
            for (File item : directory.listFiles()) {
                String filename = item.getName();
                // Выбираем нужные по типу файлы.
                if( filename.endsWith(tip)) {
                    NeedFiles.add(new Files(filename, item.lastModified()) );
                }
            }
        }
        Collections.sort(NeedFiles);
        //вывод последего файла
        Files last = NeedFiles.get(0);
        System.out.println(last.getName()+" - последний файл");
        //вывод ещё 10 или менее файлов.
        System.out.println("другие свежие файлы того же типа:");
        for(int i=1;(i<10)& (i<NeedFiles.size()); i++ ){
            Files f = NeedFiles.get(i);
            System.out.println(f.getName());

        }
    }
}


