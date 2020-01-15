package mx.solser.bpi.document.dto;
import java.io.Serializable;

public class PagoServicioDTO implements Serializable, Comparable<PagoServicioDTO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8580299065883332601L;
	private String convenio = "";	
	private String idPagoServicio = "";
	private String nombreComercial = "";
	private String razonSocial = "";
	private String pathImagen = "";	
	private String pathImagenOver = "";
	private String url = "";
	private String parametros = "";
	
	
	

	public PagoServicioDTO(String convenio, String idPagoServicio,
			String nombreComercial, String razonSocial, String pathImagen,
			String pathImagenOver) {
		super();
		this.convenio = convenio;
		this.idPagoServicio = idPagoServicio;
		this.nombreComercial = nombreComercial;
		this.razonSocial = razonSocial;
		this.pathImagen = pathImagen;
		this.pathImagenOver = pathImagenOver;
	}

	public PagoServicioDTO() {
		super();
	}

	/**
	 * @return the idPagoServicio
	 */
	public String getIdPagoServicio() {
		return idPagoServicio;
	}

	/**
	 * @param idPagoServicio the idPagoServicio to set
	 */
	public void setIdPagoServicio(String idPagoServicio) {
		this.idPagoServicio = idPagoServicio;
	}

	/**
	 * @return the nombreComercial
	 */
	public String getNombreComercial() {
		return nombreComercial;
	}

	/**
	 * @param nombreComercial the nombreComercial to set
	 */
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the convenio
	 */
	public String getConvenio() {
		return convenio;
	}

	/**
	 * @param convenio the convenio to set
	 */
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	/**
	 * @return the pathImagen
	 */
	public String getPathImagen() {
		return pathImagen;
	}

	/**
	 * @param pathImagen the pathImagen to set
	 */
	public void setPathImagen(String pathImagen) {
		this.pathImagen = pathImagen;
	}

	/**
	 * @return the pathImagenOver
	 */
	public String getPathImagenOver() {
		return pathImagenOver;
	}

	/**
	 * @param pathImagenOver the pathImagenOver to set
	 */
	public void setPathImagenOver(String pathImagenOver) {
		this.pathImagenOver = pathImagenOver;
	}
	
	

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the parametros
	 */
	public String getParametros() {
		return parametros;
	}

	/**
	 * @param parametros the parametros to set
	 */
	public void setParametros(String parametros) {
		this.parametros = parametros;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String getInformacion() {
		StringBuilder res = new StringBuilder();
		
		res.append(convenio);
		res.append("|");
		res.append(pathImagen);
		res.append("|");
		res.append(pathImagenOver);
		res.append("|");
		res.append(idPagoServicio);
		res.append("|");
		res.append(nombreComercial);
		res.append("|");
		res.append(razonSocial);
		res.append("|");
		res.append(url);
		res.append("|");
		res.append(parametros);
		
		return res.toString();
	}

	@Override
	public int compareTo(PagoServicioDTO o) {
		int resp = 0;
		if(o!=null){
			resp = this.idPagoServicio.compareTo(o.idPagoServicio);
			if(resp==0){
				resp = this.nombreComercial.compareTo(o.nombreComercial);
			}
		}
		return resp;
	}
	
	
}
