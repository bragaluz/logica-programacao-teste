import java.util.Scanner;

public class BuscaNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[6];
        
        for (int i = 0; i < 6; i++) {
            nomes[i] = sc.next();
        }
        
        System.out.print("Buscar qual nome? ");
        String busca = sc.next();
        
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                System.out.println("Encontrado na posição " + (i + 1));
                cont++;
            }
        }
        
        if (cont == 0) {
            System.out.println(busca + " não foi encontrado.");
        } else {
            System.out.println(busca + " aparece " + cont + " vez(es).");
        }
        
        sc.close();
    }
}