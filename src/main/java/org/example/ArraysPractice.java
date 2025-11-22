package org.example;

public class ArraysPractice {
   static String[] name = {"jk","sf","slkg"};

    public static void main(String[] args) {

        String[] name2 = new String[5];
        name2[0] = "erre";
        name2[1] = "sdf";

        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 3;


        System.out.println(arr[1]);

       for(int i=0; i<name.length; i++){

           System.out.println(name2[i]);
       }

    }
}
