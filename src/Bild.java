public class Bild {

    private int[][] arr;

    public void setArr (int[][] arr) {

        // prüft, ob leere Arrays übergeben werden
        if (arr.length == 0 || arr == null) {
            System.out.println("null-Referenz oder ein leeres Array gefunden.");
            System.exit(0);
        }

        // prüft, ob ein binäres Bild übergeben wurde
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    System.out.println("Array enthält kein binäres Bild.");
                    System.exit(0);
                }
            }
        }

        this.arr = arr;
    }

    // Methode um Werte des Arrays anzupassen und Reihenfolge des Arrays zu tauschen
    public Bild flipAndInvert() {

        for (int i = 0; i < arr.length / 2; i++) {
            int[] temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                }
                else {
                    arr[i][j] = 1;
                }
            }
        }

        return this;
    }

    // Methode um angepasstes Array auszugeben
    public void ausgabe() {
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr[i].length; j++ ) {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
