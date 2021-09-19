package quartaQuestaoParadigmas;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do trabalhador");
		String nome = sc.nextLine();
		System.out.println("Digite o sal�rio do trabalhador");
		double salario = sc.nextDouble();
		System.out.println("Digite o imposto em cima do sal�rio do trabalhador");
		double imposto = sc.nextDouble();
		
		aumentoSalario cadastro = new aumentoSalario(nome, salario, imposto);
		
		System.out.println("Dados do trabalhador: ");
		System.out.println("Nome: " + cadastro.getNome());
		double salarioLiquido = cadastro.salarioLiquido(salario, imposto);
		System.out.println("Sal�rio l�quido: " + salarioLiquido);
		
		System.out.println("Insira a porcentagem do aumento de salario: ");
		double aumento = sc.nextDouble();
		
		double novoSalario = cadastro.aumento(salarioLiquido, aumento);
		
		System.out.println("Novo sal�rio l�quido: " + novoSalario);
	}
}
