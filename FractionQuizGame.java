import java.util.Scanner;

public class FractionQuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int correct = 0;
        int total = 0;

        System.out.println("Let the Fraction quiz begin.");

        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Fraction ans = new Fraction();

        while (true) {
            a.ranFraction();
            b.ranFraction();

            int operator = (int) (Math.random() * 4);
            String opSymbol = "";

            if (operator == 0) {
                ans = Fraction.subtract(a, b);
                opSymbol = "-";
            } else if (operator == 1) {
                ans = Fraction.add(a, b);
                opSymbol = "+";
            } else if (operator == 2) {
                ans = Fraction.multiply(a, b);
                opSymbol = "*";
            } else {
                ans = Fraction.divide(a, b);
                opSymbol = "/";
            }

            ans.reduce();

            System.out.print(a + " " + opSymbol + " " + b + " = ");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            Fraction userans = new Fraction(input);
            total++;

            if (userans.Compare(ans)) {
                System.out.println("Correct!");
                System.out.println();
                correct++;
            } else {
                System.out.println("Wrong, the answer was " + ans);
                System.out.println();
            }
        }
        if (total > 0) {
            if (correct > 0) {
                Fraction ratio = new Fraction(correct, total);
                ratio.reduce();
                int percentage = (int) Math.round((double) correct / total * 100);
                System.out.println("\nYour win/loss ratio was " + ratio + ", for a score of " + percentage + " percent!");
            } else {
                Fraction ratio = new Fraction(0, total);
                int percentage = 0;
                System.out.println("\nYour win/loss ratio was " + ratio + ", for a score of " + percentage + " percent!");
            }
        } else {
            System.out.println("You answered no questions! Your win/loss ratio was 0/0, for a score of 0 percent!");
        }
    }


}

