package ua.zp.brainacad;

import java.util.*;

public class Collect {
    public static void main(String[] args) {
        //1
        System.out.println("1:");
        //Создать ArrayList<String> (list1)
        List<String> list1 = new ArrayList<>();
        //Создать массив строк. Добавить в список все элементы массива (одним методом)
        String[] sList1 = {"qwe", "asd", "zxc"};
        list1.addAll(Arrays.asList(sList1)); //=========== Правильный ли метод (т.к. ниже предлагают его еспользовать)?
        System.out.println(list1);
        //Создать новый (list2) ArrayList<String>, принициализировав его предыдущим списком
        List<String> list2 = list1; //=========== Я не проинициализировал, а просто присвоил?
        System.out.println(list2);
        //Создать список (list3) используя Arrays.asList(…)
        List<String> list3 = Arrays.asList("sds", "dfsd");
        System.out.println(list3);
        //Вставить list3 в середину list2
        list2.addAll(1, list3);
        System.out.println(list2);
        //Отсортировать список по убыванию.
        list2.sort(String::compareTo); //=========== Тут же неправильный метод сортировки?
        System.out.println(list2);
        //*Удалить каждый второй элемент списка используя listiterator
        ListIterator<String> listIterator = list2.listIterator();  //=========== Как это сделать?
        /*while (listIterator.hasNext()) {
            if (listIterator.nextIndex()%2 != 0) listIterator.remove();
        }
        System.out.println("---" + list2);*/

        //2
        System.out.println("\n2:");
        //Создать HashSet<String> (set1)
        Set<String> set1 = new HashSet<>();
        //Вставить в set 2 произвольные строки
        set1.add("wer"); //=========== Тут нужно добавлять только по одному?
        set1.add("sdf");
        System.out.println(set1);
        //Вставить в set все элементы из list1 и list2
        set1.addAll(list1); //=========== Я же не правильно вставил (или HashSet разбрасывает элементы не по парядку)? И можно опять добавить только по одному?
        set1.addAll(list2);
        //Вывести на экран значения set-a
        System.out.println(set1);
        //Создать LinkedHashSet<String> (set2)
        Set<String> set2 = new LinkedHashSet<>();
        //Вставить в set все элементы из list2 и list3
        set2.addAll(list2); //=========== Опять же.
        set2.addAll(list3);
        //Вывести на экран значения set-a
        System.out.println(set2);

        //3
        System.out.println("\n3:");
        //Создать LinkedHashMap<Integer, String> (map1)
        Map<Integer, String> map1 = new LinkedHashMap<>();
        //Добавить в map значения всех месяцев года (номер месяца : название)
        map1.put(0, "January"); //=========== Тут нужно добавлять только по одному?
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");
        //Вывести на экран первый и последний месяц года (0 и 11)
        System.out.println(map1.get(0) + " " + map1.get(11));
        //Вставить на место 6-го месяца слово ‘ОТПУСК’, вывести на экран
        map1.replace(6, "ОТПУСК");
        System.out.println(map1.get(6)); //=========== Это имеется ввиду, когда нужно "вывести на экран"?
        //Создать HashMap<Integer, String> (map2)
        Map<Integer, String> map2 = new HashMap<>();
        //Вставить в map2 все значения map1
        map2.putAll(map1); //=========== Так вставлять?
        System.out.println(map2);
        /*Создать метод для вывода всех элементов map в консоль
        (EntrySet< Integer, String >)
        Вывести на экран map1, map2*/
        outputAllInConsole(map1); //=========== Правильно ли я понял? (Метод расположен ниже)
        outputAllInConsole(map2);
        //*Создать map3 (ключ – имя студента (String), значение -контакты студента: моб.тел, почта, скайп (Set<String>))
        Map<String, Set<String>> map3 = new HashMap<>();
        map3.put("Sergei", new HashSet<>()); //=========== Правильно ли я создал и как его заполнять?
        System.out.println(map3);

        //4
        System.out.println("\n4:");
        //Создать класс User с полями name, old и phone
        //Создать userSet (HashSet<User> )
        Set<User> userSet = new HashSet<>();
        //Создать 2 экземпляра класса User с одинаковыми полями и 1 экземпляр отличающийся возрастом
        User user1 = new User("Jim", 20, "1234"); //=========== Правильно ли я понял?
        User user2 = new User("Jim", 20, "1234");
        User user3 = new User("Jim", 10, "1234");
        //Добавить пользователей в userSet
        userSet.add(user1); //=========== Правильно ли добавил?
        userSet.add(user2);
        userSet.add(user3);
        //Вывести пользователей на экран
        System.out.println(userSet); //=========== Вывод с помощью метода toString в классе User? Это имеется ввиду?
        //Переопределить в классе User метод hashcode, Указав в нем только обработку поля name.
        //Вывести пользователей на экран
        //=========== Не понял что тут имеется ввиду...
        //Переопределить в классе User метод hashcode, Указав в нем все поля класса.
        //Вывести пользователей на экран
        //=========== Не понял что тут имеется ввиду...
    }

    /*Создать метод для вывода всех элементов map в консоль
        (EntrySet< Integer, String >)
        Вывести на экран map1, map2*/
    public static void outputAllInConsole(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }
    }
}
