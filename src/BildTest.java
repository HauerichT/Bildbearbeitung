public class BildTest {
    public static void main(String[] args) {

        // Testarrays
        int[][] testBild1 = {{1,1,0,1},{0,1,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] testBild2 = {{0,0,1,1,0},{0,1,0,1,1},{1,0,0,1,1},{0,1,0,1,0}};

        // Instanziierung der Bild-Objekte
        Bild bild1 = new Bild();
        Bild bild2 = new Bild();

        // Testszenario 1
        System.out.println("Testbild 1 flipped und inverted:");
        bild1.setArr(testBild1);
        bild1.flipAndInvert();
        bild1.ausgabe();

        // Spacer
        System.out.println();

        // Testszenario 1
        System.out.println("Testbild 2 flipped und inverted:");
        bild2.setArr(testBild2);
        bild2.flipAndInvert();
        bild2.ausgabe();
    }
}