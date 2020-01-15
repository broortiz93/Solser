package mx.solser.bpi.document.res;


public class FactoryBeanRes{
	
	public static ResPagoServicioDTO getResPagoServicioDTO() {
		return new ResPagoServicioDTO();
	}
	
	public static ResNumTransDTO getResNumTransDTO() {
		return new ResNumTransDTO();
	}
	
}