package mx.solser.pv.documents;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Transient;


public class Base implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2640704624221705467L;

	@Transient
	private String pCodRetorno;
	@Transient
	private String pMensaje;
	
	protected Date fechaCreacion;
	protected Date fechaActualiza;
	
	@Transient
	protected String creacion;
	@Transient
	protected String actualizacion;
	
	public Base() {
		super();
	}
	
	public Base(String pCodRetorno, String pMensaje) {
		super();
		this.pCodRetorno = pCodRetorno;
		this.pMensaje = pMensaje;
	}
	
	private long pTotalItems;


	public long getpTotalItems() {
		return pTotalItems;
	}

	public void setpTotalItems(long pTotalItems) {
		this.pTotalItems = pTotalItems;
	}

	public String getpCodRetorno() {
		return pCodRetorno;
	}

	public void setpCodRetorno(String pCodRetorno) {
		this.pCodRetorno = pCodRetorno;
	}

	public String getpMensaje() {
		return pMensaje;
	}

	public void setpMensaje(String pMensaje) {
		this.pMensaje = pMensaje;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaActualiza() {
		return fechaActualiza;
	}

	public void setFechaActualiza(Date fechaActualiza) {
		this.fechaActualiza = fechaActualiza;
	}

	public String getCreacion() {
		return creacion;
	}

	public void setCreacion(String creacion) {
		this.creacion = creacion;
	}
	
	public String getActualizacion() {
		return actualizacion;
	}

	public void setActualizacion(String actualizacion) {
		this.actualizacion = actualizacion;
	}
}
