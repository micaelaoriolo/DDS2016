import org.junit.Assert;
import org.junit.Test;

import dominio.Camisa;


public class CamisaTest {
	@Test
	public void precioCamisa() {
		Camisa camisa = new Camisa();
		Assert.assertEquals(200,camisa.getPrecioBase());
	}
}
