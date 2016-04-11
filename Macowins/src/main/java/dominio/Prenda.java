package dominio;
import java.math.BigDecimal;

public class Prenda {
	
	private BigDecimal precioBase;
	private Boolean esImportada;
	private Tipo tipo;
	private Marca marca;
	
	public Prenda(Tipo tipo){
		this.setTipo(tipo);
		
	}
	
	public Marca getMarca() {
		return marca;
	}



	public void setMarca(Marca marca) {
		this.marca = marca;
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
	
	public Boolean esCara(){
		return this.tipo.getPrecioBase().compareTo(new BigDecimal(500)) == 1;
	}

	
	private BigDecimal tasaImportacion(){
		return (this.getEsImportada() ? new BigDecimal(1.3) : new BigDecimal(1));
	}

	public BigDecimal calcularPrecio(BigDecimal valorFijo){
		return (this.tipo.getPrecioBase().add(valorFijo)).multiply(this.tasaImportacion()).multiply(this.marca.getCoeficiente(this));
	}

	public void setEsImportada(boolean b) {
		this.esImportada=b;
		
	}






}
