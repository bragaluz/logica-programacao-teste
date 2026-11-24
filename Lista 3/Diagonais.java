public class Diagonais {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        int somaPrinc = 0, somaSec = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%2d ", mat[i][j]);
                if (i == j) somaPrinc += mat[i][j];
                if (i + j == 3) somaSec += mat[i][j];
            }
            System.out.println();
        }
        
        System.out.println("Soma da diagonal principal: " + somaPrinc);
        System.out.println("Soma da diagonal secundária: " + somaSec);
    }
}

