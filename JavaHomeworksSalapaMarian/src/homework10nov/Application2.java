/*
 all possible operations for the 8 standard variables types defined in java
 */
package homework10nov;

/**
 *
 * @author MMM
 */
public class Application2 {

 
//int operations
    public static void intOperations() {

        int a = 12;

        a = a + 1; // a is now 13
        System.out.println("a+1=" + a);

        a = a - 1; // a is now 12
        System.out.println("a-1=" + a);
        a++; // a is now 13
        System.out.println("a++=" + a);

        a--; // a is now 12
        System.out.println("a--=" + a);

        a = a * 9; // a is now 108
        System.out.println("a=" + a * 9);

        a = a / 4; // a is now 27
        System.out.println("a=" + a);

        a = a % 5; // a is now 2
        System.out.println("a=" + a);

        a = -a; // a is now -2

        System.out.println("a=" + a);
        System.out.println("abs value of a is" + Math.abs(a));
        System.out.println("1+2+3=" + 1 + 2 + 3);
        System.out.print("1+2+\"3\"=");
        System.out.println(1 + 2 + "3");

        System.out.println(a == (-2) ? "a=-2" : "a!=-2");
        System.out.println(a > (-3) ? "a>-3" : "a<=-3");
        System.out.println(a <= (5) ? "a<=3" : "a>3");

        a = a + 12;

        System.out.println("bit 0 is:" + (a & 1));
        System.out.println("bit 1 is:" + (a >> 1));
        System.out.println("bit 2 is:" + (a >> 2));
        System.out.println("bit 3 is:" + (a >> 3));
        System.out.println("min between a and 3 is " + Math.min(a, 3));
        System.out.println("max between a and 2 is " + Math.min(a, 2));
        System.out.println("pow(a,2) " + Math.pow(a, 2));
        System.out.println("sqrt(a) " + Math.sqrt(a));

    }

//long operations
    public static void longOperations() {

        long l = 622_282_328;
        long l2=0xC3_70_7A_16;
        System.out.println(l+"\n"+l2);

    }


//short operations
    public static void shortOperations() {
     
        short s=35;
        System.out.println(s);
    }
 
//float operations
    public static void floatOperations() {
        float f = 8.54f;
        double d = 8.54;

        System.out.println("float f is " + f);
        System.out.println("double d is " + d);

        System.out.println(f == d ? "f is equal to d" : "f is not equal d");

        System.out.println("f-d = " + (f - d));

        //returns the smallest integer that is greater (as a float)
        System.out.println(Math.ceil(d));

        //returns the closest integer as a float
        System.out.println(Math.floor(d));

        System.out.println("min between f and 9.0f is " + Math.min(f, 9.0f));

        System.out.println("max between f and 9.0f is " + Math.max(f, 9.0f));

    }

//double operations    
    public static void doubleOperations() {

        double d = 4.0;

        double d2 = 8 / d;

        System.out.println("8/4.0 =" + d2);

        d = 4.6;

        //returns the smallest integer that is greater (as a double)
        System.out.println(Math.ceil(d));

        //returns the integer closest to the argument as a double
        System.out.println(Math.floor(d));

        System.out.println(Math.rint(d));

        System.out.println(Math.round(d));

        System.out.println("min between d and 9.0 is " + Math.min(d, 5.1));

        System.out.println("max between d and 9.0 is " + Math.max(d, 5.1));

        System.out.println("log(d)= " + Math.log(d));

        d = 45.0;

        //math functions sin, cos, tan,asin, acos 
        System.out.println("sin(45)=" + Math.sin(d) + ";cos(45)=" + Math.cos(d) + ";tan(45)=" + Math.tan(d) + ";sin(45)=" + Math.asin(d) + ";asin(45)=" + Math.acos(d));

        System.out.println(Math.random());//random number

    }

    
//boolean operations    
    public static void booleanOperations() {

        boolean a = false;

        boolean b = true;

        System.out.println("a|b" + (a | b));

        System.out.println("a&b" + (a & b));

        System.out.println("a^b" + (a ^ b));

        System.out.println("!a" + (!a));

    }

    public static void charOperations() {

        char c1 = 'a', c2 = 'b';

        System.out.println("c1 is " + c1);

        System.out.println("c1 is " + c2);

        int c = c1 + c2;

        System.out.println("c1+c2 is " + c);

        System.out.println("c1+10 is " + (c1 + 10));

    }

}
