/*
 * Wrapper Classes operations
 */
package homework10nov;

/**
 *
 * @author MMM
 */
public class Application3 {

    public static void classIntegerOperations() {

        String numtext = "23";

        int a = Integer.parseInt(numtext);
        System.out.println("a=" + a);

        a = a + 45;
        numtext = Integer.toString(a);
        System.out.println(numtext + "is 68");

        Integer a1 = a;
        byte b = a1.byteValue();
        System.out.println(b);

        short s = a1.shortValue();
        System.out.println(s);

        double d = a1.doubleValue();
        System.out.println(d);

        long l = a1.longValue();
        System.out.println(l);

        Integer a2 = Integer.valueOf(3);

        System.out.println(a1.compareTo(a2));
        System.out.println(a1.equals(a2));

        Integer a3 = Integer.valueOf(-3);

        System.out.println(Math.abs(a3)); //Returns the absolute value of the argument
        System.out.println(Integer.hashCode(a3)); //Returns the hash code of the object a3
    }

    public static void classByteOperations() {

        Short s = 5;

        byte b = s.byteValue();

        System.out.println(b);

        b = Byte.parseByte("2");
        
        b++;
        String bText=Byte.toString(b);
        System.out.println(bText+"is a text");
    }

    public static void classShortOperations() {

        Byte b = 3;

        short s = b.shortValue();

        System.out.println(s);

        s = Short.parseShort("22");

        s++;
        String sText=Short.toString(s);
        System.out.println(sText+"is a text");
    }

    public static void classLongOperations() {

        Long l = new Long(231_232_212);
        Double d=new Double(3.5);
        long l2=d.longValue();
        System.out.println(l2);
        
        System.out.println("Binary = " + Long.toBinaryString(l));
        System.out.println("Number of one bits = " + Long.bitCount(l)); 
        
        String str = "57820";
        System.out.println("Number = " + l.decode(str));
        
        int retval = l.hashCode();
        
    }

    public static void classFloatOperations() {

        Float f = new Float(3.2f);

        Float f2 = 3.6f;

        f = Float.parseFloat("5.4f");

        f++;
        String fText=Float.toString(f);
        System.out.println(fText+"is a text");
    }

    public static void classDoubleOperations() {

        Double d = new Double(3.2);

        Double d2 = 2.5;

        d = Double.parseDouble("5.8");

        d=d+8.7;
        String dText=Double.toString(d);
        System.out.println(dText+"is a text");
    }

    public static void classBooleanOperations() {

        Boolean bObj = false;

        Boolean b2Obj = false;

        boolean bPimitive = Boolean.valueOf(bObj);

        bPimitive = bObj.equals(b2Obj);

        String s = "false";

        boolean bsPimitive = Boolean.parseBoolean(s);

    }

    public static void classCharacterOperations() {

        Character c = new Character('c');

        Character c2 = new Character('5');

        System.out.println(Character.isLetter(c) ? "c is a letter" : "c is not a letter");

        System.out.println(Character.isLetter(c2) ? "5 is a letter" : "5 is not a letter");

        System.out.println(Character.isDigit(c) ? "c is a digit" : "c is not a digit");

        System.out.println(Character.isWhitespace(c) ? "c is white space" : "c is not white space");

        System.out.println(Character.isUpperCase(c) ? "c is upper case" : "c is not upper case");

        System.out.println(Character.isLowerCase(c) ? "c is a lower case" : "c is not lower case");

        Character.toUpperCase(c);// c is now 'C'

        System.out.println("c is now" + c);

        Character.toLowerCase(c);// c is now 'c'

        System.out.println("c is now" + c);

        String c3 = Character.toString(c);// c3 is a String

        System.out.println(c3 + 333);

    }

}
