package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("Простой массив: ");
        int []arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
            System.out.print(arr[i]+", ");
        }
        Arrays.sort(arr);
        System.out.println("\nSorted: "+Arrays.toString(arr));

        System.out.println("---------------------------------------------------------------------");
        System.out.print("ArrayList: ");
        ArrayList<Integer> arrArrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrArrayList.add(random.nextInt(2));
            System.out.print(arrArrayList.get(i)+", ");
        }
        arrArrayList.sort(sortArray);
        System.out.println("\nArrayList sorted: "+arrArrayList);

        System.out.println("----------------------------------------------------------------------");
        System.out.print("LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            linkedList.add(random.nextInt(2));
            System.out.print(linkedList.get(i)+", ");
        }
        linkedList.sort(sortArray);
        System.out.println("\nLinkedList sorted: "+linkedList);
    }

    public static Comparator<Integer> sortArray = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    };
    
}
