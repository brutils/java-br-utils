package com.github.brutils.javabrutils;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de teste unitário para testar a classe {@link StringUtil}.
 */
public class StringUtilTest {

	/**
	 * Logger da classe.
	 */
	private static final Logger LOGGER = Logger.getLogger(StringUtilTest.class.getName());

	/**
	 * String nula.
	 */
	private static final String STRING_NULA = null;

	/**
	 * Character nulo.
	 */
	private static final Character CHARACTER_NULO = null;

	/**
	 * 123.
	 */
	private static final String STRING_123 = "123";

	/**
	 * String com três espaços.
	 */
	private static final String STRING_3_ESPACOS = "   ";

	/**
	 * String com espaços na esquerda e na direita.
	 */
	private static final String STRING_ESPACOS_ESQUERDA_DIREITA = "    123    ";

	/**
	 * Número 6.
	 */
	private static final int NUMERO_6 = 6;

	/**
	 * Número 3.
	 */
	private static final int NUMERO_3 = 3;

	/**
	 * Construtor padrão.
	 */
	public StringUtilTest() {
		// JUnit requer um construtor público.
	}

	/**
	 * Testa o método {@link StringUtil#isVazio(String)}.
	 */
	@Test
	public final void isVazioString() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#isVazio(String).");

		Assert.assertTrue(StringUtil.isVazio(STRING_NULA));

		Assert.assertTrue(StringUtil.isVazio(""));

		Assert.assertTrue(StringUtil.isVazio("    "));

		Assert.assertFalse(StringUtil.isVazio("Não está vazio"));

