package mx.solser.bpi.document.req;

import java.io.Serializable;

public class ReqNumTransDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -98777013804761385L;

	private String idOper = "";

	/**
	 * 
	 */
	public ReqNumTransDTO(final String idOper) {
		this.idOper = idOper;
	}
	
	public String getIdOper() {
		return idOper;
	}

	public void setIdOper(String idOper) {
		this.idOper = idOper;
	}
	
	
}
