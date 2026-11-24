public class TotalDeVendas {
    public static void main(String[] args) {
        
        int[][] vendas = {
            {100, 200, 150, 50},
            {300, 100, 250, 200},
            {80, 120, 400, 100}
        };
        
        int totalDia, maiorTotal = 0, diaMaior = 0;
        
        for (int j = 0; j < 4; j++) {
            totalDia = vendas[0][j] + vendas[1][j] + vendas[2][j];
            System.out.println("Dia " + (j + 1) + ": " + totalDia);
            
            if (totalDia > maiorTotal) {
                maiorTotal = totalDia;
                diaMaior = j + 1;
            }
        }
        
        System.out.println("Maior total: Dia " + diaMaior + " (" + maiorTotal + ")");
    }
}

