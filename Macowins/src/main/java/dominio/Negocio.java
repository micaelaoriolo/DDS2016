package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Negocio {
	
	private BigDecimal valorFijo;
	private Collection<Venta> ventas = new ArrayList<Venta>();
	
	/*
	public Negocio() {
		super();
	}*/
	
	public Negocio(BigDecimal valor)
	{
		this.valorFijo=valor;
	}
	
	public BigDecimal getValorFijo() {
		return valorFijo;
	}
	
	/*
	public void setValorFijo(BigDecimal valorFijo) {
		this.valorFijo = valorFijo;
	}*/
	
	public Collection<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Collection<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public void vender(Prenda prenda, Integer cantidad, LocalDate fecha){
		//prenda.setValorFijoDelNegocio(valorFijo);
		Venta venta = new Venta();
		venta.setPrenda(prenda);
		venta.setCantidad(cantidad);
		venta.setFecha(fecha);
		this.ventas.add(venta);
	}
	
	public BigDecimal calcularGanancias(LocalDate fecha){
	return this.ventasDeLaFecha(fecha).stream()
			.map(v -> v.calcularGananciaVenta(this))
			.reduce(new BigDecimal(0), (p1, p2) -> p1.add(p2));}
		/*BigDecimal resultado = new BigDecimal(0);
		for(Venta aux : (Iterable<Venta>)()->ventas.stream().filter(x->x.getFecha().equals(fecha)).iterator())
		{
			resultado = resultado.add(aux.calcularGananciaVenta(this));
		}
		return resultado;
	}*/
	
	public Collection<Venta> ventasDeLaFecha(LocalDate fecha){
		return this.ventas
				.stream()
				.filter(v -> v.getFecha().equals(fecha))
				.collect(Collectors.toList());
	}
	
	
	
	
	

}
