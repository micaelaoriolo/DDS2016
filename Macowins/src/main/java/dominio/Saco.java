package dominio;

import java.math.BigDecimal;

public class Saco implements Tipo {
	
	private BigDecimal precioBase;
	private BigDecimal cantidadDeBotones;
	
	public BigDecimal getCantidadDeBotones() {
		return cantidadDeBotones;
	}


	public void setCantidadDeBotones(BigDecimal cantidadDeBotones) {
		this.cantidadDeBotones = cantidadDeBotones;
	}


	public BigDecimal getPrecioBase() {
		return this.precioBase.add(this.cantidadDeBotones.multiply(new BigDecimal (10)));		
	}


	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}
	
	public Saco(Integer cantidadDeBotones) {
		this.setPrecioBase(new BigDecimal(300));
		this.setCantidadDeBotones(new BigDecimal (cantidadDeBotones));
	}

}
