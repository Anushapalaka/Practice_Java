package javaPractice1;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args) {
        String name =" bkj lk k";
//        name =name.replaceAll("//s+", "");
        name = name.replaceAll("\\s+", "");
        System.out.println(name);
    }
}
