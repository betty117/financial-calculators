import java.util.Scanner;
public class FinancialCalculators{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("===Finance Calculator===\n: ");
        System.out.print("1. Mortgage Calculator:");
        System.out.print("2. Future Value of Deposit (CD):");
        System.out.print("3. Present Value of ordinary Annuity:");
        System.out.print("4. Choose an option(1-3):");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                mortgageCalculator(input);
                break;
                case 2:
                    futureValueCalculator(input);
                    break;
                    case 3:
                        annuityCalculator(input);
                        break;
                        default:
                            System.out.println("Invalid choice");
        }

    }//calculate1: Mortgage---
    public static void  mortgageCalculator(Scanner input){
        System.out.println(" Enter lone amount (Principal):");
        double p = input.nextDouble();
        System.out.println(" Enter annual interest rate (e.g , 7.625 for 7.625% ):");
        double r = input.nextDouble();
        System.out.println(" Enter loan term in years:");
        int y = input.nextInt();

        int n=12*y;
        double i = r/12.0;
        //mortgage formula
        double M= p* (i* Math.pow(1+i, n)) / (Math.pow(1+i, n)-1);
        double totalInterset =(M*n)-p;
        System.out.printf("Monthly payment : $%.2f\n",M);
        System.out.printf("Total interest rate : %.2f\n",totalInterset);}

        // Calculator 2: Future Value---
        public static void futureValueCalculator(Scanner input) {
            System.out.print("Enter deposit amount(principal):");
            double P = input.nextDouble();
            System.out.print("Enter annual interest rate( e.g , 1.75 or 1.75%):");
            double R = input.nextDouble();
            System.out.print("Enter loan term in years:");
            int Y = input.nextInt();
             int days =365 * Y;
             double FV =9*Math.pow(1+R /365.0, days);
             double interestEarned =FV - P;
              System.out.printf(" Future Value : $%.2f\n",FV);
              System.out.printf(" Total Interest Earned : $%.2f\n",interestEarned);
    }
              // Calculate 3 : Present Value of Ordinary Annuity---
            public static void annuityCalculator(Scanner input) {
                System.out.print("Enter monthly payment(PMT):");
                double PMT = input.nextDouble();
                System.out.print("Enter annual interest rate(e.g , 2.5 for 2.5%):");
                double r = input.nextDouble();
                System.out.print("Enter a number of  years:");
                double y = input.nextDouble();
                        double n = 12 * y ;
                        double i=r /12.0;
                        //present value formula
                double pv =PMT *(1-Math.pow(1+i,-n)) /i;
                System.out.printf("present value of Annuity : %.2f\n",pv);


            }


        }








