import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


//        Create a program that asks the user for a number.
//
//        The program should determine the smallest data type (having the least number of bits (Links to an external site.)) in which the number could be stored.
//
//        Print out the name of the data type.

public class Question7WrapperClasses {
    public static void main(String[] args) {
        Main();
    }

    public static void Main() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");

      double numberEntered = keyboard.nextDouble();
//    byte
//    short
//    int
//    long
//    double
        byte BValue = 0;
        short SValue = 0;
        int IValue = 0;
        long LValue = 0;
        double DValue = 0;

        if ((numberEntered <= Byte.MAX_VALUE) && (numberEntered >= Byte.MIN_VALUE)) {
            BValue = (byte) numberEntered;
            System.out.println("This is number fits in a BYTE");
        } else if ((numberEntered <= Short.MAX_VALUE) && (numberEntered >= Short.MIN_VALUE)) {
            SValue = (short) numberEntered;
            System.out.println("This is number fits in a SHORT");
        } else if ((numberEntered <= Integer.MAX_VALUE) && (numberEntered >= Integer.MIN_VALUE)) {
            IValue = (int)numberEntered;
            System.out.println("This is number fits in a INTERGER");
        } else if ((numberEntered <= Long.MAX_VALUE) && (numberEntered >= Long.MIN_VALUE)) {
            LValue = (long) numberEntered;
            System.out.println("This is number fits in a LONG");
        } else if ((numberEntered <= Double.MAX_VALUE) && (numberEntered >= Double.MIN_VALUE)) {
            DValue = (double) numberEntered;
            System.out.println("This is number fits in a Double");
        }else{
            System.out.println("Lets try this again");
            Main();
        }
    }
}
