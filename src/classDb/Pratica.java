package classDb;
import java.io.Serializable;
import java.text.ParseException;

import calc.AgeCalculator;


public class Pratica implements Serializable{

	private AgeCalculator age = new AgeCalculator();

	private int codice;
	private String nrsecci;
	private String nrctr;
	private double rata;
	private int durata;
	private String tipo;
	private double importoErogato;
	private double spese;
	private double tan;
	private double taeg;
	private double teg;
	private String garanzia;
	private double quintoMax;
	private String estinzione;
	private double rataEstinzione;
	private String scadenza = age.getDate();
	private String statoPratica;
	private String datarinnovo;
	private String codf;
	private Cliente cliente;
	private int mesiscadenza =0;

	
	
	public Pratica() {}
	
	public Pratica(int codice, String nrsecci, String nrctr, double rata,
			int durata, String tipo, double importoErogato, double spese,
			double tan, double taeg, double teg, String garanzia,
			double quintoMax, String estinzione, double rataEstinzione,
			String scadenza, String statoPratica, Cliente cliente) {

		this.codice = codice;
		this.nrsecci = nrsecci;
		this.nrctr = nrctr;
		this.rata = rata;
		this.durata = durata;
		this.tipo = tipo;
		this.importoErogato = importoErogato;
		this.spese = spese;
		this.tan = tan;
		this.taeg = taeg;
		this.teg = teg;
		this.garanzia = garanzia;
		this.quintoMax = quintoMax;
		this.estinzione = estinzione;
		this.rataEstinzione = rataEstinzione;
		this.scadenza = scadenza;
		this.statoPratica = statoPratica;
		this.cliente = cliente;
	}
	
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getNrsecci() {
		return nrsecci;
	}
	public void setNrsecci(String nrsecci) {
		this.nrsecci = nrsecci;
	}
	public String getNrctr() {
		return nrctr;
	}
	public void setNrctr(String nrctr) {
		this.nrctr = nrctr;
	}
	public double getRata() {
		return rata;
	}
	public void setRata(double rata) {
		this.rata = rata;
	}
	public int getDurata() {
		return durata;
	}	
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getImportoErogato() {
		return importoErogato;
	}
	public void setImportoErogato(double importoErogato) {
		this.importoErogato = importoErogato;
	}
	public double getSpese() {
		return spese;
	}
	public void setSpese(double spese) {
		this.spese = spese;
	}
	public double getTan() {
		return tan;
	}
	public void setTan(double tan) {
		this.tan = tan;
	}
	public double getTaeg() {
		return taeg;
	}
	public void setTaeg(double taeg) {
		this.taeg = taeg;
	}
	public double getTeg() {
		return teg;
	}
	public void setTeg(double teg) {
		this.teg = teg;
	}
	public String getGaranzia() {
		return garanzia;
	}
	public void setGaranzia(String garanzia) {
		this.garanzia = garanzia;
	}
	public double getQuintoMax() {
		return quintoMax;
	}
	public void setQuintoMax(double quintoMax) {
		this.quintoMax = quintoMax;
	}
	public String getEstinzione() {
		return estinzione;
	}
	public void setEstinzione(String estinzione) {
		this.estinzione = estinzione;
	}
	public double getRataEstinzione() {
		return rataEstinzione;
	}
	public void setRataEstinzione(double rataEstinzione) {
		this.rataEstinzione = rataEstinzione;
	}
	public String getScadenza() {
		return scadenza;
	}
	public void setScadenza(String scadenza) {
		this.scadenza = scadenza;
	}

	public String getStatoPratica() {
		return statoPratica;
	}
	
	public void setStatoPratica(String statoPratica) {
		this.statoPratica = statoPratica;
	}
	

    public String getDatarinnovo(){
    	datarinnovo=age.getRinnovo(getDurata());
    	return datarinnovo;
    }
	
	public void setDatarinnovo(String datarinnovo) {
		this.datarinnovo = datarinnovo;
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

	public double getNettomensile() {
		return getQuintoMax()*5;
	}

	public double getMontante() {
		
		return getRata()*getDurata();
	}

	public double getInteressi() {
		
		return arrotondamento((getMontante()-getSpese())-getImportoErogato());
	}
	
	public static double arrotondamento(double x){
		x = Math.floor(x*100);
		x = x/100;
		return x;
	}
	
	public int getMesiscadenza() throws ParseException {
		mesiscadenza = (age.getEta(getScadenza())*12)-age.getMesi(getScadenza());
		return mesiscadenza;
	}

	
	public String getDatacar(){
		if(getRata()!=0.0){
		return age.getDate();
		}
		return "";
	}
	
	public double getConteggioestinzione() throws ParseException{
		return ((getMesiscadenza()*-1)*getRataEstinzione())-((((getMesiscadenza()*-1)*getRataEstinzione())*10)/100);
	}
	
}
