public class BildTest {
    public static void main(String[] args) {

        // Testarrays
        int[][] testBild1 = {{1,1,0,1},{0,1,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] testBild2 = {{0,0,1,1,0},{0,1,0,1,1},{1,0,0,1,1},{0,1,0,1,0}};

        // Instanziierung der Bild-Objekte
        Bild bild1 = new Bild();
        Bild bild2 = new Bild();

        System.out.println("Testbild 1 flipped und inverted:");
        bild1.setArr(testBild1);
        Bild bild1FlippedAndInverted = bild1.flipAndInvert();
        bild1.ausgabe();

        System.out.println();

        System.out.println("Testbild 2 flipped und inverted:");
        bild2.setArr(testBild2);
        Bild bild2FlippedAndInverted = bild2.flipAndInvert();
        bild2.ausgabe();
    }
}