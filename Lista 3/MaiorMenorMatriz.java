import java.util.Scanner;

public class MaiorMenorMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][3];
        
        // Lê os elementos da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int maior = mat[0][0];
        int menor = mat[0][0];
        
        // Encontra o maior e o menor
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] > maior) maior = mat[i][j];
                if (mat[i][j] < menor) menor = mat[i][j];
            }
        }
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}