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

}
