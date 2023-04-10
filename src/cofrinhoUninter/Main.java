package cofrinhoUninter;

import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("******** MENU ********");
		System.out.println(" 1 - ADICIONAR MOEDAS");
		System.out.println(" 2 - REMOVER MOEDAS");
		System.out.println(" 3 - LISTAR MOEDAS");
		System.out.println(" 4 - CONVERTER MOEDAS");
		System.out.println(" 5 - ENCERRAR PROGRAMA");
		System.out.println("**********************");

	}

	public static void miniMenu() {
		System.out.println("*** *** *** *** ***");
		System.out.println("*** *** MOEDAS *** ***");
		System.out.println("1 - DOLAR");
		System.out.println("2 - EURO");
		System.out.println("3 - REAL");
		System.out.println("4 - VOLTAR AO MENU PRINCIPAL");
		System.out.println("*** *** *** *** ***");
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;


		Cofrinho cofrinho = new Cofrinho();

		Moeda dolar = new Dolar();
		cofrinho.getListaMoedas().add(dolar);
		Moeda euro = new Euro();
		cofrinho.getListaMoedas().add(euro);
		Moeda real = new Real();
		cofrinho.getListaMoedas().add(real);


		while (opcao != 5) {
			menu();
			System.out.println("Qual opção deseja? ");
			opcao = teclado.nextInt();

			if (opcao == 1) {
				miniMenu();
				System.out.println("Qual tipo de moeda deseja adicionar? ");
				opcao = teclado.nextInt();

				if (opcao == 1) {
					System.out.println("Qual o valor que deseja acrescentar em Dolar? ");
					dolar.valor += teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 2) {
					System.out.println("Qual o valor que deseja acrescentar em Euro? ");
					euro.valor += teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 3) {
					System.out.println("Qual o valor que deseja acrescentar em Real? ");
					real.valor += teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 4) {
					opcao = 0;
					System.out.println("");
				}

			}

			if (opcao == 2) {
				miniMenu();
				System.out.println("Qual tipo de moeda deseja remover? ");
				opcao = teclado.nextInt();


				if (opcao == 1) {
					System.out.println("Qual o valor que deseja remover em Dolar? ");
					dolar.valor -= teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 2) {
					System.out.println("Qual o valor que deseja remover em Euro? ");
					euro.valor -= teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 3) {
					System.out.println("Qual o valor que deseja remover Real? ");
					real.valor -= teclado.nextDouble();
					opcao = 0;
				} else if (opcao == 4) {
					opcao = 0;
					System.out.println("");
				}

			}

			if (opcao == 3) {

				cofrinho.listagemMoedas(null);
				System.out.println("");
			}

			if (opcao == 4) {
				System.out.println("*** *** *** *** ***");
				System.out.println("*** *** MOEDAS *** ***");
				System.out.println("1 - DOLAR");
				System.out.println("2 - EURO");
				System.out.println("3 - TODAS AS MOEDAS CONVERTIDAS EM REAL");
				System.out.println("4 - VOLTAR AO MENU PRINCIPAL");
				System.out.println("*** *** *** *** ***");
				System.out.println("Qual tipo de moeda deseja converter para real? ");
				opcao = teclado.nextInt(); // leitura da escolha do usuário


				if (opcao == 1) {
					System.out.println("Dolar convertido para Real= " + cofrinho.totalConvertido(dolar));
					opcao = 0;
				} else if (opcao == 2) {
					System.out.println("Euro convertido para Real= " + cofrinho.totalConvertido(euro));
					opcao = 0;
				} else if (opcao == 3) {
					double total = 0;
					total += cofrinho.totalConvertido(real);
					total += cofrinho.totalConvertido(dolar);
					total += cofrinho.totalConvertido(euro);
					System.out.println(total);
					System.out.println("Valor de todas as moedas convertidas em Real= " + total);
					opcao = 0;
				} else if (opcao == 4) {
					opcao = 0;
					System.out.println("");
				}

			}

		}

		System.out.println("PROGRAMA ENCERRADO, VOLTE SEMPRE...");

	}

}
