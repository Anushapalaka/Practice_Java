package javaPractice1;

public class Palindrome {
    public static void stringPalindrome(){
        String word= "mom";
        String reversed = " ";
        for(int i = word.length()-1; i>=0 ; i--){
            reversed = reversed + word.charAt(i);
        }
        if(reversed == word ){
            System.out.println(reversed + "Palindrome");
        }else {
            System.out.println(reversed + " not a palindorme");
        }
    }
    public static void intPalindrome(){
        int num = 121;
        int temp =num;
        int reverse = 0;
        while(temp != 0){
            int digit = temp%10;
            reverse = reverse*10 + digit;
            temp= temp/10;
        }
        if (num == reverse){
            System.out.println(reverse + " palaindrome");
        }else {
            System.out.println(reverse + " not a palindrome");
        }
    }
    public static void main(String[] args) {
        stringPalindrome();
        intPalindrome();

    }
}
