
public class JavaBasicsClass {
    public static void main(String[] args) {
        //Question 1
        int a= 3;
        int b= 4;
        int m = (a+b);
        System.out.println(m);

// Question 2
        double c = 2.0;
        double d = 5.0;
        double n = (c + d);
        System.out.println(n);

// Question 3
        int e = 4;
        double f = 2.3;
        double l = (e + f);
        System.out.println(l);
        // Sum must be double

//Question 4
        int g = 5;
        int h = 6;
        int o = h/g;
        System.out.println(o); //
        // Now changing second variable to double

        double h_double = 6.0;
        double o_double = h/g;
        System.out.println(o_double);
        //If second variable is declared as double then we need to change the variable use to store result to double.

        // Question 5
        double i = 6;
        double j = 5;
        double k = (i/ j);
        // Result before casting
        System.out.println("Result before casting: " + k);
        //Result after casting
         System.out.println("Result after casting: " + (int)(k));

         //Question 6
        int x= 5;
        int y =6;
        double q =y/x;
        // Result before casting
        System.out.println(q);
        //Result after casting
        q = (double)y;
        System.out.println("Y after casting: " + q);

        //Question 7
        final double PI = 3.14;
        int p = 2;
        System.out.println(PI * p);

        //Question 8
        double latte = 3.20;
        double expresso = 5.25;
        double frapuccino = 4.75;
        double subtotal = ((latte * 3) + (expresso * 4) + ( frapuccino * 2));
        final double SALES_TAX = 2.78;
        double totalSale = subtotal + SALES_TAX;
        System.out.printf("%.2f",totalSale);
        System.out.println();



    }
}
