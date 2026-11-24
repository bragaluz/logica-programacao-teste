import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas= new double[5];
        double soma = 0;
        int aprovados=0, reprovados=0;

        System.out.println("Digite as 5 notas: ");
        for (int i = 0; i < 5; i++) {
            notas[i]= sc.nextDouble();
            soma+=notas[i];
            if (notas[i]>=7) aprovados++;
            else reprovados++;
        }
         double media = soma/5;

         System.out.printf("\nMédia da turma: %.2f\n",  media);
         System.out.println("Aprovados: " + aprovados);
         System.out.println("Reprovados: " + reprovados);

         sc.close();
    }

}
