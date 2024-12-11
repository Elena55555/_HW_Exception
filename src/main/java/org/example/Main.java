package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(task2IsInteger("133hhvjv"));
        task1ArithmeticException(10);
    }

    public static void task1ArithmeticException(int x) throws ArithmeticException {
        // Checking an integer for parity
        if (x % 2 == 0) {
            // Generating an exception if the number is even
            throw new ArithmeticException(x + " - the number is even");
        } else {
                    // Generating an exception if the number is odd
                    throw new ArithmeticException(x + " - the number is odd");
                }
        }

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
    }


