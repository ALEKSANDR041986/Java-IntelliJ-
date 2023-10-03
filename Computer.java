package lesson6.seminar.Homework;

import java.util.*;

public class Computer {

    String model_name, colour, operat_syst;
    int ram, hard_disk, disp_size;
    public static Map <String,String> choice_comp = new HashMap<>();

    public String toString() {
        return "Модель: " + model_name + ", Операционная система: " + operat_syst + ", Цвет: " + colour + ", " +
                "Жесткий диск: " + hard_disk + " Гб" + ", Оперативная память: " + ram + " Мб" +
                ", Размер монитора: " + disp_size;
    }

        static void paramcomp (int what) {
        String model, op_syst, colour, ram, disp_size, hard_disk;
            Scanner scanner = new Scanner(System.in);

                switch (what) {
                    case 1:
                        System.out.println("Введите модель");
                        model = scanner.nextLine();
                        choice_comp.put("model", model);
                    case 2:
                        System.out.println("Введите операционную систему");
                        op_syst = scanner.nextLine();
                        choice_comp.put("operating system", op_syst);
                    case 3:
                        System.out.println("Введите цвет");
                        colour = scanner.nextLine();
                        choice_comp.put("colour", colour);
                    case 4:
                        System.out.println("Введите размер жесткого диска");
                        hard_disk = scanner.nextLine();
                        choice_comp.put("HDD", hard_disk);
                    case 5:
                        System.out.println("Введите оперативную память");
                        ram = scanner.nextLine();
                        choice_comp.put("RAM", ram);
                    case 6:
                        System.out.println("Введите размер монитора");
                        disp_size = scanner.nextLine();
                        choice_comp.put("display size", disp_size);
                    case 0:
                        break;
            }
            System.out.println("Ваш выбор: ");
    }

    static void showmenu() {
        System.out.println("\nВыберите необходимые параметры для поиска: ");
        System.out.println("1 - Модель");
        System.out.println("2 - Операционная система");
        System.out.println("3 - Цвет");
        System.out.println("4 - Жесткий диск");
        System.out.println("5 - Оперативная память");
        System.out.println("6 - Размер монитора");
        System.out.println("\n");
    }
    }
//    static boolean isvalid (int ch){
//        if (ch < 1 | ch > 6 & ch != 0) return false;
//        else return true;
//    }