package object_oriented;

import java.util.Scanner;

class Calculator {

    //methods having two parameters
    public int add(int a , int b){
        int r =  a +  b;
        return r;
    }

    public int subs(int a , int b){
        int r = a - b ;
        return r ;
    }

    public int mul(int a , int b){
        int r = a * b ;
        return r ;
    }
    public int div(int a , int b){
        int r = a % b ;
        return r ;
    }

}
public class calci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Please type what you want ");
        String m = sc.next();
        Calculator calc = new Calculator();
        int add = calc.add(a, b);
        int sub = calc.subs(a,b);
        int div = calc.div(a,b);
        int mul = calc.mul(a,b);
       // System.out.println("Please type what you want ");
        switch (m){
            case "add":
                System.out.println(add);
                break;
            case "subs":
                System.out.println(sub);
                break;
            case "mul":
                System.out.println(mul);
                break;
            case "div":
                System.out.println(div);
                break;


        }
//        Calculator calc = new Calculator();
//        int result = calc.add(a, b);
//        System.out.println(result);
//        int result = a +b ;
//        System.out.println(result);
    }
}
