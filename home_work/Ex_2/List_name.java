package home_work.Ex_2;

import java.util.*;

public class List_name {
    Map <String, List <String>> map = new HashMap<>();
    public void add_name(String text) {
        text = text.replace("\n", " ");
        text = text.replace(".", "");
        String[] names = text.split("," + " ");

        for (String name : names) {
            String[] name_spl = name.split(" ");
            if (!map.containsKey(name_spl[0])) {
                List<String> list = new ArrayList<>();
                list.add(name_spl[1]);
                map.put(name_spl[0], list);
            } else {
                List<String> list = map.get(name_spl[0]);
                list.add(name_spl[1]);
            }
        }
        System.out.println("Список ключей-значений: "+ map + "\n");
    }
    public void count_name(){
        for (Map.Entry<String,List <String>> entry: map.entrySet()) {
            System.out.println("Имя " + entry.getKey()+ " - " + entry.getValue().size() + " раз(а)");
        }
    }
    void sorted_name(){
        Map <Integer, String> map_new = new TreeMap<>(Comparator.naturalOrder());
        for (Map.Entry<String,List <String>> entry: map.entrySet()){
            map_new.put(entry.getValue().size(), entry.getKey().toString()+ entry.getValue());
        }
        System.out.println("\nНовый отсортированный словарь: " + map_new);
    }
}
