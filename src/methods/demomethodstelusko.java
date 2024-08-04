package methods;

import java.util.Scanner;

class computer{
    public void playMusic(){
        System.out.println("Music is playing in the background");
    }

    public String getmeApen(int cost){
        //System.out.println("the pen cost" + cost);
        if (cost >= 10)
            return "Bingo you get a pen";
        else
            return "Nothing";

    }
}
public class demomethodstelusko {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computer obj = new computer();
        obj.playMusic();
        System.out.println("Enter the price of the Pen");
        int cost= sc.nextInt();
        String str = obj.getmeApen(cost);
        System.out.println(str);

    }
}
