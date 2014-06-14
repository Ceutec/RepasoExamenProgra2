import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {

	@Test
	public void testSumarNumeros()
	{
		assertEquals("10 + 20 deberia ser igual a 30", 30, MiClase.sumarNumeros(10,20));
		assertEquals("100 + 230 deberia ser igual a 330", 330, MiClase.sumarNumeros(100,230));
		assertEquals("-5 + 10 deberia ser igual a 5", 5, MiClase.sumarNumeros(-5,10));
		assertEquals("22 + 11 deberia ser igual a 11", 11, MiClase.sumarNumeros(22,-11));
	}

}
