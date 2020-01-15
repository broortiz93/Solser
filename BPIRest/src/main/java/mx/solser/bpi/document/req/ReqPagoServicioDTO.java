package mx.solser.bpi.document.req;

import java.io.Serializable;

import mx.solser.pv.documents.Base;

public class ReqPagoServicioDTO extends Base implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6491010993863211751L;
	
	private String convenio = "";
	private String cuenta = "";
	private String monto = "";
	private String refPago = "";
	private String numTel = "";
	private String fecOperacion = "";
	private String cadenaBand = "";
	private String tipoServicio = "";
	private String numCliente = "";
	private String cveBanco = "";
	private String sePrograma = "";
	private String idOperacion = "";
	private String secTransaccion = "";
	private String numVerificador = "";
	private String cargo = "";
	private String cargoSuc = "";
	private String convenioOp = "";
	private String cuentaServicio = "";
	private String operacionServicio = "";
	private String tipoOp = "";
	private String categoria = "";
	private String catCompania = "";
	private int  iCveCompania = 0;
	private String cveDinamica = "";
	private String nomCompania = "";
	private String alias = "";
	private String fecAplicacion="";
	
	public ReqPagoServicioDTO(final String convenio, final String cuenta,
			final String monto, final String refPago, final String numTel,
			final String fecOperacion, final String cadenaBand,
			final String tipoServicio, final String numCliente, 
			final String cveBanco, final String sePrograma,
			final String idOperacion, final String secTransaccion,
			final String numVerificador, final String catCompania, 
			final int iCveCompania, final String cveDinamica,
			final String nomCompania, final String alias, final String fecAplicacion) {
		super();
		this.convenio = convenio;
		this.cuenta = cuenta;
		this.monto = monto;
		this.refPago = refPago;
		this.numTel = numTel;
		this.fecOperacion = fecOperacion;
		this.cadenaBand = cadenaBand;
		this.tipoServicio = tipoServicio;
		this.numCliente = numCliente;
		this.cveBanco = cveBanco;
		this.sePrograma = sePrograma;
		this.idOperacion = idOperacion;
		this.secTransaccion = secTransaccion;
		this.numVerificador = numVerificador;
		this.catCompania = catCompania;
		
		this.iCveCompania = iCveCompania;
		this.cveDinamica = cveDinamica;
		
		this.nomCompania = nomCompania;
		this.alias = alias;
		
		this.fecAplicacion = fecAplicacion;
	}
	
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public String getRefPago() {
		return refPago;
	}
	public void setRefPago(String refPago) {
		this.refPago = refPago;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getFecOperacion() {
		return fecOperacion;
	}
	public void setFecOperacion(String fecOperacion) {
		this.fecOperacion = fecOperacion;
	}
	public String getCadenaBand() {
		return cadenaBand;
	}
	public void setCadenaBand(String cadenaBand) {
		this.cadenaBand = cadenaBand;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public String getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}
	public String getCveBanco() {
		return cveBanco;
	}
	public void setCveBanco(String cveBanco) {
		this.cveBanco = cveBanco;
	}
	public String getSePrograma() {
		return sePrograma;
	}
	public void setSePrograma(String sePrograma) {
		this.sePrograma = sePrograma;
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
	public String getNumVerificador() {
		return numVerificador;
	}
	public void setNumVerificador(String numVerificador) {
		this.numVerificador = numVerificador;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCargoSuc() {
		return cargoSuc;
	}
	public void setCargoSuc(String cargoSuc) {
		this.cargoSuc = cargoSuc;
	}
	public String getConvenioOp() {
		return convenioOp;
	}
	public void setConvenioOp(String convenioOp) {
		this.convenioOp = convenioOp;
	}
	public String getCuentaServicio() {
		return cuentaServicio;
	}
	public void setCuentaServicio(String cuentaServicio) {
		this.cuentaServicio = cuentaServicio;
	}
	public String getOperacionServicio() {
		return operacionServicio;
	}
	public void setOperacionServicio(String operacionServicio) {
		this.operacionServicio = operacionServicio;
	}
	public String getTipoOp() {
		return tipoOp;
	}
	public void setTipoOp(String tipoOp) {
		this.tipoOp = tipoOp;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCatCompania() {
		return catCompania;
	}
	public void setCatCompania(String catCompania) {
		this.catCompania = catCompania;
	}
	public int getiCveCompania() {
		return iCveCompania;
	}
	public void setiCveCompania(int iCveCompania) {
		this.iCveCompania = iCveCompania;
	}
	public String getCveDinamica() {
		return cveDinamica;
	}
	public void setCveDinamica(String cveDinamica) {
		this.cveDinamica = cveDinamica;
	}
	public String getNomCompania() {
		return nomCompania;
	}
	public void setNomCompania(String nomCompania) {
		this.nomCompania = nomCompania;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getFecAplicacion() {
		return fecAplicacion;
	}
	public void setFecAplicacion(String fecAplicacion) {
		this.fecAplicacion = fecAplicacion;
	}
}