package PracticalCollection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Mike");
        names.add("Nike");
        names.add("Sara");



        for (String name: names) {
            System.out.println(name);
        }




        System.out.println("************************");
        Set<String> names1 = new HashSet<>();
        names1.add("Mike");
        names1.add("Nike");
        names1.add("Sara");
        Iterator<String> iterator1 = names1.iterator();

        while (iterator1.hasNext()) {

            System.out.println(iterator1.next());
        }

//
//        List<String> names = new ArrayList<>();
//        names.add("Mike");
//        names.add("Nick");
//        names.add("Sara");
//
//        ListIterator<String> iterator = names.listIterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println("---------------------");
//        names.listIterator(names.size());
//
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }



//        List list = new ArrayList();
//        list.add("First element");
//        list.add("Second element");
//        list.add(0, "One more first element");
//
//        String element2 = (String) list.get(1);
//
//        for (Object o : list) {
//            String element = (String) o;
//            System.out.println(element);
//        }
//
//        //System.out.println(list.remove(1));
//        System.out.println(list.size());



    }


}
