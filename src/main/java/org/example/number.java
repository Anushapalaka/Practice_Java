package org.example;

public class number {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("frizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");

            } else if (i % 5 == 0) {

                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
