package switch_statements;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Day is required ");
        String day= sc.next();
        //using third variable ans yield
        String result = "";

        switch (day){
            case "Monday":
                System.out.println(
                        "Bloody Fucking Monday"
                );
                break;
        }
        result = switch (day){
            case "Monday", "Sunday" : yield "Bloody days";
            default: yield  "sucking life";
        };
        System.out.println(result);
    }
}
