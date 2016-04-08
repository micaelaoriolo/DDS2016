package dominio;

import java.math.BigDecimal;

public class Pantalon implements Tipo{
	private BigDecimal precioBase;
	
	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}
	public BigDecimal getPrecioBase() {
		return this.precioBase;		
	}


	public Pantalon(){
		this.setPrecioBase(new BigDecimal(250));
	}

}
