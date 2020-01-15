package mx.solser.bpi.buss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.solser.bpi.config.Constantes;
import mx.solser.bpi.document.req.ReqPagoServicioDTO;
import mx.solser.bpi.document.res.FactoryBeanRes;
import mx.solser.bpi.document.res.ResPagoServicioDTO;
import mx.solser.bpi.persistence.IPagoConvenioServicios;
import mx.solser.bpi.persistence.IPagoConvenioServiciosPersistencia;

@Service
public class IPagoServicioImp implements IPagoConvenioServicios{
	
	@Autowired
	private IPagoConvenioServiciosPersistencia pagoConvenioServiciosService;
	
	@Override
	public ResPagoServicioDTO pagosServicios(ReqPagoServicioDTO reqPagoServicioDTO) {
				ResPagoServicioDTO resPagoServicioDTO = FactoryBeanRes.getResPagoServicioDTO();
		
		try {					
			reqPagoServicioDTO.setCategoria("06");
			reqPagoServicioDTO.setNumVerificador(reqPagoServicioDTO.getNumTel().substring(reqPagoServicioDTO.getNumTel().length() - 1));
			reqPagoServicioDTO.setCargo("8651");
//			tranCargo = param.NUM_TR_CARGOSKY"8651";
			reqPagoServicioDTO.setCargoSuc("8651");
			reqPagoServicioDTO.setConvenioOp("001");
			reqPagoServicioDTO.setCuentaServicio("6001");
			reqPagoServicioDTO.setOperacionServicio("1021");
			reqPagoServicioDTO.setTipoOp("PARAM_CONV_NUMTRF");
//			tranAbono = param.NUM_TR_ABONOSKY"1167";
			
			//REALIZA EL PAGO DEL SERVICIO
			resPagoServicioDTO = pagoConvenioServiciosService.pagosServicios(reqPagoServicioDTO);
							
			if (Constantes.COD_ERROR_EXITO.equals(resPagoServicioDTO.getpCodRetorno())) {
				resPagoServicioDTO.setpCodRetorno(Constantes.COD_ERROR_EXITO);
			}else {
				resPagoServicioDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
			}
		} catch (Exception e) {
			resPagoServicioDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
			e.printStackTrace();
		}
		return resPagoServicioDTO;
	}
	
	
}


