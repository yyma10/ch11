public class FractionDriver {

    public static void main(String[] args) {

        Fraction a = new Fraction();
        Fraction b = new Fraction(1, 2);
        Fraction c = new Fraction("14/38");
        c.reduce();
        Fraction d = new Fraction(c);


        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        System.out.println("a as a decimal: " + b.toDouble());
    }


    }

