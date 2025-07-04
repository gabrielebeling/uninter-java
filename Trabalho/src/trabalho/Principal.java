package trabalho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofre = new Cofrinho();
		
		while(true) {
		
		String menu = ("1 - Adicionar moeda.\n"
				+ "2 - Remover moeda.\n"
				+ "3 - Listar moedas.\n"
				+ "4 - Calcular total das moedas.\n"
				+ "5 - Sair.\n");
		
		
		System.out.print(menu); //Imprime o menu na tela
		
		try { 
			opcao = teclado.nextInt();
			} catch(Exception e) {
				System.out.println("Digite uma opção válida.");
				teclado.nextLine();
				continue;
			} //Verifica se o menu foi escolhido corretamente
		
			switch(opcao)
			{
			case 1: // Adicionar Moeda
				int tipo = 0;
				Moeda ins = null;
				
				while (tipo > 3 || tipo < 1) //Verifica se foi inserida uma moeda válida
				{
					System.out.println("1 - Real.");
					System.out.println("2 - Dolar.");
					System.out.println("3 - Euro.");
					
					try {
					tipo = teclado.nextInt();
					} catch(Exception e) {
						System.out.println("Digite uma opção válida.");
						teclado.nextLine();
						continue;
					}
				}
				
				System.out.println("Qual o valor? ");
				double v = 0;
				
				try {
					v = teclado.nextDouble();
					} catch(Exception e) {
						System.out.println("Número inválido.");
						teclado.nextLine();
						continue;
					} //Verifica se foi inserido um valor válido
				
				switch (tipo) {
				case 1: 
					ins = new Real(v);
					break;
				case 2:
					ins = new Dolar(v);
					break;
				case 3:
					ins = new Euro(v);
					break;
				}
				
				cofre.adicionar(ins);
				break;
				
			case 2: //Remover moeda
				int tipoR = 0;
				Moeda insR = null;
				
				while (tipoR > 3 || tipoR < 1)
				{
					System.out.println("1 - Real.");
					System.out.println("2 - Dolar.");
					System.out.println("3 - Euro.");
					
					try {
						tipoR = teclado.nextInt();
						} catch(Exception e) {
							System.out.println("Digite uma opção válida.");
							teclado.nextLine();
							continue;
						} //Verificação
				}
				
				System.out.println("Qual o valor? ");
				
				double vR = 0;
				try {
					vR = teclado.nextDouble();
					} catch(Exception e) {
						System.out.println("Número inválido.");
						teclado.nextLine();
						continue;
					} //Verificação
				
				switch (tipoR) {
				case 1:
					insR = new Real(vR);
					break;
				case 2:
					insR = new Dolar(vR);
					break;
				case 3:
					insR = new Euro(vR);
					break;
				}
				
				cofre.remover(insR);
				break;
			case 3: //Listar valores
				cofre.listar();
				break;
			case 4:
				System.out.println("Total convertido em reais: " + cofre.totalConvertido());
				break;
			case 5:
				System.out.println("Encerrando programa...");
				teclado.close(); //Para de registrar o teclado
				return;
			}
		}
	}
}


