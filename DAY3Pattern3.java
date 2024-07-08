package CodeToGether;

public class DAY3Pattern3 {
    public static void main(String[] args) {
        int row = 3;
        int col = 5;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (j >= col/2 - i && j <= col/2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
