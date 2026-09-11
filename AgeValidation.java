

import java.util.Scanner;

public class AgeValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            ageValidation(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }

    static void ageValidation(int a) throws InvalidAgeException {
        if (a < 18)
            throw new InvalidAgeException("Age is invalid");
        system.out.println("elgible to vote");`
    }
}

class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg);
    }
}