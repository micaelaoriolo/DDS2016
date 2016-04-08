package dominio;

import java.math.BigDecimal;

public class Saco implements Tipo {
	
	private BigDecimal precioBase;
	
	public BigDecimal getPrecioBase() {
		return this.precioBase;		
	}


	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}
	public Saco() {
		this.setPrecioBase(new BigDecimal(300));
	}

}
