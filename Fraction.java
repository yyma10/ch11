public class Fraction {
    //instance variables
    private int numerator;
    private int denominator;

    //constructors
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction (int num, int den){
        this.setNum(num);
        this.setDenom(den);
    }

    public Fraction (String frac){
        String[] numbers = frac.split("/");
        int num = Integer.parseInt(numbers[0]);
        int den = Integer.parseInt(numbers[1]);

        this.numerator = num;
        if (den!= 0) {
            this.denominator = den;
        } else {
            this.denominator = 1;
            System.out.println("Error: Denominator can't be zero");
        }
    }

    public Fraction(Fraction f){
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    //behavior models
    public String toString() {
        return numerator + "/" + denominator;
    }

    //accessor methods
    public int getNum(){
        return numerator;
    }

    public int getDenom(){
        return denominator;
    }

    public double toDouble(){
        return (double) numerator /denominator;
    }

    //mutator methods
    public void setNum(int a){
        numerator = a;
    }


    public void setDenom(int den){
        if (den!= 0) {
            this.denominator = den;
        } else {
            this.denominator = 1;
            System.out.println("Error: Denominator can't be zero");
        }
    }

    //class methods
    public static Fraction multiply(Fraction a, Fraction b){
        int newNum = a.getNum() * b.getNum();
        int newDenom = a.getDenom() * b.getDenom();;

        return new Fraction(newNum, newDenom);
    }

    public static Fraction divide(Fraction a, Fraction b){
        if (b.toDouble() == 0) {
            System.out.println("Sham on you for dividing by a 0");
            return null;
        }

        int newNum = a.getNum() * b.getDenom();
        int newDenom = a.getDenom() * b.getNum();;

        return new Fraction(newNum, newDenom);
    }

    public static Fraction add(Fraction a, Fraction b){
        int newNum = a.getNum()*b.getDenom() + b.getNum()*a.getDenom();
        int newDenom = a.getDenom() * b.getDenom();

        return new Fraction(newNum, newDenom);
    }

    public static Fraction subtract(Fraction a, Fraction b){
        int newNum = a.getNum()*b.getDenom() - b.getNum()*a.getDenom();
        int newDenom = a.getDenom() * b.getDenom();

        return new Fraction(newNum, newDenom);
    }

    //helper methods
    public void reduce(){
    int gcf = GCF(numerator, denominator);
    numerator = numerator / gcf;
    denominator = denominator / gcf;

    }

    private static int GCF(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    //fraction quiz game
    public void ranFraction() {
        this.numerator = (int) (Math.random()*9) + 1;
        this.denominator = (int) (Math.random()*9) + 1;
    }

    public boolean Compare (Fraction a){
        return ((this.numerator == a.numerator) && (this.denominator == a.denominator));
    }
}

