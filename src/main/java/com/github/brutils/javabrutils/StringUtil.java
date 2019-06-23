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

	/**
	 * Método para preencher uma string com Zeros à esquerda até o tamanho passado como parâmetro. <br>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br>
	 * Se a string for nula, retorna null.
	 * 
	 * @param  string  - String
	 * @param  tamanho - Tamanho
	 * @return         string
	 * @see            java.lang.StringBuilder
	 */
	public static String adicionarZeroEsquerda(final String string, final int tamanho) {

		LOGGER.log(Level.FINEST, "Adicionando Zeros à esquerda da String " + string + " até que atinja o tamanho máximo de " + tamanho);

		if (string == null) {
			return null;
		}

		if (tamanho <= string.length()) {
			return string;
		}

		StringBuilder resultado = new StringBuilder(string);

		for (int i = string.length(); i <= (tamanho - 1); i++) {
			resultado.insert(0, "0");
		}

		return resultado.toString();
	}

	/**
	 * Método para preencher uma string com Zeros à direita até o tamanho passado como parâmetro. <br>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br>
	 * Se a string for nula, retorna null.
	 * 
	 * @param  string  - String
	 * @param  tamanho - Tamanho
	 * @return         string
	 * @see            java.lang.StringBuilder
	 */
	public static String adicionarZeroDireita(final String string, final int tamanho) {

		LOGGER.log(Level.FINEST, "Adicionando Zeros à direita da String " + string + " até que atinja o tamanho máximo de " + tamanho);

		if (string == null) {
			return null;
		}

		if (tamanho <= string.length()) {
			return string;
		}

		StringBuilder resultado = new StringBuilder(string);

		for (int i = string.length(); i <= (tamanho - 1); i++) {
			resultado.append('0');
		}

		return resultado.toString();
	}

	/**
	 * Método para preencher uma string com Espaços à esquerda até o tamanho passado como parâmetro. <br>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br>
	 * Se a string for nula, retorna null.
	 * 
	 * @param  string  - String
	 * @param  tamanho - Tamanho
	 * @return         string
	 * @see            java.lang.StringBuilder
	 */
	public static String adicionarEspacoEsquerda(final String string, final int tamanho) {

		LOGGER.log(Level.FINEST, "Adicionando Espaços à esquerda da String " + string + " até que atinja o tamanho máximo de " + tamanho);

		if (string == null) {
			return null;
		}

		if (tamanho <= string.length()) {
			return string;
		}

		StringBuilder resultado = new StringBuilder(string);

		for (int i = string.length(); i <= (tamanho - 1); i++) {
			resultado.insert(0, " ");
		}

		return resultado.toString();
	}

	/**
	 * Método para preencher uma string com Espaços à direita até o tamanho passado como parâmetro. <br>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br>
	 * Se a string for nula, retorna null.
	 * 
	 * @param  string  - String
	 * @param  tamanho - Tamanho
	 * @return         string
	 * @see            java.lang.StringBuilder
	 */
	public static String adicionarEspacoDireita(final String string, final int tamanho) {

		LOGGER.log(Level.FINEST, "Adicionando Espaços à direita da String " + string + " até que atinja o tamanho máximo de " + tamanho);

		if (string == null) {
			return null;
		}

		if (tamanho <= string.length()) {
			return string;
		}

		StringBuilder resultado = new StringBuilder(string);

		for (int i = string.length(); i <= (tamanho - 1); i++) {
			resultado.append(' ');
		}

		return resultado.toString();
	}

	/**
	 * Método remover todos os espaços à direita da string passada como parâmetro. <br>
	 * Se a string for nula, retorna null.
	 * 
	 * @param  string - String
	 * @return        String
	 */
	public static String removerEspacoDireita(final String string) {

		LOGGER.log(Level.FINEST, "Remove todos os espaços à direita da String " + string);

		if (string == null) {
			return null;
		}

		String resultado = "";

		for (int indice = string.length() - 1; indice >= 0; --indice) {

			if (string.charAt(indice) != ' ') {

				resultado = string.substring(0, indice + 1);
				break;
			}
		}

		return resultado;
	}

	/**
	 * Método remover todos os espaços à esquerda da string passada como parâmetro. <br>
	 * Se a string for nula, retorna null.
	 * 
	 * @param  string - String
	 * @return        String
	 */
	public static String removerEspacoEsquerda(final String string) {

		LOGGER.log(Level.FINEST, "Remove todos os espaços à esquerda da String " + string);

		if (string == null) {
			return null;
		}

		String resultado = "";

		for (int indice = 0; indice < string.length(); indice++) {

			if (string.charAt(indice) != ' ') {

				resultado = string.substring(indice, string.length());
				break;
			}
		}

		return resultado;
	}

	/**
	 * Adiciona um caracter (String) em um texto (String).
	 * 
	 * @param  caracter      - Caractere
	 * @param  tamanhoMaximo - Tamanho máximo
	 * @param  texto         - Texto
	 * @param  noInicio      - No início
	 * @return               texto
	 */
	public static String adicionarChar(final char caracter, final int tamanhoMaximo, final String texto, final boolean noInicio) {

		LOGGER.log(Level.FINEST, "Adicionando o Character " + caracter + " no texto " + texto + ", até que atinja o tamanho máximo " + tamanhoMaximo);

		StringBuilder resultado = new StringBuilder();
		StringBuilder caracterAdd = new StringBuilder();

		if (texto != null && !("".equals(texto))) {
			resultado.append(texto.trim());
		}

		if (resultado.length() <= tamanhoMaximo) {
			for (int i = 0; i < (tamanhoMaximo - resultado.length()); i++) {
				caracterAdd.append(caracter);
			}
		} else {
			return StringUtil.nuloParaVazio(texto).substring(0, tamanhoMaximo);
		}

		if (noInicio) {
			resultado = new StringBuilder(caracterAdd + resultado.toString());
		} else {
			resultado.append(caracterAdd);
		}

		return resultado.toString();
	}

	/**
	 * Método para remover o char passado como parâmetro da string.
	 * 
	 * @param  string    - String
	 * @param  character - Caractere
	 * @return           string
	 */
	public static String removerCharEsquerda(final String string, final char character) {

		LOGGER.log(Level.FINEST, "Removendo o Character " + character + " que estão à esquerda da String " + string);

		String resultado = "";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != character) {
				resultado += string.substring(i);
				return resultado;
			}
		}

		return resultado;
	}
	
	/**
	 * Método para remover o char passado como parâmetro da string.
	 * 
	 * @param  string    - String
	 * @param  character - Caractere
	 * @return           string
	 */
	public static String removerCharDireita(final String string, final char character) {

		LOGGER.log(Level.FINEST, "Removendo o Character " + character + " que estão à direita da String " + string);

		String resultado = "";
		String stringReversa = new StringBuilder(string).reverse().toString();

		for (int i = 0; i < stringReversa.length(); i++) {
			if (stringReversa.charAt(i) != character) {
				resultado += stringReversa.substring(i);
				return resultado;
			}
		}

		return new StringBuilder(resultado).reverse().toString();
	}

	/**
	 * Remove todas as quebras de linhas contidas em uma string.
	 * 
	 * @param  string - String
	 * @return        String
	 */
	public static String removerQuebraDeLinha(final String string) {

		LOGGER.log(Level.FINEST, "Removendo as quebras de linha da String " + string);

		return string.replaceAll("(\n|\r)+", "");
	}

}
