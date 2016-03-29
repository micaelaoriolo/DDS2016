package dominio;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

public class Negocio {
	
	private BigDecimal valorFijo;
	private Collection<Venta> ventas = new ArrayList<Venta>();
	
	public Negocio() {
		super();
	}

	public BigDecimal getValorFijo() {
		return valorFijo;
	}

	public void setValorFijo(BigDecimal valorFijo) {
		this.valorFijo = valorFijo;
	}

	public Collection<Venta> getPrendas() {
		return ventas;
	}

	public void setPrendas(Collection<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public void vender(Prenda prenda, Integer cantidad, LocalTime fecha){
		Venta venta = new Venta();
		venta.setPrenda(prenda);
		venta.setCantidad(cantidad);
		venta.setPrenda(prenda);
		this.ventas.add(venta);
	}
	
	public BigDecimal calcularGanancias(LocalTime fecha){
		return this.ventas
			.stream()
			.filter(v -> v.getFecha().equals(fecha))
			.map(v -> v.getPrenda().calcularPrecio().multiply(new BigDecimal(v.getCantidad())))
			.reduce((p1, p2) -> p1.add(p2)).get();
	}
	
	
	
	
	

}
