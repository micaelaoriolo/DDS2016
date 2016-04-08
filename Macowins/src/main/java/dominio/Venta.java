package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Venta {
	
	private Prenda prenda;
	private LocalDate fecha;
	private Integer cantidad;
	
	public Venta() {
		super();
	}
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public BigDecimal calcularGananciaVenta(BigDecimal valorFijo){
		return this.prenda.calcularPrecio(valorFijo).multiply(new BigDecimal(this.cantidad));
	}
	
	
	
	

}
