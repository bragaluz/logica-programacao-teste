import java.util.Scanner;
public class MensagemDeBoasVindas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, " +nome+ "! Seja bem vindo(a).");

        sc.close();
    }
}

