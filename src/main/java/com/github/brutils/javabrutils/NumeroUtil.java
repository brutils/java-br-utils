package com.github.brutils.javabrutils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
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
	 * Verifica se o número é negativo. <br>
	 * Retorna true se for negativo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isNegativo(final Integer numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é negativo.");
		return numero != null && numero < 0;
	}

	/**
	 * Verifica se o número é negativo. <br>
	 * Retorna true se for negativo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isNegativo(final Long numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é negativo.");
		return numero != null && numero < 0L;
	}

	/**
	 * Verifica se o número é negativo. <br>
	 * Retorna true se for negativo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isNegativo(final Float numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é negativo.");
		return numero != null && numero < 0.0F;
	}

	/**
	 * Verifica se o número é negativo. <br>
	 * Retorna true se for negativo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isNegativo(final Double numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é negativo.");
		return numero != null && numero < 0.0;
	}

	/**
	 * Verifica se o número é negativo. <br>
	 * Retorna true se for negativo. <br>
	 * Se for nulo, retorna false.
	 * 
	 * @param  numero - Número que será verificado
	 * @return        boolean
	 */
	public static boolean isNegativo(final BigDecimal numero) {
		LOGGER.log(Level.FINEST, "Verificando se " + numero + " é negativo.");
		return numero != null && numero.compareTo(BigDecimal.ZERO) < 0;
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

	/**
	 * Retorna zero se o Integer for nulo. <br>
	 * Se não for nulo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        zero ou valor original.
	 */
	public static Integer nuloParaZero(final Integer numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para zero se o valor for nulo.");

		Integer retorno;

		if (numero == null) {
			retorno = 0;
		} else {
			retorno = numero;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o Long for nulo. <br>
	 * Se não for nulo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        zero ou valor original.
	 */
	public static Long nuloParaZero(final Long numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para zero se o valor for nulo.");

		Long retorno;

		if (numero == null) {
			retorno = 0L;
		} else {
			retorno = numero;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o Float for nulo. <br>
	 * Se não for nulo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        zero ou valor original.
	 */
	public static Float nuloParaZero(final Float numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para zero se o valor for nulo.");

		Float retorno;

		if (numero == null) {
			retorno = 0.0F;
		} else {
			retorno = numero;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o Double for nulo. <br>
	 * Se não for nulo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        zero ou valor original.
	 */
	public static Double nuloParaZero(final Double numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para zero se o valor for nulo.");

		Double retorno;

		if (numero == null) {
			retorno = 0.0;
		} else {
			retorno = numero;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o BigDecimal for nulo. <br>
	 * Se não for nulo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        zero ou valor original.
	 */
	public static BigDecimal nuloParaZero(final BigDecimal numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para zero se o valor for nulo.");

		BigDecimal retorno;

		if (numero == null) {
			retorno = BigDecimal.ZERO;
		} else {
			retorno = numero;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Integer não for positivo. <br>
	 * Se for positivo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valorInteger.
	 * @see           NumeroUtil#isPositivo(Integer)
	 */
	public static Integer naoPositivoParaNulo(final Integer numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for positivo.");

		Integer retorno;

		if (isPositivo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Long não for positivo. <br>
	 * Se for positivo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valor original.
	 * @see           NumeroUtil#isPositivo(Long)
	 */
	public static Long naoPositivoParaNulo(final Long numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for positivo.");

		Long retorno;

		if (isPositivo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Float não for positivo. <br>
	 * Se for positivo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valor original.
	 * @see           NumeroUtil#isPositivo(Float)
	 */
	public static Float naoPositivoParaNulo(final Float numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for positivo.");

		Float retorno;

		if (isPositivo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Double não for positivo. <br>
	 * Se for positivo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valor original.
	 * @see           NumeroUtil#isPositivo(Double)
	 */
	public static Double naoPositivoParaNulo(final Double numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for positivo.");

		Double retorno;

		if (isPositivo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o BigDecimal não for positivo. <br>
	 * Se for positivo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valor original.
	 * @see           NumeroUtil#isPositivo(BigDecimal)
	 */
	public static BigDecimal naoPositivoParaNulo(final BigDecimal numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for positivo.");

		BigDecimal retorno;

		if (isPositivo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Integer não for negativo. <br>
	 * Se for negativo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valorInteger.
	 * @see           NumeroUtil#isNegativo(Integer)
	 */
	public static Integer naoNegativoParaNulo(final Integer numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for negativo.");

		Integer retorno;

		if (isNegativo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Long não for negativo. <br>
	 * Se for negativo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valor original.
	 * @see           NumeroUtil#isNegativo(Long)
	 */
	public static Long naoNegativoParaNulo(final Long numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for negativo.");

		Long retorno;

		if (isNegativo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Float não for negativo. <br>
	 * Se for negativo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valor original.
	 * @see           NumeroUtil#isNegativo(Float)
	 */
	public static Float naoNegativoParaNulo(final Float numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for negativo.");

		Float retorno;

		if (isNegativo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Double não for negativo. <br>
	 * Se for negativo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valor original.
	 * @see           NumeroUtil#isNegativo(Double)
	 */
	public static Double naoNegativoParaNulo(final Double numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for negativo.");

		Double retorno;

		if (isNegativo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o BigDecimal não for negativo. <br>
	 * Se for negativo, retorna o valor original.
	 * 
	 * @param  numero - Número que poderá ser convertido
	 * @return        nulo ou valor original.
	 * @see           NumeroUtil#isNegativo(BigDecimal)
	 */
	public static BigDecimal naoNegativoParaNulo(final BigDecimal numero) {

		LOGGER.log(Level.FINEST, "Convertendo " + numero + " para nulo se não for negativo.");

		BigDecimal retorno;

		if (isNegativo(numero)) {
			retorno = numero;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Converte uma string para BigDecimal.
	 * 
	 * @param  string - String que será convertida
	 * @return        BigDecimal
	 */
	@SuppressWarnings("deprecation")
	public static BigDecimal converterParaBigDecimal(final String string) throws ParseException {

		LOGGER.log(Level.FINEST, "Convertendo a string " + string + " para um número do tipo BigDecimal.");

		final NumberFormat numberFormat = NumberFormat.getInstance();

		try {

			numberFormat.setMinimumFractionDigits(2);
			numberFormat.setMaximumFractionDigits(2);

			return new BigDecimal(numberFormat.parse(StringUtil.nuloParaVazio(string)).toString()).setScale(2, 1);

		} catch (final ParseException parseException) {
			LOGGER.log(Level.SEVERE, "Erro ao converter a string " + string + " para um número do tipo BigDecimal");
			throw parseException;
		}
	}

	/**
	 * Converte uma string para int.
	 * 
	 * @param  string - String que será convertida
	 * @return        int
	 */
	public static int converterParaInteger(final String string) throws NumberFormatException {

		LOGGER.log(Level.FINEST, "Convertendo a string " + string + " para um número do tipo int.");

		int resultado = 0;

		try {

			if (!StringUtil.isVazio(string)) {
				resultado = Integer.valueOf(string.trim());
			}

		} catch (NumberFormatException numberFormatException) {
			LOGGER.log(Level.SEVERE, "Erro ao converter a string " + string + " para um número do tipo int");
			throw numberFormatException;
		}

		return resultado;
	}
}
