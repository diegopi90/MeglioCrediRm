package service;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import classDb.*;
import org.primefaces.context.RequestContext;



 
@ManagedBean(name = "meglioCrediService")
@ViewScoped


public class MeglioCrediService implements Serializable{
	
	private Cliente cliente = new Cliente();
	private Residenza residenza = new Residenza();
	private Pratica pratica = new Pratica();
	private Documento doc = new Documento();
	private Conto conto = new Conto();
	private Add add =new Add();

	
    public Cliente getCliente() {
        return cliente;
    }
 
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

	
	public Documento getDoc() {
		return doc;
	}

	public void setDoc(Documento doc) {
		this.doc = doc;
	}
	

	public Conto getConto() {
		return conto;
	}

	public void setConto(Conto conto) {
		this.conto = conto;
	}
	

	public Add getAdd() {
		return add;
	}

	public void setAdd(Add add) {
		this.add = add;
	}

	public void save() {
		

		add.addCliente(cliente.getCf(), cliente.getCognome(), cliente.getNome(), cliente.getDataNascita(), cliente.getLuogoNascita(), 
				cliente.getProvNascita(), cliente.getCapNascita(), cliente.getTelefono(), cliente.getEmail(), cliente.getStatoCivile(), 
				cliente.getBeni(), cliente.getOccupazione(), cliente.getDalOccupazione(), cliente.getEnte(), cliente.getCat(),cliente.getNote(),
				residenza.getLuogo(), residenza.getProvincia(), residenza.getCap(), residenza.getIndirizzo(), 
				residenza.getDomicilio(), residenza.getCorrispondenza(),
				doc.getTipoDocumento(), doc.getNumeroDoc(), doc.getRilascio(), doc.getLuogo(), doc.getScadenza(),
				conto.getBanca(), conto.getIban(), conto.getDataConto(), conto.getStipendio(),
				pratica.getNrsecci(), pratica.getNrctr(), pratica.getRata(), pratica.getDurata(), pratica.getTipo(), 
				pratica.getImportoErogato(), pratica.getSpese(), pratica.getTan(), pratica.getTaeg(), pratica.getTeg(), 
				pratica.getGaranzia(), pratica.getQuintoMax(), pratica.getEstinzione(), pratica.getRataEstinzione(), 
				pratica.getScadenza(), pratica.getStatoPratica(), pratica.getDatarinnovo());
		

        FacesMessage msg = new FacesMessage("Inserimento avvenuto con successo", "Benvenuto:" + cliente.getCognome());
        FacesContext.getCurrentInstance().addMessage(null, msg);

		
	}
	
    public void reset() {
        RequestContext.getCurrentInstance().reset("form:tabview");
    }
}
