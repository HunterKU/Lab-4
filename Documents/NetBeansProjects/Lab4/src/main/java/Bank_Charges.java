import java.util.Scanner;
 public class Bank_Charges{
     public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Please enter the quantity of checks for the month");
     int numberofchecks = keyboard.nextInt();
     System.out.println("Your final charges are: $" + calculateBankFees(numberofchecks));
}

public static double calculateBankFees(int numChecks) {

    double baseFee = 10;
    double finalCharge = 0;
    double checkFee = 0;
    
    if (numChecks < 20) {
      checkFee = 0.10;
    } else if (numChecks >= 20 && numChecks < 40) {
      checkFee = 0.08;
    } else if (numChecks >= 40 && numChecks < 60) {
      checkFee = 0.06;
    } else {
      checkFee = 0.04;
    }

    finalCharge = baseFee + (checkFee * numChecks);

    return finalCharge;
  }
}