

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor do Produto: ");
        double preco = entrada.nextDouble();

        System.out.print("Porcentagem de Desconto: ");
        double desconto = entrada.nextDouble();

        double valorFinal = preco - (preco * (desconto / 100));

        System.out.println("O valor com desconto é: R$ " + valorFinal);

        entrada.close();


    }
}