package for_loops;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        do {
            System.out.println("HI" + a++);
        }while (a<=10);

        // if value is less tha n 10
//        2
//        HI2
//                HI3
//        HI4
//                HI5
//        HI6
//                HI7
//        HI8
//                HI9
//        HI10
// if value is more than 10 , :  HI30

    }
}
