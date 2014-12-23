package classDb;

import java.io.Serializable;


public class Conto implements Serializable{

	private int codice;
	private String banca="Banca";	
	private String iban="Iban";
	private String dataConto;
	private String stipendio;
	private String codf;
	private Cliente cliente;



	
	public Conto() {}

	public Conto(int codice, String banca, String iban, String dataConto,
			String stipendio, Cliente cliente) {
		this.codice = codice;
		this.banca = banca;
		this.iban = iban;
		this.dataConto = dataConto;
		this.stipendio = stipendio;
		this.cliente = cliente;

	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getBanca() {
		return banca;
	}

	public void setBanca(String banca) {
		this.banca = banca;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getDataConto() {
		return dataConto;
	}

	public void setDataConto(String dataConto) {
		this.dataConto = dataConto;
	}

	public String getStipendio() {
		return stipendio;
	}

	public void setStipendio(String stipendio) {
		this.stipendio = stipendio;
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
