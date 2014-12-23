package classDb;
import java.io.Serializable;


public class Residenza implements Serializable{

	private int codice;
	private String luogo;
	private String provincia;
	private String cap;
	private String indirizzo;
	private String domicilio;
	private String corrispondenza;
	private String codf;
	private Cliente cliente;

	
	public Residenza(){}
	
	public Residenza(int codice, String luogo, String provincia, String cap,
			String indirizzo, String domicilio, String corrispondenza,
			Cliente cliente) {

		this.codice = codice;
		this.luogo = luogo;
		this.provincia = provincia;
		this.cap = cap;
		this.indirizzo = indirizzo;
		this.domicilio = domicilio;
		this.corrispondenza = corrispondenza;
		this.cliente = cliente;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getLuogo() {
		return luogo;
	}
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getCorrispondenza() {
		return corrispondenza;
	}
	public void setCorrispondenza(String corrispondenza) {
		this.corrispondenza = corrispondenza;
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
