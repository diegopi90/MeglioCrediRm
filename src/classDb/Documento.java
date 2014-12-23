package classDb;

import java.io.Serializable;


public class Documento implements Serializable{
	
	private int codice;
	private String tipoDocumento;
	private String numeroDoc;
	private String rilascio;
	private String luogo;
	private String scadenza;
	private String codf;
	private Cliente cliente;

	

	public Documento() {}

	public Documento(int codice, String tipoDocumento, String numeroDoc,
			String rilascio, String luogo, String scadenza, Cliente cliente) {
		this.codice = codice;
		this.tipoDocumento = tipoDocumento;
		this.numeroDoc = numeroDoc;
		this.rilascio = rilascio;
		this.luogo = luogo;
		this.scadenza = scadenza;
		this.cliente = cliente;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public String getRilascio() {
		return rilascio;
	}

	public void setRilascio(String rilascio) {
		this.rilascio = rilascio;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public String getScadenza() {
		return scadenza;
	}

	public void setScadenza(String scadenza) {
		this.scadenza = scadenza;
	}
	

	public String getCodf() {
		return codf;
	}

	public void setCodf(String codf) {
		this.codf = codf;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



}
