package com.github.brutils.javabrutils;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de teste unitário para testar a classe {@link NumeroUtil}.
 */
public class NumeroUtilTest {

	/**
	 * Logger da classe.
	 */
	private static final Logger LOGGER = Logger.getLogger(NumeroUtilTest.class.getName());

	/**
	 * Número inteiro nulo.
	 */
	private static final Integer INTEGER_NULO = null;

	/**
	 * Número long nulo.
	 */
	private static final Long LONG_NULO = null;

	/**
	 * Número float nulo.
	 */
	private static final Float FLOAT_NULO = null;

	/**
	 * Número double nulo.
	 */
	private static final Double DOUBLE_NULO = null;

	/**
	 * Número BigDecimal nulo.
	 */
	private static final BigDecimal BIGDECIMAL_NULO = null;

	/**
	 * Construtor padrão.
	 */
	public NumeroUtilTest() {
		// JUnit requer um construtor público.
	}

	/**
	 * Testa o método {@link NumeroUtil#isPositivo(Integer)}.
	 */
	@Test
	public final void isPositivoInteger() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isPositivo(Integer).");

		Assert.assertFalse(NumeroUtil.isPositivo(INTEGER_NULO));

		Assert.assertFalse(NumeroUtil.isPositivo(-1));

		Assert.assertFalse(NumeroUtil.isPositivo(0));

		Assert.assertTrue(NumeroUtil.isPositivo(1));
	}

	/**
	 * Testa o método {@link NumeroUtil#isPositivo(Long)}.
	 */
	@Test
	public final void isPositivoLong() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isPositivo(Long).");

		Assert.assertFalse(NumeroUtil.isPositivo(LONG_NULO));

		Assert.assertFalse(NumeroUtil.isPositivo(-1L));

		Assert.assertFalse(NumeroUtil.isPositivo(0L));

		Assert.assertTrue(NumeroUtil.isPositivo(1L));
	}

	/**
	 * Testa o método {@link NumeroUtil#isPositivo(Float)}.
	 */
	@Test
	public final void isPositivoFloat() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isPositivo(Float).");

		Assert.assertFalse(NumeroUtil.isPositivo(FLOAT_NULO));

		Assert.assertFalse(NumeroUtil.isPositivo(-1F));

		Assert.assertFalse(NumeroUtil.isPositivo(0F));

		Assert.assertTrue(NumeroUtil.isPositivo(1F));
	}

	/**
	 * Testa o método {@link NumeroUtil#isPositivo(Double)}.
	 */
	@Test
	public final void isPositivoDouble() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isPositivo(Double).");

		Assert.assertFalse(NumeroUtil.isPositivo(DOUBLE_NULO));

		Assert.assertFalse(NumeroUtil.isPositivo(-1D));

		Assert.assertFalse(NumeroUtil.isPositivo(0D));

		Assert.assertTrue(NumeroUtil.isPositivo(1D));
	}

	/**
	 * Testa o método {@link NumeroUtil#isPositivo(BigDecimal)}.
	 */
	@Test
	public final void isPositivoBigDecimal() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isPositivo(BigDecimal).");

		Assert.assertFalse(NumeroUtil.isPositivo(BIGDECIMAL_NULO));

		Assert.assertFalse(NumeroUtil.isPositivo(BigDecimal.valueOf(-1D)));

		Assert.assertFalse(NumeroUtil.isPositivo(BigDecimal.ZERO));

		Assert.assertTrue(NumeroUtil.isPositivo(BigDecimal.ONE));
	}

}
