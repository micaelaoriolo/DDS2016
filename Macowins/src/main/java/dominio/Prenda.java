package dominio;
import java.math.BigDecimal;

public abstract class Prenda {
	
	private BigDecimal precioBase;
/*	private BigDecimal valorFijoDelNegocio;*/
	private Boolean esImportada;
	
	public Prenda(){
		super();
	}

	public BigDecimal getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}
	
	/*public BigDecimal getValorFijoDelNegocio() {     
		return valorFijoDelNegocio;									
	}

	public void setValorFijoDelNegocio(BigDecimal valorFijoDelNegocio) {		la prenda ya no tiene responsabilidad de asignarle el valor al negocio
		this.valorFijoDelNegocio = valorFijoDelNegocio;
	}*/

	public Boolean getEsImportada() {
		return esImportada;
	}

	public void setEsImportada(Boolean esImportada) {
		this.esImportada = esImportada;
	}
	
	private BigDecimal tasaImportacion(){
		return (this.esImportada ? new BigDecimal(1.3) : new BigDecimal(1));
	}

	public BigDecimal calcularPrecio(Negocio neg){
		return (this.precioBase.add(neg.getValorFijo())).multiply(this.tasaImportacion());
	}


}
