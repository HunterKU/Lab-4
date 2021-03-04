import java.util.Scanner;
public class Insurance_Estimator {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your age for your insurance quote");
    int age = keyboard.nextInt();
    InsuranceEstimation(age);
   }
    public static void InsuranceEstimation(int agecalculation) {
        int total_cost = 0;
        int multiplier = 5;
        int base_cost = 300;
        total_cost = multiplier * agecalculation + base_cost; 
        System.out.println("Your estimated life insurance cost is $" + total_cost + "/year");
    }
}
