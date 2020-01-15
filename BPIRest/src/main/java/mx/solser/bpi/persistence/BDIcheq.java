package mx.solser.bpi.persistence;

import java.text.MessageFormat;

import org.springframework.stereotype.Service;

import mx.solser.bpi.config.Constantes;
import mx.solser.bpi.document.req.FactoryBeanReq;
import mx.solser.bpi.document.req.ReqNumTransDTO;
import mx.solser.bpi.document.req.ReqPagoServicioDTO;
import mx.solser.bpi.document.res.FactoryBeanRes;
import mx.solser.bpi.document.res.ResNumTransDTO;
import mx.solser.bpi.document.res.ResPagoServicioDTO;
import mx.solser.bpi.util.Utilerias;

@Service
public class BDIcheq {
	
	private static final String SP_PAGO_SERVICIOS = "EXECUTE PROCEDURE sp_pago_servicios(''{0}'', ''{1}'', ''{2}'', ''{3}'', ''{4}'', ''{5}'', "
			+ "''{6}'', ''{7}'', ''{8}'', {9}, {10}, ''{11}'', ''{12}'', ''{13}'', ''{14}'', ''{15}'', {16}, {17}, {18}, "
			+ "{19}, {20}, {21}, ''{22}'', ''{23}'', ''{24}'', ''{25}'', ''{26}'', ''{27}'', ''{28}'', ''{29}'')";
	
	private static final String SP_OBTENERNUMTRANS = "EXECUTE PROCEDURE sp_obtenernumtrans(''{0}'')";
	
	private static final String SP_OBTIENEPARAMETRO = "EXECUTE PROCEDURE sp_obtieneparametro({0})";
	
	
	public ResPagoServicioDTO pagoServicios(ReqPagoServicioDTO reqPagoServicioDTO) {
		
		ResPagoServicioDTO resPagoServicioDTO = FactoryBeanRes.getResPagoServicioDTO();
		ReqNumTransDTO reqNumTransDTO;
		ResNumTransDTO resNumTransDTO = FactoryBeanRes.getResNumTransDTO();
//		Header oRec = null;
		String trama = "";
		String folio = "";
		String ctaDestino = "";
		int iCodRet = 0;
				try {
				folio = Utilerias.generaFolio("1234567");
				
				// OBTIENE LA CUENTA DESTINO PARA REALIZAR EL PAGO
				trama = MessageFormat.format(SP_OBTIENEPARAMETRO, reqPagoServicioDTO.getCuentaServicio());
//				oRec = executor.executeInterAct(trama, "bdisac");
//				iCodRet = Integer.parseInt(oRec.get_io_buf().substring(0, 5));

				if (iCodRet != 0) {
//					LOG.error("Pago de Servicios. No se encontro el id de operacion.");
					resPagoServicioDTO.setpMensaje("Error1");
					resPagoServicioDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
				}
//				ctaDestino = oRec.get_io_buf().substring(5).trim();
				
				// OBTIENE EL NUMERO DE TRANSFERENCIA DE CARGO Y ABONO
				reqNumTransDTO = FactoryBeanReq.getReqNumTransDTO(reqPagoServicioDTO.getOperacionServicio());
				resNumTransDTO = obtenerNumTransferencia(reqNumTransDTO);
				
				// REALIZA EL PAGO DE SERVICIOS
//				oRec = null;
				trama = MessageFormat.format(SP_PAGO_SERVICIOS, "001",
						"5003", "transBPI", resNumTransDTO.getNumTransCargo(),
						resNumTransDTO.getNumTransAbono(), reqPagoServicioDTO.getCargoSuc(), folio,
						reqPagoServicioDTO.getCuenta(), ctaDestino, "0", reqPagoServicioDTO.getMonto(),
						"01",
						reqPagoServicioDTO.getNumTel() + " " + reqPagoServicioDTO.getRefPago(), "", "", "",
						reqPagoServicioDTO.getMonto(), reqPagoServicioDTO.getMonto(), "0", "0", "0", "0",
						reqPagoServicioDTO.getCategoria(), reqPagoServicioDTO.getConvenioOp(),
						reqPagoServicioDTO.getNumTel(), reqPagoServicioDTO.getNumVerificador(), "2",
						reqPagoServicioDTO.getCuenta(), reqPagoServicioDTO.getCargo(),
						reqPagoServicioDTO.getFecOperacion());
				
				
//				oRec = executor.executeInterAct(trama, "bdisac");
//				iCodRet = Integer.parseInt(oRec.get_io_buf().substring(0, 5).trim());
//				int iCodRetRev = Integer.valueOf(oRec.get_io_buf().substring(5, 9).trim()).intValue();

				if (iCodRet == 35) {
//					LOG.error("Pago de Servicios. Excedi el limite diario M&aacute;ximo permitido.");
					resPagoServicioDTO.setpMensaje("Error35");
					resPagoServicioDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
				}

				if (iCodRet != 0) {
//					LOG.error("Pago de Servicios. No se pudo realizar el pago.");
					resPagoServicioDTO.setpMensaje("Error2");
					resPagoServicioDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
				}
//				if (iCodRetRev != 0) {
////					LOG.error("Pago de Servicios. Rollback Ejecutado");
//					resPagoServicioDTO.setpMensaje("Error3");
//					resPagoServicioDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
//				}
//				if (iCodRetRev == 0 && iCodRet == 0) {
//					resPagoServicioDTO.setpCodRetorno(Constantes.COD_ERROR_EXITO);
//					resPagoServicioDTO.setFolio(folio);
//					resPagoServicioDTO.setOperacionServicio(reqPagoServicioDTO.getOperacionServicio());
//					resPagoServicioDTO.setCtaDestino(ctaDestino);
//					resPagoServicioDTO.setNumTransCargo(resNumTransDTO.getNumTransCargo());
//					resPagoServicioDTO.setNumTransAbono(resNumTransDTO.getNumTransAbono());
//				}
		} catch (Exception e) {
			resPagoServicioDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
//			LOG.error("ERROR: " + e.getMessage(), e);
		}
		return resPagoServicioDTO;
	}
	
public ResNumTransDTO obtenerNumTransferencia (ReqNumTransDTO reqNumTransDTO) {
		
		ResNumTransDTO resNumTransDTO = FactoryBeanRes.getResNumTransDTO();
//		Header oRec = null;
		String trama = "";
		String tramaResp = "";
		String sNumTrans = "";
		
		try {
			trama = MessageFormat.format(SP_OBTENERNUMTRANS, 
					reqNumTransDTO.getIdOper());

//			oRec = executor.executeInterAct(trama, "bdibpi");
			
//			tramaResp = oRec.get_io_buf();
			if (!tramaResp.substring(0, 5).equals("00000")) {
				resNumTransDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
			} else {
				resNumTransDTO.setpCodRetorno(Constantes.COD_ERROR_EXITO);
				sNumTrans = tramaResp.substring(5, 13);
				resNumTransDTO.setNumTransAbono(sNumTrans.substring(4));
				resNumTransDTO.setNumTransCargo(sNumTrans.substring(0, 4));
			}
		} catch (Exception e) {
			resNumTransDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
//			LOG.error("ERROR: " + e.getMessage(), e);
		}
		return resNumTransDTO;
	}
	
}