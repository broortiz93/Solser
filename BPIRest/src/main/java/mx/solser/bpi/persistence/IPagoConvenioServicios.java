package mx.solser.bpi.persistence;

import org.springframework.stereotype.Service;

import mx.solser.bpi.document.req.ReqPagoServicioDTO;
import mx.solser.bpi.document.res.ResPagoServicioDTO;

public interface IPagoConvenioServicios {

	ResPagoServicioDTO pagosServicios (ReqPagoServicioDTO reqPagoServicioDTO);
	
}