		Assert.assertFalse(StringUtil.isVazio("  Não está vazio  "));
	}

	/**
	 * Testa o método {@link StringUtil#isVazio(Character)}.
	 */
	@Test
	public final void isVazioCharacter() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#isVazio(Character).");

		Assert.assertTrue(StringUtil.isVazio(CHARACTER_NULO));

		Assert.assertTrue(StringUtil.isVazio(' '));

		Assert.assertFalse(StringUtil.isVazio('N'));
	}

	/**
	 * Testa o método {@link StringUtil#substituir(String, String, String)}.
	 */
	@Test
	public final void substituir() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#substituir(String, String, String).");

		// TODO: Testar StringUtil#substituir(String, String, String)
	}

	/**
	 * Testa o método {@link StringUtil#adicionarZeroEsquerda(String, int)}.
	 */
	@Test
	public final void adicionarZeroEsquerda() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#adicionarZeroEsquerda(String, int).");

		Assert.assertEquals("000123", StringUtil.adicionarZeroEsquerda(STRING_123, NUMERO_6));

		Assert.assertEquals(STRING_123, StringUtil.adicionarZeroEsquerda(STRING_123, NUMERO_3));

		Assert.assertEquals(STRING_123, StringUtil.adicionarZeroEsquerda(STRING_123, 0));

		Assert.assertEquals("000", StringUtil.adicionarZeroEsquerda("", NUMERO_3));

		Assert.assertEquals(null, StringUtil.adicionarZeroEsquerda(null, NUMERO_6));

		Assert.assertEquals(STRING_123, StringUtil.adicionarZeroEsquerda(STRING_123, -1));
	}

	/**
	 * Testa o método {@link StringUtil#adicionarZeroDireita(String, int)}.
	 */
	@Test
	public final void adicionarZeroDireita() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#adicionarZeroDireita(String, int).");

		Assert.assertEquals("123000", StringUtil.adicionarZeroDireita(STRING_123, NUMERO_6));

		Assert.assertEquals(STRING_123, StringUtil.adicionarZeroDireita(STRING_123, NUMERO_3));

		Assert.assertEquals(STRING_123, StringUtil.adicionarZeroDireita(STRING_123, 0));

		Assert.assertEquals("000", StringUtil.adicionarZeroDireita("", NUMERO_3));

		Assert.assertEquals(null, StringUtil.adicionarZeroDireita(null, NUMERO_6));

		Assert.assertEquals(STRING_123, StringUtil.adicionarZeroDireita(STRING_123, -1));
	}

	/**
	 * Testa o método {@link StringUtil#adicionarEspacoEsquerda(String, int)}.
	 */
	@Test
	public final void adicionarEspacoEsquerda() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#adicionarEspacoEsquerda(String, int).");

		Assert.assertEquals("   123", StringUtil.adicionarEspacoEsquerda(STRING_123, NUMERO_6));

		Assert.assertEquals(STRING_123, StringUtil.adicionarEspacoEsquerda(STRING_123, NUMERO_3));

		Assert.assertEquals(STRING_123, StringUtil.adicionarEspacoEsquerda(STRING_123, 0));

		Assert.assertEquals(STRING_3_ESPACOS, StringUtil.adicionarEspacoEsquerda("", NUMERO_3));

		Assert.assertEquals(null, StringUtil.adicionarEspacoEsquerda(null, NUMERO_6));

		Assert.assertEquals(STRING_123, StringUtil.adicionarEspacoEsquerda(STRING_123, -1));
	}

	/**
	 * Testa o método {@link StringUtil#adicionarEspacoDireita(String, int)}.
	 */
	@Test
	public final void adicionarEspacoDireita() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#adicionarEspacoDireita(String, int).");

		Assert.assertEquals("123   ", StringUtil.adicionarEspacoDireita(STRING_123, NUMERO_6));

		Assert.assertEquals(STRING_123, StringUtil.adicionarEspacoDireita(STRING_123, NUMERO_3));

		Assert.assertEquals(STRING_123, StringUtil.adicionarEspacoDireita(STRING_123, 0));

		Assert.assertEquals(STRING_3_ESPACOS, StringUtil.adicionarEspacoDireita("", NUMERO_3));

		Assert.assertEquals(null, StringUtil.adicionarEspacoDireita(null, NUMERO_6));

		Assert.assertEquals(STRING_123, StringUtil.adicionarEspacoDireita(STRING_123, -1));
	}

	/**
	 * Testa o método {@link StringUtil#removerEspacoDireita(String)}.
	 */
	@Test
	public final void removerEspacoDireita() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#removerEspacoDireita(String).");

		Assert.assertEquals("    123", StringUtil.removerEspacoDireita(STRING_ESPACOS_ESQUERDA_DIREITA));

		Assert.assertEquals("", StringUtil.removerEspacoDireita("   "));

		Assert.assertEquals(null, StringUtil.removerEspacoDireita(null));
	}

	/**
	 * Testa o método {@link StringUtil#removerEspacoEsquerda(String)}.
	 */
	@Test
	public final void removerEspacoEsquerda() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#removerEspacoEsquerda(String).");

		Assert.assertEquals("123    ", StringUtil.removerEspacoEsquerda(STRING_ESPACOS_ESQUERDA_DIREITA));

		Assert.assertEquals("", StringUtil.removerEspacoEsquerda(STRING_3_ESPACOS));

		Assert.assertEquals(null, StringUtil.removerEspacoEsquerda(null));
	}

	/**
	 * Testa o método {@link StringUtil#adicionarChar(char, int, String, boolean)}.
	 */
	@Test
	public final void adicionarChar() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#adicionarChar(char, int, String, boolean).");

		// TODO: Testar StringUtil#adicionarChar(char, int, String, boolean)
	}

	/**
	 * Testa o método {@link StringUtil#removerCharEsquerda(String, char)}.
	 */
	@Test
	public final void removerCharEsquerda() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#removerCharEsquerda(String, char).");

		// TODO: Testar StringUtil#removerCharEsquerda(String, char)
	}

	/**
	 * Testa o método {@link StringUtil#removerCharDireita(String, char)}.
	 */
	@Test
	public final void removerCharDireita() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#removerCharDireita(String, char).");

		// TODO: Testar StringUtil#removerCharDireita(String, char)
	}

	/**
	 * Testa o método {@link StringUtil#removerQuebraDeLinha(String)}.
	 */
	@Test
	public final void removerQuebraDeLinha() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#removerQuebraDeLinha(String).");

		// TODO: Testar StringUtil#removerQuebraDeLinha(String)
	}

}
