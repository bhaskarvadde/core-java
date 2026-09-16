package exceptionHandling.UnCheckedExceptions;

public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Main method started");

        String name = null;

        try {
            System.out.println(name.length());
        } 
        catch (NullPointerException e) {
            System.err.println("NullPointerException occurred");
            e.printStackTrace();
        }

        System.out.println("Main method ended");
    }
}