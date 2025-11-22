package javaPractice1;

public class SwapNum {
    public static void withOutThirdVariable(){
        int a=1;
        int b=2;
        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("A value"+ a +" B value " +  b);

    }
    public static void withNewVariable(){
        int a=5;
        int b=4;
        int c= a;
        a=b;
        b=c;
        System.out.println("A value: " + a + " B value:" + c);
    }
    public static void main(String[] args) {
        withNewVariable();
        withOutThirdVariable();

    }

}
