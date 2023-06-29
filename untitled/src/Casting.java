public class Casting {
    public static void main(String[] args) {
        byte b=42;
        char c='a';
        short s=1024;
        int i =5000;
        float f=89.6f;
        double d=0.23;
        double result =(f*b)+(i/c)+(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);


    }
}
