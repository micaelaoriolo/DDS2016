package dominio;
import java.math.BigDecimal;

public abstract class Prenda {
	
	private BigDecimal precioBase;
	private BigDecimal valorFijoDelNegocio;
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
	
	public BigDecimal getValorFijoDelNegocio() {
		return valorFijoDelNegocio;
	}

	public void setValorFijoDelNegocio(BigDecimal valorFijoDelNegocio) {
		this.valorFijoDelNegocio = valorFijoDelNegocio;
	}

	public Boolean getEsImportada() {
		return esImportada;
	}

	public void setEsImportada(Boolean esImportada) {
		this.esImportada = esImportada;
	}
	
	private Float tasaImportacion(){
		return (this.esImportada ? 1.3F : 1F);
	}

	public BigDecimal calcularPrecio(){
		return (this.precioBase.add(this.valorFijoDelNegocio)).multiply(new BigDecimal(this.tasaImportacion()));
	}


}
