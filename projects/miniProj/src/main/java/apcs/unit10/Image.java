package apcs.unit10;

public class Image {
    private final int BLACK = 1;
    private final int WHITE = 0;
    private int[][] image; // square grid
    private int size; // number of rows and columns

    // precondition: ar is a square 2d array
    public Image(int[][] ar) {
        image = new int[ar.length][ar.length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar.length; j++)
                image[i][j] = ar[i][j];
        size = ar.length;
    }

    public void display() {
        for (int[] row : image) {
            for (int cell : row)
                if (cell == WHITE)
                    System.out.print("W");
                else
                    System.out.print("B");
            System.out.println();
        }
    }

    // precondition: image is defined with either BLACK or WHITE cells
    // postcondition: If 0 <= row < size, 0 <= col < size,
    // and image[row][col] is BLACK, set all cells
    // in the same blob to WHITE. Otherwise image is unchanged
    public void eraseBlob(int row, int col) {
        //if row col is valid:
            //if image at row col is black:
                //set image to white
                //branch out

        if (row >= 0 && row < size && col >= 0 && col < size) {
            if(image[row][col] == BLACK){
                image[row][col] = WHITE;
                eraseBlob(row - 1, col);
                eraseBlob(row + 1, col);
                eraseBlob(row, col - 1);
                eraseBlob(row, col + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 0, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 0 }, { 0, 0, 1, 1 } };
        Image i = new Image(a);
        i.display();

        System.out.println();
        i.eraseBlob(0, 0);
        i.display();
    }

}
