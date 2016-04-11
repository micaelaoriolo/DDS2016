package dominio;

import java.math.BigDecimal;

public class Pantalon implements Tipo{
	private BigDecimal precioBase;
	private BigDecimal cantidadTela;
	private BigDecimal precioCM;

	public BigDecimal getCantidadTela() {
		return cantidadTela;
	}
	public void setCantidadTela(BigDecimal cantidadTela) {
		this.cantidadTela = cantidadTela;
	}
	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}
	public BigDecimal getPrecioBase() {
		return this.precioBase.add(this.getCantidadTela());		
	}

	public BigDecimal getPrecioCM() {
		return precioCM;
	}
	public void setPrecioCM(BigDecimal precioCM) {
		this.precioCM = precioCM;
	}
	public Pantalon(Integer cantidadTela){
		this.setPrecioBase(new BigDecimal(250));
		this.setCantidadTela(new BigDecimal(cantidadTela));
		this.setPrecioCM(new BigDecimal(1));
	}

}
