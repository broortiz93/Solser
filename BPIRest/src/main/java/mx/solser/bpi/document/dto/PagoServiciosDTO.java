package mx.solser.bpi.document.dto;

import java.io.Serializable;
import java.util.List;

import mx.solser.pv.documents.Base;

public class PagoServiciosDTO extends Base implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8867706291367837711L;
	
	private String cuenta;
	private String pagoProg;
	private String enCuenta;
	private String tipoCta;
	private List<ConvenioServicioDTO> listaCategoriaServicios;
	private List<PagoServicioDTO> listaPagoServicios;
	private String cveCompania;
	private String catCompaniaComp;
	private String nomCompania;
	private String sePrograma;
	private String mensaje;
	private String tipo2;
	private String cveBanco;
	private String convenio;
	private String idOperacion;
	private String secTransaccion;
	private String selCtaCargoPago;
	private String catCompania;
	private String existRefAvon;
	private String isInhabil;
//	private List<ReferenciasDTO> colRef;
	private String montoMaximo;
	private String alias;
//	private List<EfectivaDTO> ctasAho;
	private String msgCtaOrigenEstatus6;
	private String msgCtaOrigenEstatus7;
	private String fecOperacion;
	private String fecAplicacion;
	private String detCuenta;
	private String sdoCta;
	private String cveCia;
	private String etiTel;
	private String importe;
	private String refPago;
	private String numVerificador;
	private String indOrigen;
	private String ctaOrigen; 
	private String etiNumCtaOrigen;
	private String tipoProg;
	private String numToken;
	private String idOper;
//	private ReSincronizaTokenDTO recincronizaTokenForm;
	private String saldoDisponible;
	private String numRastreo;
	private String horaEnvio;
	private String numCtaOrigen;
	private Boolean tel;
	private Boolean tv;
	private String idReferencia;
	private String correoUsuario;
