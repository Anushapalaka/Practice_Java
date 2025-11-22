package javaPractice1;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        //giving all values
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
            System.out.println( "This is the factorial :"+ fact);
        }
    }
}
//        //giving fial value
//        for (int i =1; i<=num; i++)
//            fact=fact*i;
//        System.out.println("Factorial of " + num + " is: " + fact);
//
//    }

//}
