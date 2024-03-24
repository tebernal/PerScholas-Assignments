import java.util.Scanner;
import java.util.Arrays;

public class PAArray {
    public static void main(String[] args){

        //Task 1
        int[] num = {1,2,3};
        System.out.println("First element: + num [0]");
        System.out.println("Second element: + num [1]");
        System.out.println("Third element: + num [2]");

        //Task 2
        int[] mid = {13,5,7,68,2};
        System.out.println("Middle element:" + mid [2]);

        //Task 3
        String[] colors = {"red", "green", "blue","yellow"};
        System.out.println(colors.length);
        // Cloning colors array
        String[] cloneArray = colors.clone();
        System.out.println("Colors Array: " + Arrays.toString(colors));
        System.out.println("Clone Array: " + Arrays.toString(cloneArray));

        //Task 4
        int[] numb = { 15, 16, 17, 18, 19 };
        System.out.println("First element: " + numb[0]);
        System.out.println("Last element: " + numb[numb.length - 1]);
        // Printing the value at index = length
        // using numb(numb.length)
        System.out.println("Attempting to print array value at index = length: ");
        // System.out.println(numb[numb.length]);
        // Attempting to assign a value to array at index 5
        // numb[5] = 21;

        System.out.println();
        System.out.println();


        //Task 5
        int []arrayFive = new int[5];
        int i;
        for (i = 0; i < 5; i++)
            arrayFive[i] = i;

        System.out.println();
        System.out.println();


          //Task 6
            int []array5 = new int[5];
        for (i = 0; i < 5; i++)
            array5[i] = i * 2;

        System.out.println();
        System.out.println();

         //Task 7

        int midArray[] = { 5, 18, 3, 14, 9 };
        System.out.println("Elements in the array except the middle element: ");
        for (i = 0; i < 5; i++)
            if (i != 2)
                System.out.print(midArray[i] + "  ");

    }

}
