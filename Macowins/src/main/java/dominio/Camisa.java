package dominio;

import java.math.BigDecimal;

public class Camisa implements Tipo {

	private BigDecimal precioBase;
	

	public BigDecimal getPrecioBase() {
		return precioBase;
	}
	
	public Camisa() {
		this.precioBase = new BigDecimal(200);
	}
	
	

}
