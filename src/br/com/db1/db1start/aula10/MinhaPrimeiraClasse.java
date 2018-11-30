package br.com.db1.db1start.aula10;

import java.util.Scanner;

public class MinhaPrimeiraClasse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		Integer primeiroNumero = sc.nextInt();
		
		System.out.println("digite o segundo numero: ");
		Integer segundoNumero = sc.nextInt();
		
		Integer valor = MinhaPrimeiraClasse.somar(primeiroNumero, segundoNumero);
		System.out.println(valor);
		
		valor = MinhaPrimeiraClasse.subtrair(primeiroNumero, segundoNumero);
		System.out.println(valor);
		
		valor = MinhaPrimeiraClasse.multiplicar(primeiroNumero, segundoNumero);
		
		
		valor = MinhaPrimeiraClasse.dividir(primeiroNumero, segundoNumero);
		System.out.println(valor);
		
		System.out.println("Ola mundo");
		
		sc.close();
	}

	public static Integer somar(Integer primeiroNumero, Integer segundoNumero) {
		System.out.print("Resusltado da soma = ");
		return primeiroNumero + segundoNumero;
	}
	
	public static Integer subtrair(Integer primeiroNumero, Integer segundoNumero) {
		System.out.print("Resusltado da subtração = ");
		return  primeiroNumero - segundoNumero;
	}
	
	public static Integer multiplicar(Integer primeiroNumero, Integer segundoNumero) {
		System.out.print("Resusltado da multiplicação = ");
		return primeiroNumero * segundoNumero;
	}
	
	public static Integer dividir(Integer primeiroNumero, Integer segundoNumero) {
		System.out.print("Resusltado da divisão = ");
		return primeiroNumero / segundoNumero;
	}
	
}
