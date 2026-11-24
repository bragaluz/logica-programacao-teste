import java.util.Scanner;

public class Primos {
    static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    static int[] filtrarPrimos(int[] v) {
        int cont = 0;
        for (int n : v) if (ehPrimo(n)) cont++;
        
        int[] primos = new int[cont];
        int idx = 0;
        for (int n : v) if (ehPrimo(n)) primos[idx++] = n;
        return primos;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        System.out.println("Digite 8 números:");
        for (int i = 0; i < 8; i++) nums[i] = sc.nextInt();
        
        int[] primos = filtrarPrimos(nums);
        System.out.print("Números primos: ");
        for (int p : primos) System.out.print(p + " ");
    }
}