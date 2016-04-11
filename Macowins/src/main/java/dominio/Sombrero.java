package dominio;
import java.math.BigDecimal;


public class Sombrero implements Tipo {
	private BigDecimal precioBase;
	private BigDecimal coeficienteDeM;

	public BigDecimal getcoeficienteDeM() {
		return coeficienteDeM;
	}

	public void setcoeficienteDeM(BigDecimal coeficienteDeM) {
		this.coeficienteDeM = coeficienteDeM;
	}

	public BigDecimal getPrecioBase() {
		return precioBase;
	}
	
	public Sombrero(Integer coeficienteDeM) {
		this.precioBase = new BigDecimal(150);
		this.coeficienteDeM = new BigDecimal(coeficienteDeM);
	}
	
	
}
