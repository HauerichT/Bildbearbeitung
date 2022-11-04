public class Main {
    public static void main(String[] args) {
        int[][] arrayBild = {{1,0,0},{0,1,0},{0,0,1},{0,1,0}};

        Bild bild = new Bild();
        bild.setArr(arrayBild);
        bild.flipAndInvert();
        bild.ausgabe();
    }
}