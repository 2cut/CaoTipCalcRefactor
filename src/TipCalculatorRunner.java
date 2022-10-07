import java.util.Scanner; //importing a function that lets use receive user input

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //creating a obj to use Scanner methods

        /* Asking questions to get values for bill amount, tip percent, and total people*/
        System.out.println("How much was the bill?");
        double bill = scan.nextDouble();
        System.out.println("What percent would you like to tip?");
        int percent = scan.nextInt();
        System.out.println("How many people are there?");
        int people = scan.nextInt();

        TipCalculator bill1 = new TipCalculator(people, percent);
        bill1.addMeal(bill);

        /* Printing results */
        System.out.println("Your total tip is " + bill1.tipAmount());
        System.out.println("The total bill including tip is " + bill1.totalBill());
        System.out.println("The tip per person is " + bill1.perPersonTipAmount());
        System.out.println("The total for each person is " + bill1.perPersonTotalCost());
    }
}