package dominio;
import java.math.BigDecimal;
public class Zapato implements Tipo{



		private BigDecimal precioBase;
		private BigDecimal talle;

		public BigDecimal getTalle() {
			return talle;
		}

		public void setTalle(BigDecimal talle) {
			this.talle = talle;
		}

		public BigDecimal getPrecioBase() {
			return precioBase;
		}
		
		public Zapato(Integer talle) {
			this.precioBase = new BigDecimal(200);
			this.talle = new BigDecimal(talle);
		}
		
		

	}

