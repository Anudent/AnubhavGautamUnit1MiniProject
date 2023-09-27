import java.util.Scanner;

public class U1miniProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people are in the party?");
        int numOfPeople = scan.nextInt();                // storing the value for number of people in a variable
        System.out.println("What was the initial bill?");
        double bill = scan.nextDouble();        // storing the value for the initial bill in a variable
        System.out.println("What percentage do you want to tip?");
        double tipPercent = scan.nextInt();        // storing the value for desired tip in a variable
        tipPercent /= 100;


        double totalTip = ((int) ((bill*tipPercent)*100))/100.0;     // declaring and calculating
        double totalBill = ((int) ((bill + totalTip)*100))/100.0;
        double billPer = (int) (totalBill / numOfPeople*100)/100.0;
        double tipPer = (int) ((totalTip/numOfPeople)*100)/100.0;

        System.out.println("Your bill per person is $" + billPer);
        System.out.println();
        System.out.println("Your tip per person is $" + tipPer);
        System.out.println();
        System.out.println("Your total tip is $" + totalTip);
        System.out.println();
        System.out.println("Your total bill is $" + totalBill);

    }
    }
