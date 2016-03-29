package dominio;
import java.math.BigDecimal;

public abstract class Prenda {
	
	private BigDecimal precioBase;
	private BigDecimal valorFijoDelNegocio;
	private Boolean esImportada;
	private Float tasaImportacion; //por qué no es variable de instnacia: si la quiero modifcar en un
									//futuro, sólo modifico la tasa de las instancias por crearse, y no se
									//todas las que ya se crearon también.
	
	public Prenda(){
		super();
		this.tasaImportacion = 0.3F;
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

	public BigDecimal calcularPrecio(){
		BigDecimal precioSinImportacion = this.precioBase.add(valorFijoDelNegocio);
		return (this.esImportada ? 
					precioSinImportacion.multiply(new BigDecimal(this.tasaImportacion)) 
					: precioSinImportacion);
	}


}
