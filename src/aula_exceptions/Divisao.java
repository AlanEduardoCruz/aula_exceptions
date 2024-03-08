package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;

		try {
			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();

			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();

			divide(dividendo, divisor);

		} catch (InputMismatchException erro) {
			System.err.println("Exceção " + erro);
			System.out.println("Tipagem errada, apenas números inteiros");

		} catch (ArithmeticException erro) {
			System.err.println("Exceção " + erro);
			System.out.println("Não pode dividir por zero");

		} finally {
			System.out.println("Divisão concluida");
		}
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
