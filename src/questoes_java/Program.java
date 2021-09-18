package questoes_java;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int questao;

        System.out.println("Primeira Atividade:");
        System.out.println("Informe a questão que deseja resolver:");
        System.out.println("1 - Pessoa Mais Velha");
        System.out.println("2 - Salário Médio");
        System.out.println("3 - Retângulo");
        System.out.println("4 - Aumento Salarial");
        System.out.println("5 - Boletim Aluno");
        System.out.println("0 - Sair");

        questao = scan.nextInt();

        do
        {
            switch (questao)
            {
                case 1:

                    break;

                case 2:
                    Funcionario primeiroFuncionario = new Funcionario();
                    Funcionario segundoFuncionario = new Funcionario();

                    System.out.println("Informe os dados do primeiro funcionário: ");
                    System.out.println("Nome: ");
                    String nome = scan.next();
                    primeiroFuncionario.setNome(nome);

                    System.out.println("Salario: ");
                    Double salario1 = scan.nextDouble();
                    primeiroFuncionario.setSalario(salario1);

                    System.out.println("Informe os dados do Segundo funcionário: ");
                    System.out.println("Nome: ");
                    String nome2 = scan.next();
                    segundoFuncionario.setNome(nome2);

                    System.out.println("Salario: ");
                    Double salario2 = scan.nextDouble();
                    segundoFuncionario.setSalario(salario2);


                    Double salarioMedio = primeiroFuncionario.calcularMedia(salario1,salario2);
                    System.out.println("Salário Médio: " + salarioMedio);
                    break;
            }


        }while (questao != 0);
    }
}
