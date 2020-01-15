package mx.solser.bpi.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.DecimalFormat;

/**
 * 
 */

/**
 * @author cchong
 *
 */
public class Utilerias {

	public static String formateaNumeroToMoneda(Number monto) {
		DecimalFormat df = new DecimalFormat("#,###,###,##0.00");
		String montoFormateado = "0";
		montoFormateado = df.format(monto);

		return montoFormateado;

	}
	
	public static String generaFolio(final String idCliente) {
		Date fechaHoy = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmssSS");
		StringBuilder sb= new StringBuilder();
		sb.append(String.format("%08d", Integer.parseInt(idCliente)));
		sb.append(sdf.format(fechaHoy).substring(0, 8));
		return sb.toString();
		
	}
	
}
