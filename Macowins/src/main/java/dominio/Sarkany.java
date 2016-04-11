package dominio;

import java.math.BigDecimal;

public class Sarkany implements Marca{

	public BigDecimal getCoeficiente(Prenda prenda){
		 return prenda.esCara() ? new BigDecimal(1.35) : new BigDecimal(1.1);
	}
	
}
