import java.util.*;
public class PAControlFlowStatements
{
    public static void main(String[] args)
    {

        // Question 1
        int x = 7;
        if (x < 10)
        {
            // Less than 10
            System.out.println("Less than 10");
            //  Changed x to 15 value
            int xx = 15;
            if (xx < 10)
            {
                System.out.println("Less than 10");
            }
        }

        //Question 2
        int y = 7;
        if (y < 10)
        {
            System.out.println("Less than 10");
        } else
        {
            System.out.println("Greater than 10");
        }

        // Question 3
        int z = 15;
        if (z < 10)
        {
            System.out.println("Less than 10");
        }
        else if (z > 10 && z < 20)
        {
            System.out.println("Between 10 and 20");
        }
        else if (z > 20)
        {
            System.out.println("Greater than or equal to 20");
        }

        //Question 4
        int s = 15;

        if (s < 10 || s > 20)
        {
            System.out.println("Out of range");
        }
        else if (s >= 10 && s <= 20)
        {
            System.out.println("In range");
        }
        // If changed to 5
        int ss = 5;
        if (ss < 10 || ss > 20)
        {
            System.out.println("Out of range");
        }
        else if (ss >= 10 && ss <= 20)
        {
            System.out.println("In range");
        }

        // Question 5
        int grade;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter grade");
        grade = keyboard.nextInt();

        if (grade >= 90 && grade <= 100)
        {
            System.out.println("A");
        }
        else if (grade >= 80 && grade <= 89)
        {
            System.out.println("B");
        }
        else if (grade >= 70 && grade <= 79)
        {
            System.out.println("C");
        }
        else if (grade > 60 && grade <= 69)
        {
            System.out.println("D");
        }
        else if (grade < 60) {
            System.out.println("F");
        }
        else
        {
            System.out.println("Score out of range");
        }

        // Question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1- 7:");
        int input = sc.nextInt();
        switch (input)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }

        // Question 7
        Scanner cs = new Scanner(System.in);
        System.out.println("0 - Single Filer");
        System.out.println("1 - Married Jointly/Qualifying Widow(er)");
        System.out.println("2 - Married Separate");
        System.out.println("3 - Head of Household");
        System.out.print("Enter your filing status: ");
        int status = cs.nextInt();
        System.out.print("Enter your income: ");
        double income = cs.nextDouble();

        double taxAmount = -1;

        if (status == 0)
        {
            if (income >= 0 && income <= 8350)
                taxAmount = income * 0.1;
            else if (income >= 8351 && income <= 33950)
                taxAmount = income * 0.15;
            else if (income >= 33951 && income <= 82250)
                taxAmount = income * 0.25;
            else if (income >= 82251 && income <= 171550)
                taxAmount = income * 0.28;
            else if (income >= 171551 && income <= 372950)
                taxAmount = income * 0.33;
            else if (income >= 372951)
                taxAmount = income * 0.35;
            else
                System.out.println("Invalid income entered. Try again...");

        }
        else if (status == 1)
        {
            if (income >= 0 && income <= 16700)
                taxAmount = income * 0.1;
            else if (income >= 16701 && income <= 67900)
                taxAmount = income * 0.15;
            else if (income >= 67901 && income <= 137050)
                taxAmount = income * 0.25;
            else if (income >= 137051 && income <= 208850)
                taxAmount = income * 0.28;
            else if (income >= 208851 && income <= 372950)
                taxAmount = income * 0.33;
            else if (income >= 372951)
                taxAmount = income * 0.35;
            else
                System.out.println("Invalid income entered. Try again...");

        }
        else if (status == 2)
        {
            if (income >= 0 && income <= 8350)
                taxAmount = income * 0.1;
            else if (income >= 8351 && income <= 33950)
                taxAmount = income * 0.15;
            else if (income >= 33951 && income <= 68525)
                taxAmount = income * 0.25;
            else if (income >= 68526 && income <= 104425)
                taxAmount = income * 0.28;
            else if (income >= 104426 && income <= 186475)
                taxAmount = income * 0.33;
            else if (income >= 186476)
                taxAmount = income * 0.35;
            else
                System.out.println("Invalid income entered. Try again...");

        }
        else if (status == 3)
        {
            if (income >= 0 && income <= 11950)
                taxAmount = income * 0.1;
            else if (income >= 11951 && income <= 45500)
                taxAmount = income * 0.15;
            else if (income >= 45501 && income <= 117450)
                taxAmount = income * 0.25;
            else if (income >= 117451 && income <= 190200)
                taxAmount = income * 0.28;
            else if (income >= 190201 && income <= 372950)
                taxAmount = income * 0.33;
            else if (income >= 372951)
                taxAmount = income * 0.35;
            else
                System.out.println("Invalid income entered. Try again...");

        }
        else
            System.out.println("Invalid status entered. Try again...");
        if (taxAmount >=0)
            System.out.print("Your pending balance is: $" + taxAmount + " as tax.");
    }

}