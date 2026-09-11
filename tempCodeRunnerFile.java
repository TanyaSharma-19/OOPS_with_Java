

import java.util.Scanner;

public class Pre_defined_exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
            int[] arr = {1, 2, 3, 4, 5};
            int i, b;
            try{
            System.out.print("Enter array index: ");
            i = sc.nextInt();

            System.out.print("Enter divisor: ");
            b = sc.nextInt();

            System.out.println("Array element: " + arr[i]);
            System.out.println("Result: " + (arr[i] / b));
        }

        catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("Finallly executed");
        }
    }
}