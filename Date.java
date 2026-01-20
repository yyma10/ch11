public class Date {
    private int year, month;
    private int day;

    //DEFAULT CONSTRUCTOR
    public Date() {
        this.year = 2026;
        this.month = 1;
        this.day = 15;
    }

    public Date(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public static void main(String[] args){
        Date birthday = new Date();
    }
}
