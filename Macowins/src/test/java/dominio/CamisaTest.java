package dominio;
import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import dominio.Camisa;


public class CamisaTest {
	
	@Test
	public void precioCamisa() {
		Camisa camisa = new Camisa();
		Assert.assertEquals(new BigDecimal(200),camisa.getPrecioBase());
	}
}
