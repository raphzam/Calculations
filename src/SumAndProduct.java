import java.util.Scanner;

public class SumAndProduct {

    public static void main(String[] args) {

        //create new scanner for input
        Scanner input = new Scanner(System.in);

        //variables
        int numOne;
        int numTwo;
        int sum;
        int product;

        //Get input for numOne
        System.out.println("Enter a number:");
        numOne = input.nextInt();

        //Get input for numTwo
        System.out.println("Enter another number:");
        numTwo = input.nextInt();

        //Assign the sum of numOne plus numTwo to sum
        sum = numOne+numTwo;
        System.out.println("Sum: " + sum);

        //Assign the product of numOne times numTwo to product
        product = (numOne * numTwo);
        System.out.println("Product : " +  product);


    }
}
