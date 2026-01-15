public class EstimatingPI {
    public static void main (String[] args){

        Fraction MILU = new Fraction(355,113);
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble());

        Fraction esti = new Fraction(1,1);

        while (Math.abs(esti.toDouble() - Math.PI) >= EPSILON) {
            if (esti.toDouble() < Math.PI){
                esti.setNum(esti.getNum() + 1);
            } else {
                esti.setDenom(esti.getDenom() + 1);
            }
        }

        System.out.println("Wow, the closest next fraction is: " + esti);
    }
}
