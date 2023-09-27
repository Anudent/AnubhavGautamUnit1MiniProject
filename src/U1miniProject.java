import java.util.Scanner;

public class U1miniPROJECT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people are in the party?");
        int numOfPeople = scan.nextInt();                // storing the value for number of people in a variable
        System.out.println("What was the bill?");
        double bill = scan.nextInt();        // storing the value for the initial bill in a variable
        System.out.println("How much do you want to tip?");
        int tipPercent = scan.nextInt();             // storing the value for desired tip in a variable


        double totalTip = bill * tipPercent / 100;     // initializing and calculating
        double totalBill = bill * totalTip;
        double billPer = totalBill / numOfPeople;
        double tipPer = totalTip / numOfPeople;

        System.out.println("Your bill per person is $" + billPer);
        System.out.println();
        System.out.println("Your tip per person is $" + tipPer);
        System.out.println();
        System.out.println("Your total tip is $" + totalTip);
        System.out.println();
        System.out.println("Your total bill is $" + totalBill);

    }
    }
