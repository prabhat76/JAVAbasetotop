package methodoverlaoding;

class Calculator {
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1= obj.add(1,2,3);
        System.out.println(r1);

    }
}
