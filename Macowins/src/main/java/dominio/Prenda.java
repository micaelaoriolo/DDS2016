package dominio;
import java.math.BigDecimal;

public class Prenda {
	
	private BigDecimal precioBase;
	private Boolean esImportada;
	private Tipo tipo;
	
	
	public Prenda(Tipo tipo){
		this.setTipo(tipo);
		
	}
	
	
	
	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}
	

	public Boolean getEsImportada() {
		return esImportada;
	}


	
	private BigDecimal tasaImportacion(){
		return (this.getEsImportada() ? new BigDecimal(1.3) : new BigDecimal(1));
	}

	public BigDecimal calcularPrecio(BigDecimal valorFijo){
		return (this.tipo.getPrecioBase().add(valorFijo)).multiply(this.tasaImportacion());
	}

	public void setEsImportada(boolean b) {
		this.esImportada=b;
		
	}




}
