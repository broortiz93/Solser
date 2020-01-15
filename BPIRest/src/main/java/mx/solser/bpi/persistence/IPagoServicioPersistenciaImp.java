package mx.solser.bpi.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.solser.bpi.document.req.ReqPagoServicioDTO;
import mx.solser.bpi.document.res.ResPagoServicioDTO;

@Service
public class IPagoServicioPersistenciaImp implements IPagoConvenioServiciosPersistencia{
	
	@Autowired
	private BDIcheq bDIcheq = null;
	
	@Override
	public ResPagoServicioDTO pagosServicios(ReqPagoServicioDTO reqPagoServicioDTO) {
		
		return bDIcheq.pagoServicios(reqPagoServicioDTO);
	}
}