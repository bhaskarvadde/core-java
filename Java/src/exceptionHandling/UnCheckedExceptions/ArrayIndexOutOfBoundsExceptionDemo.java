package exceptionHandling.UnCheckedExceptions;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Main method started");

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException occurred");
            e.printStackTrace();
        }

        System.out.println("Main method ended");
    }
}