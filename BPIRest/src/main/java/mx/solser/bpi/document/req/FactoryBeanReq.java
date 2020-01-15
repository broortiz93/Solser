package mx.solser.bpi.document.req;

public class FactoryBeanReq{
	
	public static ReqPagoServicioDTO getReqPagoServicioDTO (final String convenio, final String cuenta, 
			final String monto, final String refPago, final String numTel, final String fecOperacion, 
			final String cadenaBand, final String tipoServicio, final String numCliente, 
			final String cveBanco,final String sePrograma, final String idOperacion, 
			final String secTransaccion, final String numVerificador, final String catCompania, 
			final int iCveCompania, final String cveDinamica,
			final String nomCompania, final String alias, final String fecAplicacion) {
		return new ReqPagoServicioDTO(convenio, cuenta, monto, refPago, numTel, fecOperacion,
				cadenaBand, tipoServicio, numCliente, cveBanco, sePrograma, idOperacion,
				secTransaccion, numVerificador, catCompania, iCveCompania, cveDinamica, nomCompania, alias, fecAplicacion);
	}
	public static ReqNumTransDTO getReqNumTransDTO (final String idOper) {
		return new ReqNumTransDTO(idOper);
	}
	
}