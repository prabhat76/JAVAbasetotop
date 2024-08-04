package for_loops;

import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {
        //loops while,do while, for
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a<=4){
            System.out.println("HI" + a) ;
            int b = sc.nextInt();
            while(b<=3) {
                System.out.println("Prabhat");
                b++;
            }
            a++;
        }
        System.out.println("Bye"+ a);
    }
}
