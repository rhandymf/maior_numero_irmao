package test;

import org.junit.jupiter.api.Test;

import io.GetNumber;
import junit.framework.TestCase;

class GetNumberTest extends TestCase {

	@Test
	void testFormarMaiorNumeroIrmao() {
		String valorEnviado1[] = new String[1];
		valorEnviado1[0] = "123";
		
		String retornoEsperado1 = "321";
		
		String retornoObtido1 = GetNumber.formarMaiorNumeroIrmao(valorEnviado1);
		
		assertEquals(retornoEsperado1, retornoObtido1);
		
		String valorEnviado2[] = new String[1];
		valorEnviado2[0] = "553";
		
		String retornoEsperado2 = "553";
		
		String retornoObtido2 = GetNumber.formarMaiorNumeroIrmao(valorEnviado2);
		
		assertEquals(retornoEsperado2, retornoObtido2);
	}

}
