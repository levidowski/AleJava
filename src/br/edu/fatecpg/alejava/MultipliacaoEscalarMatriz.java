// 2) MULTIPLICAÇÃO DE MATRIZ POR ESCALAR ====================================================== 

package br.edu.fatecpg.alejava;

import java.util.Scanner;

public class MultipliacaoEscalarMatriz {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] dados = {
				{"user1","1user"},	
				{"user2","2user"},
				{"user3","3user"},
				{"user4","4user"},
				{"user5","5user"},
				{"user6","6user"},
		};
		
		System.out.println("LOGIN: ");
		String login = scan.nextLine();
		
		System.out.println("PASSWORD: ");
		String senha = scan.nextLine();
		
		boolean acessoPermitido = false;
		
		for (int i = 0; i < 6; i++) {
			if (dados[i][0].equals(login) && (dados[i][1].equals(senha))) {
				acessoPermitido = true;
				break;
			}
		}
		
		if (acessoPermitido) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
		
		scan.close();
	}

}
