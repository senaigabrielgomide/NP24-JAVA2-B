package br.com.senaisp.bauru.luizgabriel.licao06lacowhile;

public class Shape {

    public void criarRetangulo(int lar, int alt) {
        if (lar <= 0 || alt <= 0) {
            System.out.println("Não temos como fazer a figura!");
        } else {
            for (int lin = 1; lin <= alt; lin++) {
                for(int col=1; col<=lar; col++) {
                    if (lin==1 || lin==alt || col==lar || col==1) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    } // fim do else	
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }

    public void criarTriangulo(int lar, int alt) {
        if (lar <= 0 || alt <= 0) {
            System.out.println("Não temos como fazer a figura!");
        } else {
            int meio = (lar + 1) / 2; // Find the middle position of the base
            int espacos = meio - 1; // Number of spaces before the first '#' in each row
            int numCaracteres = 1; // Number of '#' in each row
            for (int lin = 1; lin <= alt; lin++) {
                // Print spaces before the first '#' in each row
                for (int i = 1; i <= espacos; i++) {
                    System.out.print(" ");
                }
                // Print '#' for the current row
                for (int i = 1; i <= numCaracteres; i++) {
                    System.out.print("#");
                }
                System.out.println(); // Move to the next line after each row
                espacos--; // Decrease the number of spaces before '#' for the next row
                numCaracteres += 2; // Increase the number of '#' for the next row
            }
        }
    }
}
