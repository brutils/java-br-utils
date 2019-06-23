package com.github.brutils.javabrutils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para utilitários String.
 */
public class StringUtil {

	/**
	 * Logger da classe.
	 */
	private static final Logger LOGGER = Logger.getLogger(StringUtil.class.getName());

	/**
	 * Construtor privado para que não sejam criadas instâncias desta classe.
	 */
	private StringUtil() {
	}

	/**
	 * Retorna uma String vazia ("") se o parâmetro passado for nulo. <br>
	 * Se o parâmetro não for nulo, retorna ele mesmo.
	 * 
	 * @param  string - String que será convertida
	 * @return        vazio ("") ou string.
	 */
	public static String nuloParaVazio(final String string) {

		LOGGER.log(Level.FINEST, "Convertendo a String " + string + " para nulo ou vazio.");

		String retorno;

		if (string == null) {
			retorno = "";
		} else {
			retorno = string;
		}

		return retorno;
	}

	/**
	 * Retorna um Character vazio (' ') se o parâmetro passado for nulo. <br>
	 * Se o parâmetro não for nulo, retorna ele mesmo.
	 * 
	 * @param  character - Character que será convertido
	 * @return           vazio (' ') ou character.
	 */
	public static Character nuloParaVazio(final Character character) {

		LOGGER.log(Level.FINEST, "Convertendo o Character " + character + " para nulo ou vazio.");

		Character retorno;

		if (character == null) {
			retorno = ' ';
		} else {
			retorno = character;
		}

		return retorno;
	}

	/**
	 * Verifica se é uma String nula ou vazia. <br>
	 * Retorna true se o parâmetro for nulo, vazio (""), ou preenchido somente com espaços em branco (" ").
	 * 
	 * @param  string - String que será verificada
	 * @return        boolean
	 * @see           StringUtil#nuloParaVazio(String)
	 */
	public static boolean isVazio(final String string) {

		LOGGER.log(Level.FINEST, "Verificando se a String " + string + " é nula ou vazia.");

		return "".equals(nuloParaVazio(string).trim());
	}

	/**
	 * Verifica se é um Character nulo ou vazio. <br>
	 * Retorna true se o parâmetro for nulo ou (' ').
	 * 
	 * @param  character - Character que será verificada
	 * @return           boolean
	 * @see              StringUtil#nuloParaVazio(Character)
	 */
	public static boolean isVazio(final Character character) {

		LOGGER.log(Level.FINEST, "Verificando se o Character " + character + " é nulo ou vazio.");

		return ' ' == nuloParaVazio(character);
	}

	/**
	 * Substitui todas as stringAhSerSubstituida por stringSubstituta que estão na stringCompleta.
	 * 
	 * @param  stringCompleta         - String completa
	 * @param  stringAhSerSubstituida - String a ser substituida
	 * @param  stringSubstituta       - String substituta
	 * @return                        String
	 */
	public static String substituir(final String stringCompleta, final String stringAhSerSubstituida, final String stringSubstituta) {

		LOGGER.log(Level.FINEST, "Substituindo " + stringAhSerSubstituida + " por " + stringSubstituta + " na string " + stringCompleta);

		if (stringCompleta == null || stringAhSerSubstituida == null || stringSubstituta == null) {
			return null;
		}

		StringBuilder conteudo = new StringBuilder(stringCompleta);
		StringBuilder conteudoTemp = new StringBuilder();

		boolean replace = true;

		do {

			int posicao = conteudo.indexOf(stringAhSerSubstituida);

			if (posicao == -1) {
				replace = false;
			} else {
				conteudoTemp = new StringBuilder(conteudo.subSequence(0, posicao));
				conteudoTemp.append(stringSubstituta);
				conteudoTemp.append(conteudo.subSequence(posicao + stringAhSerSubstituida.length(), conteudo.length()));

				conteudo = conteudoTemp;
			}

		} while (replace);

		return conteudo.toString();
	}

}
