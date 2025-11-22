package javaPractice1;

public class StringCount {
    public void countWithSpaces(){
        String word= "sdf kdfs";
        System.out.println(word.length());
    }
    public static void countWithoutSpaces(){
       String word2 = "thank you all";
       int count = 0;
       for(int i = 0; i < word2.length(); i++){
           if (word2.charAt(i) != ' '){
               count++;
           }
       }
        System.out.println(count);

    }
    public static void main(String[] args) {
        countWithoutSpaces();
    }
}
