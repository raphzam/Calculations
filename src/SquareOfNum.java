import java.util.Scanner;

public class SquareOfNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        int numOne;
        int numSquare;

        //Prompt user for input
        System.out.print("Input: ");
        numOne = input.nextInt();

        //Calculate square
        numSquare = (numOne * numOne);

        //print Square
        System.out.print("Output: " + numSquare);


    }
}
