package dominio;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

public class NegocioTest {
	
	
	@Test
	public void testGuardarVentasDia() {
		Negocio macowins = new Negocio(new BigDecimal(50));
		Prenda pant = new Prenda(new Pantalon(100));
		pant.setEsImportada(false);
		Prenda cam = new Prenda(new Camisa());
		cam.setEsImportada(true);
		macowins.vender(cam, 2, LocalDate.now());
		macowins.vender(pant, 1, LocalDate.now());
		assertEquals(2, macowins.ventasDeLaFecha(LocalDate.now()).size());
	}
	
	@Test
	public void testMontoVentasDia() {
		Negocio macowins = new Negocio(new BigDecimal(50));
		Prenda pant = new Prenda(new Pantalon(100));
		pant.setEsImportada(false);
		pant.setMarca(new Armani());
		
		Prenda cam = new Prenda(new Camisa());
		cam.setEsImportada(false);
		cam.setMarca(new Armani());
		
		Prenda saco = new Prenda(new Saco(10));
		saco.setEsImportada(true);
		saco.setMarca(new Sarkany());
		
		Prenda zapato = new Prenda(new Zapato(40));
		zapato.setEsImportada(false);
		zapato.setMarca(new Armani());
		
		Prenda sombrero = new Prenda(new Sombrero(5));
		sombrero.setEsImportada(false);
		sombrero.setMarca(new Sarkany());
		
		
		macowins.vender(cam, 1, LocalDate.now());
		macowins.vender(pant, 1, LocalDate.now());
		macowins.vender(saco, 1, LocalDate.now());
		macowins.vender(zapato, 5, LocalDate.now());
		macowins.vender(sombrero, 10, LocalDate.now());
		
		
		assertEquals(new BigDecimal(5978.5).doubleValue(), macowins.calcularGanancias(LocalDate.now()).doubleValue(), 0.002);
	}
	
	@Test
	public void testGuardarVentas() {
		Negocio macowins = new Negocio(new BigDecimal(50));
		Prenda pant = new Prenda(new Pantalon(100));
		pant.setEsImportada(false);
		Prenda cam = new Prenda(new Camisa());
		cam.setEsImportada(true);
		macowins.vender(cam, 2, LocalDate.now());
		macowins.vender(pant, 1, LocalDate.now());
		assertEquals(2, macowins.getVentas().size());
	}

}
