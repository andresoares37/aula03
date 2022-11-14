import java.util.Scanner;

public class OperadorXou {

	public static void main(String[] args) {
		/*
		 * Em uma ONG h� uma horta monitorada e automatizada por um arduino. Escreva o
		 * c�digo de um programa que receba a umidade relativa do ar e a temperatura
		 * atual. Caso a umidade seja maior que 70% ou caso o temperatura seja maior que
		 * 26�C, exibir a mensagem "ligando os ventiladores". Caso as duas condi��es
		 * sejam verdadeiras ou falsas, exibir a mensagem:
		 * "Entrar em contato com agr�nomo".
		 */
		Scanner leitor = new Scanner(System.in);
		Double umidade, temperatura;
		System.out.println("Por favor, insira a umidade relativa do ar:");
		umidade = leitor.nextDouble();
		System.out.println("Por favor, insira a temperatura em graus celsius: ");
		temperatura = leitor.nextDouble();

		if (umidade > 70 || temperatura > 26) {
			System.out.println("ligando os ventiladores");
		}
		else if (umidade > 70 && temperatura > 26 || umidade < 70 && temperatura < 26) {
			System.out.println("Entrar em contato com agrônomo");
		}
		else {
			System.out.println("Entrar em contato com agrônomo");
		}

		leitor.close();

	}

}
