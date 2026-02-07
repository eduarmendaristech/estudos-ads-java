import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== Sistema de Gestão Acadêmica v2.0 ===");

        while (continuar) {
            exibirMenu();
            int opcao = leitor.nextInt();

            if (opcao == 1) {
                processarMedia(leitor);

            } else if (opcao == 0) {
                continuar = false;
                System.out.println("Encerrando o Sistema... Até logo! ");

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        leitor.close();
    }


    public static void exibirMenu() {
        System.out.println("\n1 - Calcular Média");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção: ");

    }


    public static void processarMedia(Scanner leitor) {
        double n1 = lerNota(leitor, "primeira");
        double n2 = lerNota(leitor, "segunda");

        System.out.print("Digite a FREQUÊNCIA DO ALUNO (0-100%): ");
        Double frequencia = leitor.nextDouble();


        double resultado = (n1 + n2) / 2;
        System.out.printf("\n---Resultado Final ---\n");
        System.out.printf("Média: %.2f | Frequência: %.1f%%\n", resultado, frequencia);


        if (resultado >= 6.0 && frequencia >= 75.0) {
            System.out.println("Status: Aprovado por Mérito");
        } else if (resultado >= 6.0 && frequencia < 75.00) {
            System.out.println("Status: Reprovado por Infrequência");
        } else if (resultado < 6.0 && frequencia >= 75.0) {
            System.out.println("Status: Reprovado por Nota");


        } else {
            System.out.println("Status: Reprovado (Nota e frequência baixas)");
        }

    }


    public static double lerNota(Scanner leitor, String ordem) {
        double nota;
        while (true) {
            try {
                System.out.println("Digite a " + ordem + " nota (0-10): ");
                return leitor.nextDouble();

            } catch (java.util.InputMismatchException ex) {
                System.out.println("Erro: Por favor, digite apenas números.");
                leitor.next();
            } catch (Exception ex) {
                System.out.println("Aldo deu errado: " + ex.getMessage());
                leitor.next();
            }

        }
    }

}

