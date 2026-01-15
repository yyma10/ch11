public class Tile {
    //instance variables
    private char letter;
    private int value;

    public Tile (char ch, int v){
        this.letter = ch;
        this.value = v;

    }

    public static void printTile(Tile a){
        System.out.println(a);
    }

    public String toString(){
        return "Tile: " + letter + " worth " + value + " pts ";
    }

    public boolean equals(Tile t){
        return this.letter == t.letter;
    }

    public char getLetter(){
        return this.letter;
    }

    public void setLetter(char a){
        this.letter = a;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int a){
        this.value = a;
    }

    public static void main (String[] args){
        Tile z = new Tile ('z', 10);
        Tile.printTile(z);
    }

}
