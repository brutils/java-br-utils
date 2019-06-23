package com.github.brutils.javabrutils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para utilitários booleanos.
 */
public class BooleanUtil {

	/**
	 * Logger da classe.
	 */
	private static final Logger LOGGER = Logger.getLogger(NumeroUtil.class.getName());

	/**
	 * Construtor privado para que não sejam criadas instâncias desta classe.
	 */
	private BooleanUtil() {
	}

	/**
	 * Retorna FALSE se o valorBoolean for nulo. <br>
	 * Se o valorBoolean não for nulo, retorna ele mesmo.
	 * 
	 * @param  valorBoolean - Boolean que poderá ser convertido
	 * @return              FALSE ou o valorBoolean.
	 */
	public static Boolean nuloParaFalse(final Boolean valorBoolean) {

		LOGGER.log(Level.FINEST, "Convertendo " + valorBoolean + " para FALSE se o valor for nulo.");

		Boolean retorno;

		if (valorBoolean == null) {
			retorno = false;
		} else {
			retorno = valorBoolean;
		}

		return retorno;
	}

	/**
	 * Retorna TRUE se o valorBoolean for nulo. <br>
	 * Se o valorBoolean não for nulo, retorna ele mesmo.
	 * 
	 * @param  valorBoolean - Boolean que poderá ser convertido
	 * @return              TRUE ou o valorBoolean.
	 */
	public static Boolean nuloParaTrue(final Boolean valorBoolean) {

		LOGGER.log(Level.FINEST, "Convertendo " + valorBoolean + " para TRUE se o valor for nulo.");

		Boolean retorno;

		if (valorBoolean == null) {
			retorno = true;
		} else {
			retorno = valorBoolean;
		}

		return retorno;
	}
}
