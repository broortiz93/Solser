/**
 * 
 */
package mx.solser.bpi.service;


import org.jfree.util.Log;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.record.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.solser.bpi.document.Convenio;
import mx.solser.bpi.document.ReqBase;
import mx.solser.bpi.document.ResBase;
import mx.solser.bpi.document.ResConsulta;
import mx.solser.bpi.document.dto.PagoServiciosDTO;
import mx.solser.bpi.document.req.FactoryBeanReq;
import mx.solser.bpi.document.req.ReqPagoServicioDTO;
import mx.solser.bpi.document.res.ResPagoServicioDTO;
import mx.solser.bpi.persistence.IPagoConvenioServicios;
import mx.solser.bpi.util.Constantes;
//import mx.solser.bpi.persistence.mongo.UsuarioRepository;
import mx.solser.bpi.util.LeerProperties;
import mx.solser.bpi.util.UrlConstantes;


/**
 * @author Solser 
 *
 */
@RestController
public class UtilService {


	@Autowired
	private IPagoConvenioServicios pagoConvenioServiciosService;


	@GetMapping(value = UrlConstantes.CONSULTA_CAT)
	@ResponseBody
	public ResConsulta msConvenios() {
			System.out.println("Consulta convenios");
			ResConsulta resConsulta= new ResConsulta();
			resConsulta.setListConvenio(LeerProperties.getConvenios());
			resConsulta.setListServicio(LeerProperties.getServicios());
		
		return  resConsulta;
	}
	
	@PostMapping(value = UrlConstantes.PAGAR_SERVICIOS)
	@ResponseBody
	public ResConsulta msPagarService(@RequestBody Convenio reqConvenio ) {
			System.out.println("Pagar convenios");
			ResConsulta resConsulta= new ResConsulta();
			

//			usuarioDTO.getCuentasAhorro();
			List<T> reqCtasAgorroUsuario= new ArrayList<>();
//			ProductosProperties productosProperties = productosService.getProductosProperties();
//			Map<String, List<String>> mapProductos = productosProperties.getProductosMap();
			List<T> listProd= new ArrayList<>();
	
			

		
		return  resConsulta;
	}
	
	@PostMapping(value = UrlConstantes.CONSULTA_MONGO)
	@ResponseBody
	public ResBase msMongo(ReqBase req) {
			System.out.println("Consulta Mongo"+ req.getParam());
			ResBase resConsulta= new ResBase();
		
		return  resConsulta;
	}
	
	@PostMapping(value = UrlConstantes.MICRO_SERVICIO_PAGO_SERVICIO_SKY)
	public @ResponseBody PagoServiciosDTO pagosServiciosPagar (@RequestBody final PagoServiciosDTO pagoServCosmePago) {
		
		ReqPagoServicioDTO reqPagoServicioDTO;
		ResPagoServicioDTO resPagoServicioDTO;
		PagoServiciosDTO respPagoServ = new PagoServiciosDTO();
		String cadenaBandSesion="";
		String nomCia="";
		try {
			
			reqPagoServicioDTO = FactoryBeanReq.getReqPagoServicioDTO(
					pagoServCosmePago.getConvenio(),
					pagoServCosmePago.getCuenta(),
					pagoServCosmePago.getImporte(),
					pagoServCosmePago.getRefPago(), 
					pagoServCosmePago.getEtiTel(),
	//				sdf4.format(sdf3.parse(pagoServCosmePago.getFecOperacion().toString())), 
					pagoServCosmePago.getFecOperacion(),
					cadenaBandSesion, 
					pagoServCosmePago.getCatCompania(),
					pagoServCosmePago.getNumCliente(),
	//				usuarioDTO.getNumCliente(), 
					pagoServCosmePago.getCveBanco(), 
					pagoServCosmePago.getSePrograma(),
					pagoServCosmePago.getIdOperacion(), 
					pagoServCosmePago.getSecTransaccion(),
					pagoServCosmePago.getNumVerificador(), 
					pagoServCosmePago.getCatCompaniaComp(),  
					Integer.parseInt(pagoServCosmePago.getCveCompania()),
					pagoServCosmePago.getNumToken(),
	//				pagoServCosmePago.getNomCompania().toString(),
	//				Utilerias.remplazarAcentos(nomCia),
					nomCia,
					pagoServCosmePago.getAlias().toString(),
	//				sdf4.format(sdf3.parse(pagoServCosmePago.getFecAplicacion())));
					pagoServCosmePago.getFecAplicacion());
			
			//REALIZA EL PAGO DE SERVICIO
			resPagoServicioDTO = pagoConvenioServiciosService.pagosServicios(reqPagoServicioDTO);

			//HAY ERROR EN EL PAGO DE SERVICIO
			if (Constantes.COD_STATUS_ERROR.equals(resPagoServicioDTO.getpCodRetorno())) { 
				resPagoServicioDTO.setpCodRetorno(Constantes.COD_STATUS_ERROR);
			}
			else {
				resPagoServicioDTO.setpCodRetorno(Constantes.COD_ERROR_EXITO);
			}
		} catch (Exception e) {
			respPagoServ.setpMensaje("Error General");
			respPagoServ.setpCodRetorno(Constantes.COD_ERROR_00001);
			Log.error("Error al pagar servicio: " , e);
		}

		return respPagoServ;
	}
	
}
