 import java.text.NumberFormat;
 import java.util.Scanner;

 public class v3 {
    public static void main(String[] args){
        final byte months_in_year=12;
        final byte percent=100;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Principal:");

        int principal = scanner.nextInt();
        System.out.print("Annual interest rate:");

        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent/months_in_year;

        System.out.print("period (years):");
        byte years = scanner.nextByte();

        int numberOfPayments = years * months_in_year;
        double mortgage = principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))
        / (Math.pow(1+monthlyInterest,numberOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("mortgage $" +mortgageFormatted);
    }
   
}
