package model;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Aluno aluno = new Aluno();
            // Cria uma nova instância de Aluno

            aluno.nome = lerInput(scanner, "Digite o nome do aluno: ");
            aluno.matricula = lerInput(scanner, "Digite a matrícula do aluno: ");
            aluno.endereco = lerInput(scanner, "Digite o endereço do aluno: ");
            aluno.telefone = lerInput(scanner, "Digite o telefone do aluno: ");
            aluno.email = lerInput(scanner, "Digite o e-mail do aluno: ");

            System.out.printf("Nome: %s Matrícula: %s Endereço: %s Telefone: %s E-mail: %s%n",
                    aluno.nome, aluno.matricula, aluno.endereco, aluno.telefone, aluno.email);
        }
    }

    private static String lerInput(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}
