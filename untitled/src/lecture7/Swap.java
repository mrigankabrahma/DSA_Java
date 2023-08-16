package lecture7;

public class Swap {
    public static void main(String[] args) {

        int a = 12;
        int b  = 18;
        greet(a,b);
        System.out.println(a+" "+b);

    }
    static void greet(int a ,int b)
    {
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
