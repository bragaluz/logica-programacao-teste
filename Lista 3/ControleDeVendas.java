import java.util.Scanner;

public class ControleDeVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] vendas = new int[3][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                vendas[i][j] = sc.nextInt();
            }
        }
        
        int totalGeral = 0;
        int maiorVenda = vendas[0][0];
        

        for (int i = 0; i < 3; i++) {
            int totalFunc = 0;
            for (int j = 0; j < 4; j++) {
                totalFunc += vendas[i][j];
                if (vendas[i][j] > maiorVenda) {
                    maiorVenda = vendas[i][j];
                }
            }
            System.out.println("Funcionário " + (i + 1) + ": " + totalFunc);
            totalGeral += totalFunc;
        }
        
        System.out.println("Total geral: " + totalGeral);
        System.out.println("Maior venda: " + maiorVenda);
        sc.close();
    }
}