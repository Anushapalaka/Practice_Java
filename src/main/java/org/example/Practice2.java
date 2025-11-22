package org.example;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    //even or odd
    public static void evennodd() {
        int a = 299;
        if (a % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
    }
//    1-10

    public static void num() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    //table
    public static void table(){
        int h=5;
        for(int i=1; i<=10; i++ ){
            System.out.println(h + "X" + i + "="+( h*i));
        }
    }
    //even numbers
    public static void even(){
        for(int i=1; i<=20; i++){
            if (i % 2 == 0) {
                System.out.println("Even " + i );
            }
//            else{
//                System.out.println("odd" + i);
//            }
        }
    }
    //sum of numbers from 1-10
    public static void sum(){
        int sum =0;
        for(int i=1 ; i<=10; i++)
        {
            sum = sum + i;
            System.out.println(sum);

        }

    }


    public static void practiceDumbAnusha(){
        String str = "anusha";
        String[] arr = {"dumb", "dumboo","rumboo"};
        char[] charArr = {'a','n','u'};
        List<String> list = new ArrayList<>();
        list.add("duboo");
        list.add("gumboo");
        list.add("jumboooo");


        System.out.println("Length of str "+str.length());
        System.out.println("Length of arr "+ arr.length);
        System.out.println("Size of list "+ list.size());

        System.out.println("Char at 2 position "+str.charAt(2));
        System.out.println("Arr element at 2 position "+arr[2]);
        System.out.println("List element at 2 position "+list.get(2));

        char strArr[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }

    public static void main(String[] args) {
        practiceDumbAnusha();
    }
}