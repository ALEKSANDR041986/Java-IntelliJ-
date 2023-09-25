package home_work.Ex_1;

import java.util.*;

public class Phones {
    Map<String, List<String>> phone_book = new HashMap<>();

    //добавление номера
    void add_number() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя");
            String key = sc.next();
            if (key.contains("exit")) {
                System.out.println("выход из цикла!");
                break;
            }
            System.out.println("Введите телефон");
            String value = sc.next();
            if (phone_book.containsKey(key)) {
                List<String> list = phone_book.get(key);
                list.add(value);
            } else {
                List<String> list = new ArrayList<>();
                list.add(value);
                phone_book.put(key, list);
            }
            System.out.println(phone_book);
            }
        }

        //найти номер по имени
//    List<String> find_number(String name) {
//            return phone_book.get(name);
//    }

    //удаление абонента
    void deleted_man(String name) {
        if (phone_book.containsKey(name)) {
            System.out.println(phone_book.remove(name));
        }
    }

    // вывод всех абонентов
    void key_set(){
        System.out.println(phone_book.keySet());
    }
}
