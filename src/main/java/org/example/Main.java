package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("First task ");
        System.out.println(task2IsInteger("133hhvjv"));
        System.out.println(" ");
        System.out.println("Second task ");
        task1ArithmeticException(10);
        System.out.println(" ");
        System.out.println("Second task (second way) ");
        System.out.println(task3IsInteger("fjhgchxdxhtrs"));
    }

    public static void task1ArithmeticException(int x) throws ArithmeticException {
        // Checking an integer for parity
        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            // Generating an exception if the number is odd
            throw new ArithmeticException(x + " - the number is odd");
        }
    }

    /**
     * The method  checks if the string is a number
     *
     * @param s
     * @return returns true or false
     */

    public static boolean task2IsInteger(String s) {
        boolean result = false;
        try {
            Integer.parseInt("-1234");
            result = true;
        } catch (NumberFormatException nfe) {
            /** no need to handle
             * the exception
             */
        }
        return result;
    }

    /**
     * The method checks whether the string contains a number
     * Use the for loop and the Character.isDigit() method.
     * It determines whether a particular character is a digit.
     * @param s
     * @return true or  false
     */

    public static boolean task3IsInteger(String s) {
        try {
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}



