package teste_01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CamelCaseConverterTest {
	
	private CamelCaseConverter camelCase;
	
	@Before
	public void setup(){
	camelCase = new CamelCaseConverter();
	}
	@Test
	public void deveCriarObjetoCamelCaseConverter() throws Exception {
				
	}
	
	@Test
	public void aplicarCamelCaseEmNomeUnico() throws Exception {
		Assert.assertEquals("Shirley", camelCase.converter("shirley"));	
	}
	
	@Test
	public void deveConverterNomeSimplesMisturaMaiusculoMinusculo() throws Exception {
		Assert.assertEquals("Shirley", camelCase.converter("sHiRley"));	
	}


}
