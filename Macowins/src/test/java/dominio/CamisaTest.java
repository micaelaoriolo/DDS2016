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
	
	@Test
	public void precioFinalCamisa(){
		Negocio negocio = new Negocio(new BigDecimal(100));
		Prenda camisa = new Prenda(new Camisa());
		camisa.setEsImportada(true);
		Assert.assertEquals(new BigDecimal(390).doubleValue(),camisa.calcularPrecio(negocio.getValorFijo()).doubleValue(), 0.002);
		
		
	}
}
