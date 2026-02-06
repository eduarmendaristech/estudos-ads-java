public class CalculaMedia {
	public static void main(String[] args){
		double nota1 = 8.5;
		double nota2 = 7.0;

		double media = (nota1 + nota2) / 2;

		System.out.println("---Relatório de Notas---");
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("A média final é: " + media);

		boolean passou = media >= 6.0;
		System.out.println("Status de aprovação: " + passou);
	}
	}
