java.lang.throwable;
class AgeException extends Exception {
}

public class UserDefinedException {
    public static void main(String[] args) {

        int age = 15;

        try {
            if (age < 18) {
                throw new AgeException();
            }

            System.out.println("Eligible to vote");

        } catch (AgeException e) {
            System.out.println("Not eligible to vote");
        }
    }
}
