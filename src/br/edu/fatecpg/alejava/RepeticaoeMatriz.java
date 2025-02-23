// 1) SOMA DE MATRIZES ======================================================

package br.edu.fatecpg.alejava;

import java.util.Scanner;

public class RepeticaoeMatriz {
    public static void main(String[] args) {
        
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizR = new int[3][3];
        Scanner scan = new Scanner(System.in);

        //MATRIZ A
        for (int l = 0; l < 3; l++) { 
            for (int c = 0; c < 3; c++) { 
                System.out.println("Matriz A | Digite o valor para a linha " + (l+1) + " e coluna " + (c+1) + ": ");
                matrizA[l][c] = scan.nextInt();
            }
        }

        //MATRIZ B
        for (int l = 0; l < 3; l++) { 
            for (int c = 0; c < 3; c++) { 
                System.out.println("Matriz B | Digite o valor para a linha " + (l+1) + " e coluna " + (c+1) + ": ");
                matrizB[l][c] = scan.nextInt();
            }
        }

        // Somando as matrizes A e B para obter MatrizR
        for (int l = 0; l < 3; l++) { 
            for (int c = 0; c < 3; c++) { 
                matrizR[l][c] = matrizA[l][c] + matrizB[l][c]; // Soma das matrizes
            }
        }

        // EXIBIR RESULTADO
        System.out.println("Matriz Resultado (Soma de A + B): ");
        for (int l = 0; l < 3; l++) { 
            for (int c = 0; c < 3; c++) { 
                System.out.print(matriz[c][l] + "\t");
            }
            System.out.println(); 
        }

        scan.close(); 
    }
}


