package lecture6;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
//        int salary = 8000;
//        if (salary>2000)
//        {
//            salary =salary+800;
//
//        }
//        else{
//            salary= salary+700;
//        }
//        System.out.println(salary);
//    }
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        if (salary > 200)
        {
            salary = salary + 600;
        }
        else
        {
            salary= salary +900;

        }

        System.out.println(salary);
    }
}
