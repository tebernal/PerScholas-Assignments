import java.util.Scanner;
import java.util.Arrays;

public class PAArrays
{public static void main(String[] args){

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

    String[] cloneArray = colors.clone();
    System.out.println("Colors Array: " + Arrays.toString(colors));
    System.out.println("Clone Array: " + Arrays.toString(cloneArray));

    //Task 4
    int[] numb = { 15, 16, 17, 18, 19 };
    System.out.println("First element: " + numb[0]);
    System.out.println("Last element: " + numb[numb.length - 1]);

    System.out.println("Attempting to print array value at index = length: ");
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
            System.out.println(midArray[i] + "  ");


    //Task 8

    String fruit [] = {"Strawberry","Blueberries", "Apple", "Grapes", "Watermelon"};
    int swapIndex0 = 0;
    int swapIndex2 = 2;
    String temp = fruit[swapIndex0];
    fruit [swapIndex0]  = fruit [swapIndex2];
    fruit[swapIndex2] = temp;
    System.out.println(Arrays.toString(fruit));

    //Task 9
    int ascArray [] = {4,2,9,13,1,0};
    int min = ascArray[0];
    int max = ascArray[0];
    for(int it=0; it < ascArray.length; it++){
        if (ascArray[it] < min){
            min = ascArray[i];
        }
        if (ascArray[it]> max){
            max =ascArray[it];
        }
    }
    Arrays.sort(ascArray);
    System.out.println(Arrays.toString(ascArray));
    System.out.println("The smallest number is " + min);
    System.out.println("The largest number is " + max);

//Task 10

    Object[] mixed = new Object[5];
    mixed[0] = " Rose";
    mixed[1] = "Tulip";
    mixed[2] = "Carnation";
    mixed[3] = Integer.valueOf(42);
    mixed[4] = Double.valueOf(76.9);
    int i;
    System.out.print("The elements of the array: ");
    // display the elements in the array using for loop
    for (i = 0; i < mixed.length; i++)
        System.out.print(mixed[i] + ", ");

    System.out.println();
    System.out.println();
    }
    //Task 11

    Scanner input = new Scanner(System.in);
    int val;
    System.out.println("How many favorite things do you have? ");
    val = input.nextInt();

    String[] favorite = new String[val];
        for (i = 0; i < val; i++)

    {
        System.out.print("Enter your thing:");
        favorite[i] = input.next();
    }
        for (i = 0; i < val; i++)

    System.out.print(favorite[i] + " ");

    input.close();
    System.out.println();
    System.out.println();

}

}
