package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // n! =
        // 5! = 1*2*3*4*5
        System.out.println(factorial(5));
        System.out.println(fibonn(8));

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Maria");
        names.add("Maria");
        names.add("Oleg");
        names.add("Peter");
        names.add("Alex");
        names.add("Max");
        names.add("Peter");

        TreeSet<String> treeSet = new TreeSet<>(names);

        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String> treeSet1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeSet1.addAll(names);
        System.out.println("---------------------------------");
        Iterator<String> iterator1 = treeSet1.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }




    }

// линейная рекурсия
    public static int factorial(int x) {
        if(x == 1)
            return 1;
        else
            return x*factorial(x-1);
    }

// числа Фибонначи
     // f(n) = f(n-1) + f(n-2)
     // f(0) = 1, f(1) = 1

    public static int fibonn(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else
            return fibonn(n-1) + fibonn(n-2);
    }
}
