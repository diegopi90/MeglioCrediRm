package service;
import java.io.Serializable;

import org.hibernate.Session;

import classDb.*;


public class Add implements Serializable{


	public Add() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void addCliente(String cf, String cognome, String nome, String dataNascita,
			String luogoNascita, String provNascita, String capNascita,
			String telefono, String email, String statoCivile, String beni,
			String occupazione, String dalOccupazione, String ente, String cat,
			String note, String luogo, String provincia, String cap,
			String indirizzo, String domicilio, String corrispondenza, 
			String tipoDocumento, String numero,
			String datarilascio, String luogorilascio, String scadenza, 
			String banca, String iban, String dataConto,
			String stipendio, String nrsecci, String nrctr, double rata,
			int durata, String tipo, double importoErogato, double spese,
			double tan, double taeg, double teg, String garanzia,
			double quintoMax, String estinzione, double rataEstinzione,
			String scadenzaest, String statoPratica, String datarinnovo){

		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Cliente cliente = new Cliente();
		
		cliente.setCf(cf);
		cliente.setCognome(cognome);
		cliente.setNome(nome);		
		cliente.setDataNascita(dataNascita);
		cliente.setLuogoNascita(luogoNascita);
		cliente.setProvNascita(provNascita);
		cliente.setCapNascita(capNascita);
		cliente.setTelefono(telefono);
		cliente.setEmail(email);
		cliente.setStatoCivile(statoCivile);
		cliente.setBeni(beni);
		cliente.setOccupazione(occupazione);
		cliente.setDalOccupazione(dalOccupazione);
		cliente.setEnte(ente);
		cliente.setCat(cat);		
		cliente.setNote(note);
		
		Residenza residenza =new Residenza();
		residenza.setLuogo(luogo);
		residenza.setProvincia(provincia);
		residenza.setCap(cap);
		residenza.setIndirizzo(indirizzo);
		residenza.setDomicilio(domicilio);
		residenza.setCorrispondenza(corrispondenza);
		
		cliente.setResidenza(residenza);
		residenza.setCliente(cliente);
		
		
		Documento doc = new Documento();
		doc.setTipoDocumento(tipoDocumento);
		doc.setNumeroDoc(numero);
		doc.setRilascio(datarilascio);
		doc.setLuogo(luogorilascio);
		doc.setScadenza(scadenza);
		
		cliente.setDocumento(doc);
		doc.setCliente(cliente);
		
		Conto conto = new Conto();
		conto.setBanca(banca);
		conto.setIban(iban);
		conto.setDataConto(dataConto);
		conto.setStipendio(stipendio);
		
		cliente.setConto(conto);
		conto.setCliente(cliente);
		
		Pratica pratica =new Pratica();
		pratica.setNrsecci(nrsecci);
		pratica.setNrctr(nrctr);
		pratica.setRata(rata);
		pratica.setDurata(durata);
		pratica.setTipo(tipo);
		pratica.setImportoErogato(importoErogato);
		pratica.setSpese(spese);
		pratica.setTan(tan);
		pratica.setTaeg(taeg);
		pratica.setTeg(teg);
		pratica.setGaranzia(garanzia);
		pratica.setQuintoMax(quintoMax);
		pratica.setEstinzione(estinzione);
		pratica.setRataEstinzione(rataEstinzione);
		pratica.setScadenza(scadenzaest);
		pratica.setStatoPratica(statoPratica);
		pratica.setDatarinnovo(datarinnovo);
		
		cliente.setPratica(pratica);
		pratica.setCliente(cliente);
		
		session.save(cliente);
		session.save(residenza);
		session.save(doc);
		session.save(conto);
		session.save(pratica);
		session.getTransaction().commit();
        session.close(); 

		
	}
	
	public Double nettoMensile(){
		
		Pratica pratica = new Pratica();
		Double nettoMensile = pratica.getQuintoMax()*5;
		
		return nettoMensile;
	}
	
	
}
