import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("ELOGIADOR!");
		System.out.println("Selecione a opção desejada:\n1-Elogio profissional\n2-Elogio físico\n3-Elogio pessoal");
		opcao = leitor.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Vc é um cara bom e sabe como chegar");
			break;
		case 2:
			System.out.println("Importante fazer do jeito que vc é");
			break;
		case 3:
			System.out.println("Parabéns");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}

		leitor.close();

	}

}
