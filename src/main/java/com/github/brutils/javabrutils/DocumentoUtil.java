package com.github.brutils.javabrutils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para utilitários de documentos.
 */
public class DocumentoUtil {

	/**
	 * Logger da classe.
	 */
	private static final Logger LOGGER = Logger.getLogger(DocumentoUtil.class.getName());

	/**
	 * Construtor privado para que não sejam criadas instâncias desta classe.
	 */
	private DocumentoUtil() {
	}

	/**
	 * Retorna true se for um CPF ou CNPJ válido.
	 * 
	 * @param  cpfOuCnpj - CPF ou CNPJ
	 * @return           true se for um CPF ou CNPJ válido
	 */
	public static boolean isCpfOuCnpjValido(final String cpfOuCnpj) {

		LOGGER.log(Level.FINEST, "Verificando se a String " + cpfOuCnpj + " é um CPF ou CNPJ válido.");

		String cpfOuCnpjTemporario = cpfOuCnpj;
		final int tamanhoCpf = 11;
		final int tamanhoCnpj = 14;

		cpfOuCnpjTemporario = StringUtil.substituir(cpfOuCnpjTemporario, ".", "");
		cpfOuCnpjTemporario = StringUtil.substituir(cpfOuCnpjTemporario, "-", "");
		cpfOuCnpjTemporario = StringUtil.substituir(cpfOuCnpjTemporario, "/", "");

		// Rotina para CPF
		if (cpfOuCnpjTemporario.length() == tamanhoCpf) {

			int d1 = 0;
			int d2 = 0;
			int digito1 = 0;
			int digito2 = 0;
			int resto = 0;
			int digitoCpf;

			for (int numeroContador = 1; numeroContador < cpfOuCnpjTemporario.length() - 1; numeroContador++) {

				digitoCpf = Integer.valueOf(cpfOuCnpjTemporario.substring(numeroContador - 1, numeroContador)).intValue();

				// Multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
				d1 = d1 + (tamanhoCpf - numeroContador) * digitoCpf;

				// Para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
				d2 = d2 + ((tamanhoCpf + 1) - numeroContador) * digitoCpf;
			}

			// Primeiro resto da divisão por 11.
			resto = (d1 % tamanhoCpf);

			// Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
			if (resto < 2) {
				digito1 = 0;
			} else {
				digito1 = tamanhoCpf - resto;
			}

			d2 += 2 * digito1;

			// Segundo resto da divisão por 11.
			resto = (d2 % tamanhoCpf);

			// Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
			if (resto < 2) {
				digito2 = 0;
			} else {
				digito2 = tamanhoCpf - resto;
			}

			// Digito verificador do CPF que está sendo validado.
			String numeroDigitoVerificador = cpfOuCnpjTemporario.substring(cpfOuCnpjTemporario.length() - 2, cpfOuCnpjTemporario.length());

			// Concatenando o primeiro resto com o segundo.
			String numeroDigitoResult = String.valueOf(digito1) + String.valueOf(digito2);

			// Comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
			return numeroDigitoVerificador.equals(numeroDigitoResult);

		} else if (cpfOuCnpjTemporario.length() == tamanhoCnpj) {
			// Rotina para CNPJ

			int soma = 0;
			int dig = 0;
			char[] chrCnpj = cpfOuCnpjTemporario.toCharArray();
			String resultadoCalcCnpj = "0";
			final int numeroQuatro = 4;
			final int numeroQuarentaOito = 48;
			final int numeroNove = 9;
			final int numeroSeis = 6;
			final int numeroOito = 8;
			final int numeroDez = 10;
			final int numeroOnze = 11;
			final int numeroCinco = 5;
			final int numeroSete = 7;

			// Primeira parte
			for (int i = 0; i < numeroQuatro; i++) {
				if (chrCnpj[i] - numeroQuarentaOito >= 0 && chrCnpj[i] - numeroQuarentaOito <= numeroNove) {
					soma += (chrCnpj[i] - numeroQuarentaOito) * (numeroSeis - (i + 1));
				}
			}

			for (int i = 0; i < numeroOito; i++) {
				if (chrCnpj[i + numeroQuatro] - numeroQuarentaOito >= 0 && chrCnpj[i + numeroQuatro] - numeroQuarentaOito <= numeroNove) {
					soma += (chrCnpj[i + numeroQuatro] - numeroQuarentaOito) * (numeroDez - (i + 1));
				}
			}

			dig = numeroOnze - (soma % numeroOnze);

			if (dig == numeroDez || dig == numeroOnze) {
				resultadoCalcCnpj = "0";
			} else {
				resultadoCalcCnpj = Integer.toString(dig);
			}

			String cnpjCalc = cpfOuCnpjTemporario.substring(0, (tamanhoCnpj - 2));
			cnpjCalc += resultadoCalcCnpj;

			// Segunda parte
			soma = 0;

			for (int i = 0; i < numeroCinco; i++) {
				if (chrCnpj[i] - numeroQuarentaOito >= 0 && chrCnpj[i] - numeroQuarentaOito <= numeroNove) {
					soma += (chrCnpj[i] - numeroQuarentaOito) * (numeroSete - (i + 1));
				}
			}

			for (int i = 0; i < numeroOito; i++) {
				if (chrCnpj[i + numeroCinco] - numeroQuarentaOito >= 0 && chrCnpj[i + numeroCinco] - numeroQuarentaOito <= numeroNove) {
					soma += (chrCnpj[i + numeroCinco] - numeroQuarentaOito) * (numeroDez - (i + 1));
				}
			}

			dig = numeroOnze - (soma % numeroOnze);

			if (dig == numeroDez || dig == numeroOnze) {
				resultadoCalcCnpj = "0";
			} else {
				resultadoCalcCnpj = Integer.toString(dig);
			}
			cnpjCalc += resultadoCalcCnpj;

			return cpfOuCnpjTemporario.equals(cnpjCalc);

		} else {
			return false;
		}
	}

}
