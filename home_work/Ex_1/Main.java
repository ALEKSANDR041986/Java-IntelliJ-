package home_work.Ex_1;

public  class Main {
    public static void main(String[] args) {
        /*
        Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
        что 1 человек может иметь несколько телефонов.
         */
        Phones phones = new Phones();
        phones.add_number();
        System.out.println("Номера абонента Саша: "+ phones.phone_book.get("Саша"));
//        System.out.println("2"+ phones.find_number("Cаша"));
        phones.deleted_man("Ф");
        phones.key_set();

    }
}
