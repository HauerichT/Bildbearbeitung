import java.util.Arrays;

public class Bild {

    private int[][] arr;

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public void flipAndInvert() {

        for (int i = 0; i < arr.length / 2; i++) {
            int[] temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

    }

    public void ausgabe() {

        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr[i].length; j++ ) {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
