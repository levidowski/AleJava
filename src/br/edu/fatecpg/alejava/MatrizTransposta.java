package br.edu.fatecpg.vetor;

import java.util.Scanner;

public class Main {
	//3
	//Desenvolva um código que realiza a transposição de uma matriz
	//(as colunas viram linhas e as linhas viram colunas).
	// Peça aos usuários para inserirem
	//os elementos da matriz, exibindo a matriz transposta no console.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] matriz = new String[2][2];
		
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c <2; c++) {
				System.out.println("Digite o valor para a linha " + (l+1) + " e coluna " + (c+1)+ ": ");
				matriz[l][c] = scan.nextLine();
			}
		}
		
		System.out.println("\nResultado da Matriz transposta: \n");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println(matriz[c][l] + "\t");
			}
		}
		
		scan.close();
	}

}
