package br.opet.tds172a.projetointerdisciplinar.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyReader {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Método de leitura com a classe scanner de uma variavel String digitada pelo
	 * console
	 * 
	 * @return
	 */
	public static final String readString() {
		String text = scanner.nextLine();
		return text;
	}

	/**
	 * Método de leitura com a classe scanner de uma variavel Int digitada pelo
	 * console
	 * 
	 * @return
	 */
	public static final int readInt() {

		boolean validou = false;
		int ii = 0;

		do {
			String i = scanner.nextLine();
			try {
				ii = Integer.parseInt(i);
				validou = true;
			} catch (Exception e) {
				System.out.println("Não foi possível transformar: " + i + " em Inteiro");
				validou = false;
			}
		} while (!validou);

		return ii;
	}

	/**
	 * Método de leitura com a classe scanner de uma variavel Double digitada pelo
	 * console
	 * 
	 * @return
	 */
	public static final double readDouble() throws Exception {
		String db = scanner.nextLine();
		double dd = 0;
		try {
			dd = Double.parseDouble(db);
		} catch (Exception e) {
			System.out.println("Não foi possível transformar: " + db + " em Double");
			throw e;
		}
		return dd;
	}

	/**
	 * Método de leitura com a classe scanner de uma variavel Boolean digitada pelo
	 * console
	 * 
	 * @return
	 */
	public static final boolean readBoolean() throws Exception {
		String b = scanner.nextLine();
		boolean bb = false;
		try {
			bb = Boolean.parseBoolean(b);
		} catch (Exception e) {
			System.out.println("Não foi possível transformar: " + b + " em Boolean");
			throw e;
		}
		return bb;
	}

	/**
	 * Função criada para retornar a data no formato DATE quando é inserida no
	 * formato STRING
	 * 
	 * @return
	 * @throws Exception
	 */
	public static final Date readDate() throws Exception {

		String d = scanner.nextLine();
		Date dd = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			dd = sdf.parse(d);
		} catch (Exception e) {
			System.out.println("Não foi possivel transformar: " + d + " em Date");
			throw e;
		}
		return dd;
	}

	public static Long readLong() {

		boolean validou = false;
		long ll = 0;

		do {
			String l = scanner.nextLine();
			try {
				ll = Long.parseLong(l);
				validou = true;
			} catch (Exception e) {
				System.out.println("Não foi possível transformar: " + l + " em Long");
				validou = false;
			}
		} while (!validou);

		return ll;
	}
}
