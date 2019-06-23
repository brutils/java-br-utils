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

	/**
	 * Testa o método {@link NumeroUtil#isNegativo(Integer)}.
	 */
	@Test
	public final void isNegativoInteger() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isNegativo(Integer).");

		Assert.assertFalse(NumeroUtil.isNegativo(INTEGER_NULO));

		Assert.assertTrue(NumeroUtil.isNegativo(-1));

		Assert.assertFalse(NumeroUtil.isNegativo(0));

		Assert.assertFalse(NumeroUtil.isNegativo(1));
	}

	/**
	 * Testa o método {@link NumeroUtil#isNegativo(Long)}.
	 */
	@Test
	public final void isNegativoLong() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isNegativo(Long).");

		Assert.assertFalse(NumeroUtil.isNegativo(LONG_NULO));

		Assert.assertTrue(NumeroUtil.isNegativo(-1L));

		Assert.assertFalse(NumeroUtil.isNegativo(0L));

		Assert.assertFalse(NumeroUtil.isNegativo(1L));
	}

	/**
	 * Testa o método {@link NumeroUtil#isNegativo(Float)}.
	 */
	@Test
	public final void isNegativoFloat() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isNegativo(Float).");

		Assert.assertFalse(NumeroUtil.isNegativo(FLOAT_NULO));

		Assert.assertTrue(NumeroUtil.isNegativo(-1F));

		Assert.assertFalse(NumeroUtil.isNegativo(0F));

		Assert.assertFalse(NumeroUtil.isNegativo(1F));
	}

	/**
	 * Testa o método {@link NumeroUtil#isNegativo(Double)}.
	 */
	@Test
	public final void isNegativoDouble() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isNegativo(Double).");

		Assert.assertFalse(NumeroUtil.isNegativo(DOUBLE_NULO));

		Assert.assertTrue(NumeroUtil.isNegativo(-1D));

		Assert.assertFalse(NumeroUtil.isNegativo(0D));

		Assert.assertFalse(NumeroUtil.isNegativo(1D));
	}

	/**
	 * Testa o método {@link NumeroUtil#isNegativo(BigDecimal)}.
	 */
	@Test
	public final void isNegativoBigDecimal() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isNegativo(BigDecimal).");

		Assert.assertFalse(NumeroUtil.isNegativo(BIGDECIMAL_NULO));

		Assert.assertTrue(NumeroUtil.isNegativo(BigDecimal.valueOf(-1D)));

		Assert.assertFalse(NumeroUtil.isNegativo(BigDecimal.ZERO));

		Assert.assertFalse(NumeroUtil.isNegativo(BigDecimal.ONE));
	}

	/**
	 * Testa o método {@link NumeroUtil#isVazio(Integer)}.
	 */
	@Test
	public final void isVazioInteger() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isVazio(Integer).");

		Assert.assertTrue(NumeroUtil.isVazio(INTEGER_NULO));

		Assert.assertTrue(NumeroUtil.isVazio(0));

		Assert.assertTrue(NumeroUtil.isVazio(Integer.valueOf(0)));

		Assert.assertFalse(NumeroUtil.isVazio(1));

		Assert.assertFalse(NumeroUtil.isVazio(-1));

		Assert.assertFalse(NumeroUtil.isVazio(Integer.valueOf(1)));
	}

	/**
	 * Testa o método {@link NumeroUtil#isVazio(Long)}.
	 */
	@Test
	public final void isVazioLong() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isVazio(Long).");

		Assert.assertTrue(NumeroUtil.isVazio(LONG_NULO));

		Assert.assertTrue(NumeroUtil.isVazio(0L));

		Assert.assertTrue(NumeroUtil.isVazio(Long.valueOf(0)));

		Assert.assertFalse(NumeroUtil.isVazio(1L));

		Assert.assertFalse(NumeroUtil.isVazio(-1L));

		Assert.assertFalse(NumeroUtil.isVazio(Long.valueOf(1)));
	}

	/**
	 * Testa o método {@link NumeroUtil#isVazio(Double)}.
	 */
	@Test
	public final void isVazioDouble() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isVazio(Double).");

		Assert.assertTrue(NumeroUtil.isVazio(DOUBLE_NULO));

		Assert.assertTrue(NumeroUtil.isVazio(0.0));

		Assert.assertTrue(NumeroUtil.isVazio(Double.valueOf(0.0)));

		Assert.assertFalse(NumeroUtil.isVazio(1.0));

		Assert.assertFalse(NumeroUtil.isVazio(-1.0));

		Assert.assertFalse(NumeroUtil.isVazio(Double.valueOf(1.0)));
	}

	/**
	 * Testa o método {@link NumeroUtil#isVazio(BigDecimal)}.
	 */
	@Test
	public final void isVazioBigDecimal() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#isVazio(BigDecimal).");

		Assert.assertTrue(NumeroUtil.isVazio(BIGDECIMAL_NULO));

		Assert.assertTrue(NumeroUtil.isVazio(BigDecimal.ZERO));

		Assert.assertTrue(NumeroUtil.isVazio(BigDecimal.valueOf(0)));

		Assert.assertFalse(NumeroUtil.isVazio(BigDecimal.ONE));

		Assert.assertFalse(NumeroUtil.isVazio(BigDecimal.valueOf(-1)));

		Assert.assertFalse(NumeroUtil.isVazio(BigDecimal.valueOf(1)));
	}

	/**
	 * Testa o método {@link NumeroUtil#nuloParaZero(Integer)}.
	 */
	@Test
	public final void nuloParaZeroInteger() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#nuloParaZero(Integer).");

		// TODO: Testar NumeroUtil#nuloParaZero(Integer)
	}

	/**
	 * Testa o método {@link NumeroUtil#nuloParaZero(Long)}.
	 */
	@Test
	public final void nuloParaZeroLong() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#nuloParaZero(Long).");

		// TODO: Testar NumeroUtil#nuloParaZero(Long)
	}

	/**
	 * Testa o método {@link NumeroUtil#nuloParaZero(Float)}.
	 */
	@Test
	public final void nuloParaZeroFloat() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#nuloParaZero(Float).");

		// TODO: Testar NumeroUtil#nuloParaZero(Float)
	}

	/**
	 * Testa o método {@link NumeroUtil#nuloParaZero(Double)}.
	 */
	@Test
	public final void nuloParaZeroDouble() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#nuloParaZero(Double).");

		// TODO: Testar NumeroUtil#nuloParaZero(Double)
	}

	/**
	 * Testa o método {@link NumeroUtil#nuloParaZero(BigDecimal)}.
	 */
	@Test
	public final void nuloParaZeroBigDecimal() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#nuloParaZero(BigDecimal).");

		// TODO: Testar NumeroUtil#nuloParaZero(BigDecimal)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoPositivoParaNulo(Integer)}.
	 */
	@Test
	public final void naoPositivoParaNuloInteger() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoPositivoParaNulo(Integer).");

		// TODO: Testar NumeroUtil#naoPositivoParaNulo(Integer)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoPositivoParaNulo(Long)}.
	 */
	@Test
	public final void naoPositivoParaNuloLong() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoPositivoParaNulo(Long).");

		// TODO: Testar NumeroUtil#naoPositivoParaNulo(Long)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoPositivoParaNulo(Float)}.
	 */
	@Test
	public final void naoPositivoParaNuloFloat() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoPositivoParaNulo(Float).");

		// TODO: Testar NumeroUtil#naoPositivoParaNulo(Float)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoPositivoParaNulo(Double)}.
	 */
	@Test
	public final void naoPositivoParaNuloDouble() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoPositivoParaNulo(Double).");

		// TODO: Testar NumeroUtil#naoPositivoParaNulo(Double)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoPositivoParaNulo(BigDecimal)}.
	 */
	@Test
	public final void naoPositivoParaNuloBigDecimal() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoPositivoParaNulo(BigDecimal).");

		// TODO: Testar NumeroUtil#naoPositivoParaNulo(BigDecimal)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoNegativoParaNulo(Integer)}.
	 */
	@Test
	public final void naoNegativoParaNuloInteger() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoNegativoParaNulo(Integer).");

		// TODO: Testar NumeroUtil#naoNegativoParaNulo(Integer)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoNegativoParaNulo(Long)}.
	 */
	@Test
	public final void naoNegativoParaNuloLong() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoNegativoParaNulo(Long).");

		// TODO: Testar NumeroUtil#naoNegativoParaNulo(Long)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoNegativoParaNulo(Float)}.
	 */
	@Test
	public final void naoNegativoParaNuloFloat() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoNegativoParaNulo(Float).");

		// TODO: Testar NumeroUtil#naoNegativoParaNulo(Float)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoNegativoParaNulo(Double)}.
	 */
	@Test
	public final void naoNegativoParaNuloDouble() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoNegativoParaNulo(Double).");

		// TODO: Testar NumeroUtil#naoNegativoParaNulo(Double)
	}

	/**
	 * Testa o método {@link NumeroUtil#naoNegativoParaNulo(BigDecimal)}.
	 */
	@Test
	public final void naoNegativoParaNuloBigDecimal() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#naoNegativoParaNulo(BigDecimal).");

		// TODO: Testar NumeroUtil#naoNegativoParaNulo(BigDecimal)
	}

	/**
	 * Testa o método {@link NumeroUtil#converterParaBigDecimal(String)}.
	 */
	@Test
	public final void converterParaBigDecimal() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#converterParaBigDecimal(String).");

		// TODO: Testar NumeroUtil#converterParaBigDecimal(String)
	}

	/**
	 * Testa o método {@link NumeroUtil#converterParaInteger(String)}.
	 */
	@Test
	public final void converterParaInteger() {

		LOGGER.log(Level.FINEST, "Testando NumeroUtil#converterParaInteger(String).");

		// TODO: Testar NumeroUtil#converterParaInteger(String)
	}
}
