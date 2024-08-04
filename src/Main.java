public class Main {
    public static void main(String[] args) {

        //literals adn string conversion //
        //type casting (every varibale needs a type )
        //byte coversion
        int a =1234 ;
        byte l =(byte) a;
        System.out.println(l);

        //float coversion
        float f =5.6f;
        int t= (int) f;
        System.out.println(t);

        //increment and post increment
        int num =8 ;
        num++;
        int result=num++; //fetch value and then increment
        int result1= ++num;// increment and then fetch the value
        System.out.println(num);
        System.out.println(result);
        System.out.println(result1);


    }
}