package mx.solser.bpi.document.dto;

import java.io.Serializable;

public class ConvenioServicioDTO implements Serializable, Comparable<ConvenioServicioDTO> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3000793160127572470L;
	private String idCategoria = "";
	private String idConvenio = "";
	
	public ConvenioServicioDTO(String idCategoria, String idConvenio) {
		super();
		this.idCategoria = idCategoria;
		this.idConvenio = idConvenio;
	}
	public ConvenioServicioDTO() {
		super();
	}
	/**
	 * @return the idCategoria
	 */
	public String getIdCategoria() {
		return idCategoria;
	}
	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	/**
	 * @return the idConvenio
	 */
	public String getIdConvenio() {
		return idConvenio;
	}
	/**
	 * @param idConvenio the idConvenio to set
	 */
	public void setIdConvenio(String idConvenio) {
		this.idConvenio = idConvenio;
	}

	@Override
	public int compareTo(ConvenioServicioDTO o) {
		int resp = 0;
		if(o!=null){
			resp = this.idConvenio.compareTo(o.idConvenio);
			
		}
		return resp;
	}
	
	
}
