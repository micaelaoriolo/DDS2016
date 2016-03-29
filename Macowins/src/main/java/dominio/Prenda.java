package dominio;
import java.math.BigDecimal;

public abstract class Prenda {
	
	private BigDecimal precioBase;
	private BigDecimal valorFijoDelNegocio;
	private Boolean esImportada;
	private Float tasaImportacion;
	
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
	
	public Float getTasaImportacion(){
		return this.tasaImportacion;
	}
	
	public void setTasaImportacion(Float tasa){
		this.tasaImportacion = tasa;
	}

	public BigDecimal calcularPrecio(){
		BigDecimal precioSinImportacion = this.precioBase.add(valorFijoDelNegocio);
		return (this.esImportada ? 
					precioSinImportacion.multiply(new BigDecimal(this.tasaImportacion)) 
					: precioSinImportacion);
	}


}
