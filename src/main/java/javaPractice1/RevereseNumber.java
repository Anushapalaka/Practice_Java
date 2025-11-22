package javaPractice1;

public class RevereseNumber {
    public static void main(String[] args) {
       int num = 98567;
       int reversed= 0;
       while(num !=0){

           int digit = num%10;
           reversed = reversed *10+digit;
           num = num/10;
       }
        System.out.println(reversed);
    }
}
