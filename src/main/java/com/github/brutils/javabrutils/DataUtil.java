package com.github.brutils.javabrutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
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
	 * Constante que representa o formato de data dd/MM/yy.
	 */
	private static final String FORMATO_DATA_DD_MM_YY = "dd/MM/yy";

	/**
	 * Constante que representa o formato de data dd/MM/yyyy.
	 */
	private static final String FORMATO_DATA_DD_MM_YYYY = "dd/MM/yyyy";

	/**
	 * Constante que representa o formato de data yyyy/MM/dd.
	 */
	private static final String FORMATO_DATA_YYYY_MM_DD = "yyyy/MM/dd";

	/**
	 * Constante que representa o formato de data yyyy.
	 */
	private static final String FORMATO_DATA_YYYY = "yyyy";

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

		DateFormat dataEntrada = new SimpleDateFormat(FORMATO_DATA_DD_MM_YYYY);

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
		DateFormat dataSaida = new SimpleDateFormat(FORMATO_DATA_DD_MM_YYYY);

		try {
			resultado = dataSaida.parse(dataSaida.format(dataEntrada.parse(data)));
		} catch (ParseException parseException) {
			LOGGER.log(Level.SEVERE, "Erro ao converter a data. Informe uma data e formato válidos. Data enviada " + data + " , formato enviado " + formatoDeEntrada);
			throw parseException;
		}

		return resultado;
	}

	/**
	 * Método Converte uma String (formatoDeEntrada) em uma Data Válida.
	 * 
	 * @param  data             - Data
	 * @param  formatoDeEntrada - Formato de entrada
	 * @param  formatoDeSaida   - Formato de saída
	 * @return                  data - String
	 * @throws ParseException
	 */
	public static Date stringParaDate(final String data, final String formatoDeEntrada, final String formatoDeSaida) throws ParseException {

		Date resultado = null;

		DateFormat dataEntrada = new SimpleDateFormat(formatoDeEntrada);
		DateFormat dataSaida = new SimpleDateFormat(formatoDeSaida);

		try {
			resultado = dataSaida.parse(dataSaida.format(dataEntrada.parse(data)));
		} catch (ParseException parseException) {
			LOGGER.log(Level.SEVERE, "Erro ao converter a data. Informe uma data e formato válidos. Data enviada " + data + " , formato de entrada enviado " + formatoDeEntrada + ", formato de saída enviado " + formatoDeSaida);
			throw parseException;
		}

		return resultado;
	}

	/**
	 * Método Converte uma Data válida numa String de data : dd/MM/yyyy.
	 * 
	 * @param  data - Data
	 * @return      data - String
	 */
	public static String dateParaString(final Date data) {

		String resultado = new String();

		DateFormat dataSaida = new SimpleDateFormat(FORMATO_DATA_DD_MM_YYYY);

		if (data != null) {
			resultado = dataSaida.format(data);
		}

		return resultado;
	}

	/**
	 * Método Converte uma Data válida em uma String de data de acordo formato de Saída.
	 * The year
	 * formatter = new SimpleDateFormat("yy"); // 02
	 * formatter = new SimpleDateFormat("yyyy"); // 2002
	 * The month
	 * formatter = new SimpleDateFormat("M"); // 1
	 * formatter = new SimpleDateFormat("MM"); // 01
	 * formatter = new SimpleDateFormat("MMM"); // Jan
	 * formatter = new SimpleDateFormat("MMMM"); // January
	 * The day
	 * formatter = new SimpleDateFormat("d"); // 9
	 * formatter = new SimpleDateFormat("dd"); // 09
	 * The day in week
	 * formatter = new SimpleDateFormat("E"); // Wed
	 * formatter = new SimpleDateFormat("EEEE"); // Wednesday
	 * Time
	 * Format("yyyy.MM.dd.HH.mm.ss")
	 * 
	 * @param  data           - Data
	 * @param  formatoDeSaida - Formato de saída
	 * @return                data - String
	 */
	public static String dateParaString(final Date data, final String formatoDeSaida) {

		String resultado = new String();

		if (data == null) {
			return resultado;
		}

		DateFormat dataSaida = new SimpleDateFormat(StringUtil.nuloParaVazio(formatoDeSaida));

		resultado = dataSaida.format(data);

		return resultado;
	}

	/**
	 * Converte os parâmetros em uma data.
	 * 
	 * @param  dia - Dia
	 * @param  mes - Mês
	 * @param  ano - Ano
	 * @return     data
	 */
	public static Date data(final int dia, final int mes, final int ano) {

		Calendar calendar = new GregorianCalendar();

		calendar.set(ano, mes, dia);

		return calendar.getTime();
	}

	/**
	 * Retorna o número do mês, com dois dígitos.
	 * 
	 * @param  mes - Mês
	 * @return     mês
	 */
	public static String mesComDoisDigitos(final Integer mes) {
		return StringUtil.adicionarChar('0', 2, String.valueOf(NumeroUtil.nuloParaZero(mes)), true);
	}

	/**
	 * Retorna uma lista de String com as horas do dia. <br>
	 * Intervalo de 30 minutos.
	 * 
	 * @return String
	 */
	public static List<String> horas() {

		List<String> resultado = new ArrayList<>();
		final int ultimaHora = 23;
		final int intervaloMinutos = 30;

		for (Integer hora = 0; hora <= ultimaHora; hora++) {
			for (Integer minuto = 0; minuto <= intervaloMinutos; minuto += intervaloMinutos) {
				resultado.add(StringUtil.adicionarZeroEsquerda(hora.toString(), 2) + ":" + StringUtil.adicionarZeroEsquerda(minuto.toString(), 2));
			}
		}

		return resultado;
	}

	/**
	 * Método que retorna uma lista de anos, sendo o ano Corrente mais quantidadeRetroativa e Posterior.
	 * 
	 * @param  quantidadeRetroativa - Quantidade retroativa
	 * @param  quantidadePosterior  - Quantidade posterior
	 * @return                      lista de anos
	 */
	public static List<String> anos(final int quantidadeRetroativa, final int quantidadePosterior) {

		List<String> resultado = new ArrayList<>();
		int anoCorrente = Integer.parseInt(dateParaString(new Date(), FORMATO_DATA_YYYY));

		for (int indice = quantidadeRetroativa; indice >= 1; indice--) {
			resultado.add(Integer.valueOf(anoCorrente - indice).toString());
		}

		resultado.add(String.valueOf(anoCorrente));

		for (int indice = 1; indice <= quantidadePosterior; indice++) {
			resultado.add(Integer.valueOf(anoCorrente + indice).toString());
		}

		return resultado;
	}

	/**
	 * Método que retorna uma lista de anos, sendo o ano Inicial (Null para o Ano corrente) mais quantidadeRetroativa e Posterior.
	 * 
	 * @param  anoInicial           - Ano inicial
	 * @param  quantidadeRetroativa - Quantidade retroativa
	 * @param  quantidadePosterior  - Quantidade posterior
	 * @return                      lista de anos
	 */
	public static List<Integer> anos(final Integer anoInicial, final int quantidadeRetroativa, final int quantidadePosterior) {

		Integer anoInicialTemporario = anoInicial;
		List<Integer> resultado = new ArrayList<>();

		if (anoInicialTemporario == null) {
			anoInicialTemporario = Integer.parseInt(dateParaString(new Date(), FORMATO_DATA_YYYY));
		}

		for (int i = quantidadeRetroativa; i >= 1; i--) {
			resultado.add(Integer.valueOf(anoInicialTemporario - i));
		}

		resultado.add(anoInicialTemporario);

		for (int i = 1; i <= quantidadePosterior; i++) {
			resultado.add(Integer.valueOf(anoInicialTemporario + i));
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de meses.
	 * 
	 * @return lista de meses
	 */
	public static List<String> meses() {

		List<String> resultado = new ArrayList<>();
		final int mesInicial = 1;
		final int mesFinal = 12;

		for (int i = mesInicial; i <= mesFinal; i++) {
			resultado.add(mesPorExtenso(i));
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de dias.<br>
	 * Do dia 01 ao dia 31.<br>
	 * Os dias estarão com dois dígitos. Ex: 01,02,...,30,31.
	 * 
	 * @return lista de dias
	 */
	public static List<String> dias() {

		List<String> resultado = new ArrayList<>();
		final int diaInicial = 1;
		final int diaFinal = 31;

		for (Integer i = diaInicial; i <= diaFinal; i++) {
			resultado.add(StringUtil.adicionarChar('0', 2, i.toString(), true));
		}

		return resultado;
	}

	/**
	 * Método que retorna o nome do mês, de acordo com o número do mês passado por parâmetro.
	 * 
	 * @param  mes - Mês
	 * @return     nome do mês
	 */
	public static String mesPorExtenso(final Integer mes) {

		String resultado = new String();
		final int numeroMesJaneiro = 1;
		final int numeroMesFevereiro = 2;
		final int numeroMesMarco = 3;
		final int numeroMesAbril = 4;
		final int numeroMesMaio = 5;
		final int numeroMesJunho = 6;
		final int numeroMesJulho = 7;
		final int numeroMesAgosto = 8;
		final int numeroMesSetembro = 9;
		final int numeroMesOutubro = 10;
		final int numeroMesNovembro = 11;
		final int numeroMesDezembro = 12;

		switch (mes.intValue()) {

		case numeroMesJaneiro:
			resultado = "Janeiro";
			break;
		case numeroMesFevereiro:
			resultado = "Fevereiro";
			break;
		case numeroMesMarco:
			resultado = "Março";
			break;
		case numeroMesAbril:
			resultado = "Abril";
			break;
		case numeroMesMaio:
			resultado = "Maio";
			break;
		case numeroMesJunho:
			resultado = "Junho";
			break;
		case numeroMesJulho:
			resultado = "Julho";
			break;
		case numeroMesAgosto:
			resultado = "Agosto";
			break;
		case numeroMesSetembro:
			resultado = "Setembro";
			break;
		case numeroMesOutubro:
			resultado = "Outubro";
			break;
		case numeroMesNovembro:
			resultado = "Novembro";
			break;
		case numeroMesDezembro:
			resultado = "Dezembro";
			break;
		default:
			resultado = "Dezembro";
			break;
		}

		return resultado;
	}

	/**
	 * Método que retorna o número do mês, de acordo com a descrição do mês passado por parâmetro.
	 * 
	 * @param  mesDescricao - Descrição do mês
	 * @return              número do mês
	 */
	public static String numeroMes(final String mesDescricao) {

		final StringBuilder retorno = new StringBuilder();

		if ("Janeiro".equalsIgnoreCase(mesDescricao)) {
			retorno.append("01");
		} else if ("Fevereiro".equalsIgnoreCase(mesDescricao)) {
			retorno.append("02");
		} else if ("Março".equalsIgnoreCase(mesDescricao)) {
			retorno.append("03");
		} else if ("Abril".equalsIgnoreCase(mesDescricao)) {
			retorno.append("04");
		} else if ("Maio".equalsIgnoreCase(mesDescricao)) {
			retorno.append("05");
		} else if ("Junho".equalsIgnoreCase(mesDescricao)) {
			retorno.append("06");
		} else if ("Julho".equalsIgnoreCase(mesDescricao)) {
			retorno.append("07");
		} else if ("Agosto".equalsIgnoreCase(mesDescricao)) {
			retorno.append("08");
		} else if ("Setembro".equalsIgnoreCase(mesDescricao)) {
			retorno.append("09");
		} else if ("Outubro".equalsIgnoreCase(mesDescricao)) {
			retorno.append("10");
		} else if ("Novembro".equalsIgnoreCase(mesDescricao)) {
			retorno.append("11");
		} else if ("Dezembro".equalsIgnoreCase(mesDescricao)) {
			retorno.append("12");
		}

		return retorno.toString();
	}

	/**
	 * Retorna a quantidade de dias entre as datas passadas como parâmetro.
	 * 
	 * @param  dataInicial - Data inicial
	 * @param  dataFinal   - Data final
	 * @return             quantidade de dias
	 */
	@SuppressWarnings("deprecation")
	public static Integer diasEntreDatas(final Date dataInicial, final Date dataFinal) {

		Long diferencaDias = new Long(0);
		final int horas = 24;
		final int minutos = 60;
		final int segundos = 60;
		final int milisegundos = 1000;

		if (dataInicial != null && dataFinal != null) {

			long diferencaMilisegundos = dataFinal.getTime() - dataInicial.getTime();

			diferencaDias = diferencaMilisegundos / (horas * minutos * segundos * milisegundos);
		}

		if (diferencaDias < 0) {
			diferencaDias = new Long(0);
		}

		return Integer.valueOf(diferencaDias.intValue());
	}

	/**
	 * Retorna a diferença entre as datas passadas como parâmetro.
	 * 
	 * @param  dataInicial - Data inicial
	 * @param  dataFinal   - Data final
	 * @return             diferença
	 */
	@SuppressWarnings("deprecation")
	public static Long diferencaEntreDatas(final Date dataInicial, final Date dataFinal) {

		Long diferenca = new Long(0);

		if (dataInicial != null && dataFinal != null) {
			diferenca = dataFinal.getTime() - dataInicial.getTime();
		}

		return diferenca;
	}

	/**
	 * Método para retornar a idade, em anos.
	 * 
	 * @param  data             - Data
	 * @param  dataDeNascimento - Data de nascimento
	 * @param  diaOuMes         - Dia ou mês
	 * @return                  idade
	 */
	@SuppressWarnings("deprecation")
	public static int idade(final Date data, final Date dataDeNascimento, final String diaOuMes) {

		int idade = 0;

		if (dataDeNascimento != null) {

			idade = data.getYear() - dataDeNascimento.getYear();

			if (data.getMonth() < dataDeNascimento.getMonth()) {
				idade--;
			}
		}

		return idade;
	}

	/**
	 * Método para retornar a idade, em anos.
	 * 
	 * @param  dataAtual        - Data atual
	 * @param  dataDeNascimento - Data de nascimento
	 * @return                  idade
	 */
	@SuppressWarnings("deprecation")
	public static int idade(final Date dataAtual, final Date dataDeNascimento) {

		int idade = 0;

		if (dataDeNascimento != null && dataAtual != null) {

			idade = dataAtual.getYear() - dataDeNascimento.getYear();

			if (dataAtual.getMonth() < dataDeNascimento.getMonth()) {
				idade--;
			}
		}

		return idade;
	}

	/**
	 * Retorna a data atual.
	 * 
	 * @see    #stringParaDate(String)
	 * @return data atual
	 */
	public static Date dataAtual() {

		Date resultado = null;

		try {
			resultado = stringParaDate(Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/" + (Calendar.getInstance().get(Calendar.MONTH) + 1) + "/" + Calendar.getInstance().get(Calendar.YEAR));
		} catch (ParseException parseException) {
			LOGGER.log(Level.SEVERE, "Erro ao obter a data atual. " + parseException);
		}

		return resultado;
	}

	/**
	 * Converte uma data dd/MM/yy ou dd/MM/yyyy em yyyy/MM/dd.
	 * 
	 * @param  data           - Data no formato dd/MM/yy ou dd/MM/yyyy
	 * @return                data no formato yyyy/MM/dd
	 * @throws ParseException
	 */
	public static String converterDataParaAnoMesDia(final String data) throws ParseException {

		String resultado = "";
		DateFormat dataEntrada = null;
		DateFormat dataSaida = null;
		final int tamanhoData = 8;

		try {

			if (!StringUtil.isVazio(data)) {

				if (data.length() == tamanhoData) {
					dataEntrada = new SimpleDateFormat(FORMATO_DATA_DD_MM_YY);
				} else {
					dataEntrada = new SimpleDateFormat(FORMATO_DATA_DD_MM_YYYY);
				}

				dataSaida = new SimpleDateFormat(FORMATO_DATA_YYYY_MM_DD);

				Date dataValida = dataEntrada.parse(data);

				resultado = dataSaida.format(dataValida);
			}

		} catch (ParseException parseException) {
			LOGGER.log(Level.SEVERE, "Erro ao converter a data do formato dd/MM/yyyy ou dd/MM/yy para o formato yyyy/MM/dd. Data informada " + data);
			throw parseException;
		}

		return resultado;
	}
}
