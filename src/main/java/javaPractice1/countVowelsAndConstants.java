package javaPractice1;

public class countVowelsAndConstants {
    public static void main(String[] args) {
        String word = "anushapp";
        word= word.toLowerCase();
        int vowels =0 ;
        int constants = 0;
        for(int i=0; i< word.length();i++) {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <='z'){
                if(ch == 'a' || ch =='e' || ch=='i'|| ch=='o'||ch=='u'){
                    vowels++;
                }else {
                    constants++;
                }
            }
        }
        System.out.println("vowels count"+ vowels +" constants count"+ constants);
    }
}
