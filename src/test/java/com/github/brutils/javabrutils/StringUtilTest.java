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

		// TODO: Testar StringUtil#adicionarZeroEsquerda(String, int)
	}

	/**
	 * Testa o método {@link StringUtil#adicionarZeroDireita(String, int)}.
	 */
	@Test
	public final void adicionarZeroDireita() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#adicionarZeroDireita(String, int).");

		// TODO: Testar StringUtil#adicionarZeroDireita(String, int)
	}

	/**
	 * Testa o método {@link StringUtil#adicionarEspacoEsquerda(String, int)}.
	 */
	@Test
	public final void adicionarEspacoEsquerda() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#adicionarEspacoEsquerda(String, int).");

		// TODO: Testar StringUtil#adicionarEspacoEsquerda(String, int)
	}

	/**
	 * Testa o método {@link StringUtil#adicionarEspacoDireita(String, int)}.
	 */
	@Test
	public final void adicionarEspacoDireita() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#adicionarEspacoDireita(String, int).");

		// TODO: Testar StringUtil#adicionarEspacoDireita(String, int)
	}

	/**
	 * Testa o método {@link StringUtil#removerEspacoDireita(String)}.
	 */
	@Test
	public final void removerEspacoDireita() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#removerEspacoDireita(String).");

		// TODO: Testar StringUtil#removerEspacoDireita(String)
	}

	/**
	 * Testa o método {@link StringUtil#removerEspacoEsquerda(String)}.
	 */
	@Test
	public final void removerEspacoEsquerda() {

		LOGGER.log(Level.FINEST, "Testando StringUtil#removerEspacoEsquerda(String).");

		// TODO: Testar StringUtil#removerEspacoEsquerda(String)
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
