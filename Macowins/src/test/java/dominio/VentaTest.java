package dominio;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

public class VentaTest {

	@Test
	public void testGuardarVentasDia() {
		Negocio macowins = new Negocio(new BigDecimal(50));
		Pantalon pant = new Pantalon();
		pant.setEsImportada(false);
		Camisa cam = new Camisa();
		cam.setEsImportada(true);
		macowins.vender(cam, 2, LocalDate.now());
		macowins.vender(pant, 1, LocalDate.now());
		assertEquals(2, macowins.ventasDeLaFecha(LocalDate.now()).size());
	}
	
	@Test
	public void testMontoVentasDia() {
		Negocio macowins = new Negocio(new BigDecimal(50));
		Pantalon pant = new Pantalon();
		pant.setEsImportada(false);
		Camisa cam = new Camisa();
		cam.setEsImportada(true);
		macowins.vender(cam, 1, LocalDate.now());
		macowins.vender(pant, 1, LocalDate.now());
		assertEquals(new BigDecimal(625), macowins.calcularGanancias(LocalDate.now()));
	}
}
