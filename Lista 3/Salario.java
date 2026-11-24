import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salarios = new double[5];
        
        System.out.println("Digite os 5 salários:");
        for (int i = 0; i < 5; i++) {
            salarios[i] = sc.nextDouble();
        }
        
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (salarios[i] < 2000) {
                salarios[i] = salarios[i] * 1.10;
            }
            System.out.printf("Funcionário %d: R$ %.2f\n", (i + 1), salarios[i]);
        }
        sc.close();
    }
}

