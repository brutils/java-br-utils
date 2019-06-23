package com.github.brutils.javabrutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para utilitários de datas.
 */
public class DataUtil {

	/**
	 * Logger da classe.
	 */
	private static final Logger LOGGER = Logger.getLogger(DataUtil.class.getName());

	/**
	 * Constante que representa o formato de data brasileira.
	 */
	private static final String FORMATO_DATA_BR = "dd/MM/yyyy";

	/**
	 * Construtor privado para que não sejam criadas instâncias desta classe.
	 */
	private DataUtil() {
	}

	/**
	 * Método Converte uma {@link String} no formato dd/mm/yyyy em uma data válida. <br>
	 * Retorna <code>null</code> se a data passada como parâmetro for "" ou null.
	 * 
	 * @param  data - Uma data do tipo {@link String} no formato dd/mm/yyyy.
	 * @return      - A data convertida no tipo {@link Date}
	 */
	public static Date stringParaDate(final String data) throws ParseException {

		Date resultado = null;

		if (data == null || "".equals(data)) {
			return null;
		}

		DateFormat dataEntrada = new SimpleDateFormat(FORMATO_DATA_BR);

		try {
			resultado = dataEntrada.parse(data);
		} catch (ParseException parseException) {
			LOGGER.log(Level.SEVERE, "Erro ao converter a data. Informe uma data válida no formato dd/mm/yyyy. Data enviada " + data);
			throw parseException;
		}

		return resultado;
	}

	/**
	 * Método Converte uma {@link String} no formato passado como parâmetro (formatoDeEntrada) em uma data válida. <br>
	 * A data passada como parâmetro será convertida para o formato dd/mm/yyyy.
	 * 
	 * @param  data             - Uma data do tipo {@link String} no formato passado como parâmetro.
	 * @param  formatoDeEntrada - Formato de entrada
	 * @return                  - A data convertida no tipo {@link Date}
	 */
	public static Date stringParaDate(final String data, final String formatoDeEntrada) throws ParseException {

		Date resultado = null;

		DateFormat dataEntrada = new SimpleDateFormat(formatoDeEntrada);
		DateFormat dataSaida = new SimpleDateFormat(FORMATO_DATA_BR);

		try {
			resultado = dataSaida.parse(dataSaida.format(dataEntrada.parse(data)));
		} catch (ParseException parseException) {
			LOGGER.log(Level.SEVERE, "Erro ao converter a data. Informe uma data e formato válidos. Data enviada " + data + " , formato enviado " + formatoDeEntrada);
			throw parseException;
		}

		return resultado;
	}
}
