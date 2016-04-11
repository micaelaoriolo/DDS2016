package dominio;

import java.math.BigDecimal;

public class Armani implements Marca{
	
	

	public BigDecimal getCoeficiente(Prenda prenda) {
		return new BigDecimal(1.65);
	}

}
