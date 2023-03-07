package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if ((number % 5 == 0) && (number % 11 == 0) && number!=0) {
            System.out.println("Dividable");
        } else if ((number % 5 != 0) && (number % 11 != 0) && number!=0 ) {
            System.out.println("Non-dividable");
        } else if (number == 0) {
            System.out.println("cannot divide by zero");
        }
    }
}

//Implement the program to check and print whether a number from method argument is divisible by 5 and 11
// or not by using if-else(print "Dividable" if so otherwise "Non-dividable" and if 0 -> "cannot divide by zero"):
