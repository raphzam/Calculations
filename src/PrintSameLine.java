import java.util.Scanner;

public class PrintSameLine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        String firstWord;
        String secondWord;

        //Prompting user and getting input
        System.out.print("Input: " );
        firstWord = input.nextLine();

        System.out.print("Input: " );
        secondWord = input.nextLine();


        //Printing output on a single line
        System.out.println("Output: " + firstWord + " " + secondWord);
    }
}
