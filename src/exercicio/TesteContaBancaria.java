package exercicio;

	
	import java.util.Locale;
	import java.util.Scanner;

	public class TesteContaBancaria {

		public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			ContaBancaria conta;

			System.out.println("Digite o número da conta: ");
			int num = sc.nextInt();

			System.out.println("Digite o nome do titular da conta: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Deseja fazer um depósito inicial? (s/n)");
			char x = sc.next().charAt(0);

			if (x == 's') {
				System.out.println("Valor do depósito inicial: ");
				double deposito = sc.nextDouble();
				conta = new ContaBancaria(num, nome, deposito);
			} else {
				conta = new ContaBancaria(num, nome);
			}

			System.out.println();
			System.out.println("DADOS DA CONTA:");
			System.out.println(conta);
			System.out.println();
			
			
			System.out.println("");
		}

	}

	

