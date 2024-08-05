package array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayImplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = {23,6,7};

        //
        for (int test: num1) {
            System.out.println(test);
        }
        //another method
        for(int i=0; i< num1.length; i++ ){

            System.out.println(num1[i]);
        }

       Arrays.sort(num1);
        for (int test2: num1){
            System.out.println(test2);
        }

        //Array to print using Arrays.toString using library
        System.out.println(Arrays.toString(num1));


        //MultiDimesnionalArray
        int[][] array = {{1, 2}, {3, 4}, {5, 6, 7}};
        System.out.println(Arrays.deepToString(array));


        //finding the elements in array
        for (int test2: num1){
            System.out.println(test2);
        }



//        for (int test : num1) {
//            System.out.println("Enter the number to be searched");
//            int num = sc.nextInt();
//            if (test == num){
//                System.out.println("Yes" + num + "is Present in the array");
//                return;
//            }else {
//                System.out.println("Not present");
//                return;
//            }
//        }

    }
}
