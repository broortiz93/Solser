package mx.solser.bpi.persistence;

import mx.solser.bpi.document.req.ReqPagoServicioDTO;
import mx.solser.bpi.document.res.ResPagoServicioDTO;

public interface IPagoConvenioServiciosPersistencia {
	
	ResPagoServicioDTO pagosServicios (ReqPagoServicioDTO reqPagoServicioDTO);
	
}
