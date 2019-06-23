package com.github.brutils.javabrutils;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para utilitários numéricos.
 */
public class NumeroUtil {

	/**
	 * Logger da classe.
	 */
	private static final Logger LOGGER = Logger.getLogger(NumeroUtil.class.getName());

	/**
	 * Construtor privado para que não sejam criadas instâncias desta classe.
	 */
	private NumeroUtil() {
	}

	/**
	 * Verifica se o número é positivo. <br>
	 * Retorna true se for positivo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isPositivo(final Integer numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é positivo.");
		return numero != null && numero > 0;
	}

	/**
	 * Verifica se o número é positivo. <br>
	 * Retorna true se for positivo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isPositivo(final Long numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é positivo.");
		return numero != null && numero > 0L;
	}

	/**
	 * Verifica se o número é positivo. <br>
	 * Retorna true se for positivo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isPositivo(final Float numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é positivo.");
		return numero != null && numero > 0.0F;
	}

	/**
	 * Verifica se o número é positivo. <br>
	 * Retorna true se for positivo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isPositivo(final Double numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é positivo.");
		return numero != null && numero > 0.0;
	}

	/**
	 * Verifica se o número é positivo. <br>
	 * Retorna true se for positivo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isPositivo(final BigDecimal numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é positivo.");
		return numero != null && numero.compareTo(BigDecimal.ZERO) > 0;
	}

	/**
	 * Verifica se é um número nulo ou com valor zero. <br/>
	 * Retorna true se for nulo ou zero.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isVazio(final Integer numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é vazio.");
		return numero == null || numero == 0;
	}

	/**
	 * Verifica se é um número nulo ou com valor zero. <br>
	 * Retorna true se for nulo ou zero.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isVazio(final Long numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é vazio.");
		return numero == null || numero == 0;
	}

	/**
	 * Verifica se é um número nulo ou com valor zero. <br>
	 * Retorna true se for nulo ou zero.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isVazio(final Double numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é vazio.");
		return numero == null || Double.doubleToRawLongBits(numero) == 0L;
	}

	/**
	 * Verifica se é um número nulo ou com valor zero. <br>
	 * Retorna true se for nulo ou zero.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 * @see           java.lang.Comparable#compareTo(Object)
	 */
	public static boolean isVazio(final BigDecimal numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é vazio.");
		return numero == null || numero.compareTo(BigDecimal.ZERO) == 0;
	}

}
