package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String > listA =new ArrayList<>();
        ArrayList<String > listB =new ArrayList<>();
        ArrayList<String > listC =new ArrayList<>();

        System.out.println("enter 5 String ");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }
        System.out.println(listA);
        
        
        //list2
        System.out.println("add listB ");

        for (int i = 0; i < 5; i++) {
            listB.add(scanner.next());
        }
        System.out.println(listB);

        Collections.sort(listA);
        System.out.println("сортирован лист А " + listA);

        Collections.sort(listB);
        Collections.reverse(listB);
        System.out.println("сортирован лист B " + listB);
        Iterator<String> iteratorA = listA.iterator();
        Iterator<String> iteratorB = listB.iterator();
        while (iteratorA.hasNext() && iteratorB.hasNext()){
            listC.add(iteratorA.next());
            listC.add(iteratorB.next());
        }
        System.out.println("listC"+listC);

        listC.sort(Comparator.comparingInt(String::length));

        System.out.println("ListС по длине слов " + listC);
    }


}
