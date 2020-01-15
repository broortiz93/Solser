package mx.solser.bpi.document.res;

import java.io.Serializable;
import mx.solser.pv.documents.Base;

public class ResNumTransDTO extends Base implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1173386127146934542L;

	private String numTransAbono = "";
	private String numTransCargo = "";
	
	/**
	 * 
	 */
	public ResNumTransDTO() {
		super();
	}
	
	
	
	public String getNumTransAbono() {
		return numTransAbono;
	}
	public void setNumTransAbono(String numTransAbono) {
		this.numTransAbono = numTransAbono;
	}
	public String getNumTransCargo() {
		return numTransCargo;
	}
	public void setNumTransCargo(String numTransCargo) {
		this.numTransCargo = numTransCargo;
	}
	
	
	
}
