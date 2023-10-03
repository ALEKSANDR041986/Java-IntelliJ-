package lesson6.seminar.Homework;

import lesson6.seminar.Ex_3.Cat;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    /*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
Работу сдать как обычно ссылкой на гит репозиторий
Частые ошибки:
1. Заставляете пользователя вводить все существующие критерии фильтрации
2. Невозможно использовать более одного критерия фильтрации одновременно
3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или
добавить еще ноутбук, то программа начинает работать некорректно
     */

    public static void main(String[] args) {

        Set<Computer> computers = new HashSet<>();

        Computer comp1 = new Computer();
        comp1.model_name = "Pentium";
        comp1.colour = "black";
        comp1.operat_syst = "windows";
        comp1.ram = 256;
        comp1.hard_disk = 100;
        comp1.disp_size = 10;

        Computer comp2 = new Computer();
        comp2.model_name = "Asus";
        comp2.colour = "white";
        comp2.operat_syst = "windows";
        comp2.ram = 128;
        comp2.hard_disk = 200;
        comp2.disp_size = 10;

        Computer comp3 = new Computer();
        comp3.model_name = "Lenovo";
        comp3.colour = "pink";
        comp3.operat_syst = "Linuc";
        comp3.ram = 512;
        comp3.hard_disk = 500;
        comp3.disp_size = 10;

        Computer comp4 = new Computer();
        comp4.model_name = "Mac";
        comp4.colour = "grey";
        comp4.operat_syst = "macos";
        comp4.ram = 512;
        comp4.hard_disk = 1000;
        comp4.disp_size = 13;

        Computer comp5 = new Computer();
        comp5.model_name = "HP";
        comp5.colour = "black";
        comp5.operat_syst = "windows";
        comp5.ram = 1000;
        comp5.hard_disk = 100;
        comp5.disp_size = 10;

        //Добавление компьютеров в множество
        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);
        computers.add(comp4);
        computers.add(comp5);

//        Вывод всех компьютеров
        System.out.println("Модельный ряд: \n");
        printSet(computers);

//        создаем меню выбора параметров
        Computer.showmenu();
        System.out.println("Выберите интересующий параметр");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Computer.paramcomp(choice);
        System.out.println(Computer.choice_comp);

//        Находим подходящий компьютер
        System.out.println("по размеру дисплея вам подойдет : "
                + findcomp_disp( computers, Integer. parseInt(Computer.choice_comp.get("display size"))));
        System.out.println("по размеру памяти вам подойдет : "
                + findcomp_ram( computers, Integer. parseInt(Computer.choice_comp.get("RAM"))));
        System.out.println("по размеру жесткого диска вам подойдет : "
                + findcomp_ram( computers, Integer. parseInt(Computer.choice_comp.get("HDD"))));
    }

    static void printSet(Set<Computer> computers) {
        for (Computer comp : computers) {
            System.out.println(comp);
        }
    }

//    Поиск по размеру дисплея
    static Set <Computer> findcomp_disp(Set<Computer> computers, int disp) {
        Set<Computer> res = new HashSet<>();
        for (Computer computer: computers){
            if (computer.disp_size >= disp){
                res.add(computer);
            }
        }
        return res;
    }

    // Поиск по оперативной памяти
    static Set <Computer> findcomp_ram(Set<Computer> computers, int ram) {
        Set<Computer> res = new HashSet<>();
        for (Computer computer: computers){
            if (computer.ram >= ram){
                res.add(computer);
            }
        }
        return res;
    }

//    Поиск по размеру жесткого диска
    static Set <Computer> findcomp_HDD(Set<Computer> computers, int hdd) {
        Set<Computer> res = new HashSet<>();
        for (Computer computer: computers){
            if (computer.hard_disk >= hdd){
                res.add(computer);
            }
        }
        return res;
    }
}