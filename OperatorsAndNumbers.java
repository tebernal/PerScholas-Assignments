public class OperatorsAndNumbers {
    public static void main(String[] args) {

// Question 1
        int x = 2;
        System.out.println("Binary string of 2: " +Integer.toBinaryString(x));
        // Result after shift operator
        x = x<<1;
        // Predicted decimal result after left shift is 4
        System.out.println("Decimal value after left shirt: "+x);
        // Predicted result after left shift is 100
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(x));

        // Question 1a
        int y = 9;
        System.out.println("Binary string of 9: " +Integer.toBinaryString(y));
        // Result after shift operator
        y = y<<1;
        // Predicted decimal result after left shift is 18
        System.out.println("Decimal value after left shirt: "+y);
        // Predicted result after left shift is 10010
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(y));

        // Question 1b
        int s =17;
        System.out.println("Binary string of 17: " +Integer.toBinaryString(s));
        // Result after shift operator
        s = s<<1;
        // Predicted decimal result after left shift is 34
        System.out.println("Decimal value after left shirt: "+s);
        // Predicted result after left shift is 10010
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(s));

        //Question 1c
        int t = 88;
        System.out.println("Binary string of 88: " +Integer.toBinaryString(t));
        // Result after shift operator
        t = t<<1;
        // Predicted decimal result after left shift is 176
        System.out.println("Decimal value after left shirt: "+t);
        // Predicted result after left shift is 10110000
        System.out.println("Binary string after left shift: " + Integer.toBinaryString(t));

        //Question 2
        int a = 150;
        System.out.println("Binary string of 150: " +Integer.toBinaryString(a));
        // Result after shift operator
        a = a>>2;
        // Predicted decimal result after right shift is 37
        System.out.println("Decimal value after right shirt: "+a);
        // Predicted result after right shift is 100101
        System.out.println("Binary string after right shift: " + Integer.toBinaryString(a));

        //Question 2a
        int b = 225;
        System.out.println("Binary string of 225: " +Integer.toBinaryString(b));
        // Result after shift operator
        b = b>>2;
        // Predicted decimal result after right shift is 56
        System.out.println("Decimal value after right shirt: "+b);
        // Predicted result after right shift is 111000
        System.out.println("Binary string after right shift: " + Integer.toBinaryString(b));

        //Question 2b
        int c = 1555;
        System.out.println("Binary string of 1555: " +Integer.toBinaryString(c));
        // Result after shift operator
        c = c>>2;
        // Predicted decimal result after right shift is 388
        System.out.println("Decimal value after right shirt: "+c);
        // Predicted result after right shift is 110000100
        System.out.println("Binary string after right shift: " + Integer.toBinaryString(c));

        //Question 2c
        int d = 32456;
        System.out.println("Binary string of 32456: " +Integer.toBinaryString(d));
        // Result after shift operator
        d = d>>2;
        // Predicted decimal result after right shift is 8114
        System.out.println("Decimal value after right shirt: "+d);
        // Predicted result after right shift is 1111110110010
        System.out.println("Binary string after right shift: " + Integer.toBinaryString(d));

        //Question 3
        int q =9; //  Binary 00111
        int w =13;// Binary 10001
        int z;
        z= q & w;
        // Predicted result in decimal value 1
        System.out.println(" Decimal value of q & w = " + z);
        //Question 4
        z = q | w;
        //Predicted result in decimal value 23
        System.out.println("Decimal value of q | w = " + z);

        //Question 5
        int i = 20;
        // Value before postfix increment
        System.out.println("Value before incrementing:" + i);
        // After postfix
        i++;
        System.out.println("Value after incrementing:" + i);
//Question 6
        int r = 5;
        r++;
        System.out.println("First increment: "+ r);
        r= r + 1;
        System.out.println("Second increment: "+ r);
        r+=1;
        System.out.println("Third increment: "+ r);
        //Question 7
        int xx= 5;
        int yy = 8;
        int sum = ++xx + yy;
        System.out.println("Sum of ++x + y:" + sum);
        xx = 5;
        sum = (xx++) + yy;
        System.out.println("Sum of x++ + y:" + sum);












    }
}