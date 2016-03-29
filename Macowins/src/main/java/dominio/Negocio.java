package dominio;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

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
	
	public Collection<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Collection<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public void vender(Prenda prenda, Integer cantidad, LocalTime fecha){
		prenda.setValorFijoDelNegocio(valorFijo);
		Venta venta = new Venta();
		venta.setPrenda(prenda);
		venta.setCantidad(cantidad);
		venta.setPrenda(prenda);
		this.ventas.add(venta);
	}
	
	public BigDecimal calcularGanancias(LocalTime fecha){
		return this.ventasDeLaFecha(fecha).stream()
			.map(v -> v.calcularGananciaVenta())
			.reduce(new BigDecimal(0), (p1, p2) -> p1.add(p2));
	}
	
	public Collection<Venta> ventasDeLaFecha(LocalTime fecha){
		return this.ventas
				.stream()
				.filter(v -> v.getFecha().equals(fecha))
				.collect(Collectors.toList());
	}
	
	
	
	
	

}
