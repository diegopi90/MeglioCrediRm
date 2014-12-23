package classDb;
import calc.*;

import java.io.Serializable;
import java.text.ParseException;

public class Cliente implements Serializable{
	
	private AgeCalculator age = new AgeCalculator();
	private String cf;
	private String cognome;
	private String nome;
	private String dataNascita=age.getDate();
	private String luogoNascita;
	private String provNascita;
	private String capNascita;
	private String telefono;
	private String email;
	private String statoCivile;
	private String beni;
	private String occupazione;
	private String dalOccupazione;
	private String ente;
	private String cat;
	private String note;
	private int eta;
	private int anniassunzione=0;
	private Conto conto;
	private Documento documento;
	private Residenza residenza;
	private Pratica pratica;



	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getProvNascita() {
		return provNascita;
	}

	public void setProvNascita(String provNascita) {
		this.provNascita = provNascita;
	}

	public String getCapNascita() {
		return capNascita;
	}

	public void setCapNascita(String capNascita) {
		this.capNascita = capNascita;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatoCivile() {
		return statoCivile;
	}

	public void setStatoCivile(String statoCivile) {
		this.statoCivile = statoCivile;
	}

	public String getBeni() {
		return beni;
	}

	public void setBeni(String beni) {
		this.beni = beni;
	}

	public String getOccupazione() {
		return occupazione;
	}

	public void setOccupazione(String occupazione) {
		this.occupazione = occupazione;
	}

	public String getDalOccupazione() {

		return dalOccupazione;
	}

	public void setDalOccupazione(String dalOccupazione) {

		this.dalOccupazione = dalOccupazione;
	}

	public String getEnte() {
		return ente;
	}

	public void setEnte(String ente) {
		this.ente = ente;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Conto getConto() {
		return conto;
	}

	public void setConto(Conto conto) {
		this.conto = conto;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Residenza getResidenza() {
		return residenza;
	}

	public void setResidenza(Residenza residenza) {
		this.residenza = residenza;
	}

	public Pratica getPratica() {
		return pratica;
	}

	public void setPratica(Pratica pratica) {
		this.pratica = pratica;
	}	
	public int getEta() throws ParseException{
		
		eta=age.getEta(getDataNascita());
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}

	
	
	public String getDatains() {
		return age.getDate();
	}
	
	public int getAnniAssunzione() throws ParseException{
		
		return age.getEta(getDalOccupazione());
	}


	public void setAnniAssunzione(int anniassunzione) {
		this.anniassunzione = anniassunzione;
	}
	
	

}
