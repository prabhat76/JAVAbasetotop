public class Demo {
    public static void main(String[] args) {
        int x =7;
        int y=5;
        int a= 5;
        int b=9;

        boolean result = y>x || b>a;
        System.out.println(result);


        //usage of ternary operator

        int n=5;
        int result1 = 0;
        result1 =n%2==0? 10 :20 ;
        System.out.println(result1);
    }
}
