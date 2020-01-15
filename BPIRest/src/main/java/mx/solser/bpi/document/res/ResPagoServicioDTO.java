package mx.solser.bpi.document.res;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import mx.solser.bpi.util.Constantes;
import mx.solser.pv.documents.Base;

public class ResPagoServicioDTO extends Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1919364715360031104L;
	
	
	private String folio = "";
	private String operacionServicio = "";
	private String ctaDestino = "";
	private String numTransCargo = "";
	private String numTransAbono = "";
	private BigDecimal saldoCtaOrigen = Constantes.BIG_DECIMAL_CERO;
	private Date fechaActual;
	private Integer authStatus = Constantes.CERO;
	private Integer statusToken = Constantes.CERO;
	private int numOporToken = 0;
	
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getOperacionServicio() {
		return operacionServicio;
	}
	public void setOperacionServicio(String operacionServicio) {
		this.operacionServicio = operacionServicio;
	}
	public String getCtaDestino() {
		return ctaDestino;
	}
	public void setCtaDestino(String ctaDestino) {
		this.ctaDestino = ctaDestino;
	}
	public String getNumTransCargo() {
		return numTransCargo;
	}
	public void setNumTransCargo(String numTransCargo) {
		this.numTransCargo = numTransCargo;
	}
	public String getNumTransAbono() {
		return numTransAbono;
	}
	public void setNumTransAbono(String numTransAbono) {
		this.numTransAbono = numTransAbono;
	}
	public BigDecimal getSaldoCtaOrigen() {
		return saldoCtaOrigen;
	}
	public void setSaldoCtaOrigen(BigDecimal saldoCtaOrigen) {
		this.saldoCtaOrigen = saldoCtaOrigen;
	}
	public Date getFechaActual() {
		return fechaActual;
	}
	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}
	public Integer getAuthStatus() {
		return authStatus;
	}
	public void setAuthStatus(Integer authStatus) {
		this.authStatus = authStatus;
	}
	public Integer getStatusToken() {
		return statusToken;
	}
	public void setStatusToken(Integer statusToken) {
		this.statusToken = statusToken;
	}
	public int getNumOporToken() {
		return numOporToken;
	}
	public void setNumOporToken(int numOporToken) {
		this.numOporToken = numOporToken;
	}
}