package org.example;

public class Loops {
//    Print “Hello” 5 times
    public static void printhello() {
        int i=1;
        while ( i <= 5){
            System.out.println("hello");
            i++;
        }
    }

    public static void countdown(){
       int j=10;
        while(j>=1)
            System.out.println(j);
            j--;
    }

    public static void primeNum(){
//        for (int i=2; i<=20; i++){
//            System.out.println(i);
            for(int n=2; n<=20; n++){
                if(n%2 != 0){
                    System.out.println(n);
//                }else {
//                    System.out.println("not a prime" + i);
                }
            }
        }
//    }
    public static void main(String[] args) {

//    printhello();
//        countdown();
        primeNum();
    }
}