//	private List<CreditoDTO> listaCuentasCredito;
	private String existeRef;
	private String numCliente;
	
	public String getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getPagoProg() {
		return pagoProg;
	}
	public void setPagoProg(String pagoProg) {
		this.pagoProg = pagoProg;
	}
	public String getEnCuenta() {
		return enCuenta;
	}
	public void setEnCuenta(String enCuenta) {
		this.enCuenta = enCuenta;
	}
	public String getTipoCta() {
		return tipoCta;
	}
	public void setTipoCta(String tipoCta) {
		this.tipoCta = tipoCta;
	}
	public List<ConvenioServicioDTO> getListaCategoriaServicios() {
		return listaCategoriaServicios;
	}
	public void setListaCategoriaServicios(List<ConvenioServicioDTO> listaCategoriaServicios) {
		this.listaCategoriaServicios = listaCategoriaServicios;
	}
	public List<PagoServicioDTO> getListaPagoServicios() {
		return listaPagoServicios;
	}
	public void setListaPagoServicios(List<PagoServicioDTO> listaPagoServicios) {
		this.listaPagoServicios = listaPagoServicios;
	}
	public String getCveCompania() {
		return cveCompania;
	}
	public void setCveCompania(String cveCompania) {
		this.cveCompania = cveCompania;
	}
	public String getCatCompaniaComp() {
		return catCompaniaComp;
	}
	public void setCatCompaniaComp(String catCompaniaComp) {
		this.catCompaniaComp = catCompaniaComp;
	}
	public String getNomCompania() {
		return nomCompania;
	}
	public void setNomCompania(String nomCompania) {
		this.nomCompania = nomCompania;
	}
	public String getSePrograma() {
		return sePrograma;
	}
	public void setSePrograma(String sePrograma) {
		this.sePrograma = sePrograma;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getTipo2() {
		return tipo2;
	}
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	public String getCveBanco() {
		return cveBanco;
	}
	public void setCveBanco(String cveBanco) {
		this.cveBanco = cveBanco;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
	public String getSecTransaccion() {
		return secTransaccion;
	}
	public void setSecTransaccion(String secTransaccion) {
		this.secTransaccion = secTransaccion;
	}
	public String getSelCtaCargoPago() {
		return selCtaCargoPago;
	}
	public void setSelCtaCargoPago(String selCtaCargoPago) {
		this.selCtaCargoPago = selCtaCargoPago;
	}
	public String getCatCompania() {
		return catCompania;
	}
	public void setCatCompania(String catCompania) {
		this.catCompania = catCompania;
	}
	public String getExistRefAvon() {
		return existRefAvon;
	}
	public void setExistRefAvon(String existRefAvon) {
		this.existRefAvon = existRefAvon;
	}
	public String getIsInhabil() {
		return isInhabil;
	}
	public void setIsInhabil(String isInhabil) {
		this.isInhabil = isInhabil;
	}
	public String getMontoMaximo() {
		return montoMaximo;
	}
	public void setMontoMaximo(String montoMaximo) {
		this.montoMaximo = montoMaximo;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getMsgCtaOrigenEstatus6() {
		return msgCtaOrigenEstatus6;
	}
	public void setMsgCtaOrigenEstatus6(String msgCtaOrigenEstatus6) {
		this.msgCtaOrigenEstatus6 = msgCtaOrigenEstatus6;
	}
	public String getMsgCtaOrigenEstatus7() {
		return msgCtaOrigenEstatus7;
	}
	public void setMsgCtaOrigenEstatus7(String msgCtaOrigenEstatus7) {
		this.msgCtaOrigenEstatus7 = msgCtaOrigenEstatus7;
	}
	public String getFecOperacion() {
		return fecOperacion;
	}
	public void setFecOperacion(String fecOperacion) {
		this.fecOperacion = fecOperacion;
	}
	public String getFecAplicacion() {
		return fecAplicacion;
	}
	public void setFecAplicacion(String fecAplicacion) {
		this.fecAplicacion = fecAplicacion;
	}
	public String getDetCuenta() {
		return detCuenta;
	}
	public void setDetCuenta(String detCuenta) {
		this.detCuenta = detCuenta;
	}
	public String getSdoCta() {
		return sdoCta;
	}
	public void setSdoCta(String sdoCta) {
		this.sdoCta = sdoCta;
	}
	public String getCveCia() {
		return cveCia;
	}
	public void setCveCia(String cveCia) {
		this.cveCia = cveCia;
	}
	public String getEtiTel() {
		return etiTel;
	}
	public void setEtiTel(String etiTel) {
		this.etiTel = etiTel;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public String getRefPago() {
		return refPago;
	}
	public void setRefPago(String refPago) {
		this.refPago = refPago;
	}
	public String getNumVerificador() {
		return numVerificador;
	}
	public void setNumVerificador(String numVerificador) {
		this.numVerificador = numVerificador;
	}
	public String getIndOrigen() {
		return indOrigen;
	}
	public void setIndOrigen(String indOrigen) {
		this.indOrigen = indOrigen;
	}
	public String getCtaOrigen() {
		return ctaOrigen;
	}
	public void setCtaOrigen(String ctaOrigen) {
		this.ctaOrigen = ctaOrigen;
	}
	public String getEtiNumCtaOrigen() {
		return etiNumCtaOrigen;
	}
	public void setEtiNumCtaOrigen(String etiNumCtaOrigen) {
		this.etiNumCtaOrigen = etiNumCtaOrigen;
	}
	public String getTipoProg() {
		return tipoProg;
	}
	public void setTipoProg(String tipoProg) {
		this.tipoProg = tipoProg;
	}
	public String getNumToken() {
		return numToken;
	}
	public void setNumToken(String numToken) {
		this.numToken = numToken;
	}
	public String getIdOper() {
		return idOper;
	}
	public void setIdOper(String idOper) {
		this.idOper = idOper;
	}
	public String getSaldoDisponible() {
		return saldoDisponible;
	}
	public void setSaldoDisponible(String saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	public String getNumRastreo() {
		return numRastreo;
	}
	public void setNumRastreo(String numRastreo) {
		this.numRastreo = numRastreo;
	}
	public String getHoraEnvio() {
		return horaEnvio;
	}
	public void setHoraEnvio(String horaEnvio) {
		this.horaEnvio = horaEnvio;
	}
	public String getNumCtaOrigen() {
		return numCtaOrigen;
	}
	public void setNumCtaOrigen(String numCtaOrigen) {
		this.numCtaOrigen = numCtaOrigen;
	}
	public Boolean getTel() {
		return tel;
	}
	public void setTel(Boolean tel) {
		this.tel = tel;
	}
	public Boolean getTv() {
		return tv;
	}
	public void setTv(Boolean tv) {
		this.tv = tv;
	}
	public String getIdReferencia() {
		return idReferencia;
	}
	public void setIdReferencia(String idReferencia) {
		this.idReferencia = idReferencia;
	}
	public String getCorreoUsuario() {
		return correoUsuario;
	}
	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}
	public String getExisteRef() {
		return existeRef;
	}
	public void setExisteRef(String existeRef) {
		this.existeRef = existeRef;
	}
	
	
}