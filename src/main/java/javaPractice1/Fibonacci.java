package javaPractice1;

public class Fibonacci {
    public static void main(String[] args) {
        int count =8;
        int a=0;
        int b=1;
        System.out.println( a + " " + b + " ");
        for(int i =2; i<count;i++){

            int sum = a+b;
            System.out.println(sum + " " );
            a=b;
            b=sum;
        }
    }

}
