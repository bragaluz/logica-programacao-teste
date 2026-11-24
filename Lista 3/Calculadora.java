import java.util.Scanner;

public class Calculadora {
    
    static double somar(double a, double b) {
        return a + b;
    }
    
    static double subtrair(double a, double b) {
        return a - b;
    }
    
    static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        
        System.out.println("Soma: " + somar(n1, n2));
        System.out.println("Subtração: " + subtrair(n1, n2));
        System.out.println("Multiplicação: " + multiplicar(n1, n2));
        
        if (n2 == 0) {
            System.out.println("Divisão: não é possível dividir por zero.");
        } else {
            double resultado = n1 / n2;
            System.out.println("Divisão: " + resultado);
        }
        
        sc.close();
    }
}


