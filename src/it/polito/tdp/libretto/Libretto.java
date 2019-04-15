package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti;
	
	public Libretto () {
		this.voti= new ArrayList <Voto>();
	}
	
	public boolean add(Voto v) {
		if(!this.EsisteVoto(v)&&!this.votoInConflitto(v)) {
			voti.add(v);
			return true;}
		else 
			return false;
	}
	
	public List <Voto> StampaVoti(int punti) {
		List <Voto> temp= new LinkedList <Voto>();
		for(Voto v: this.voti)
			if(v.getPunti()==punti)
				temp.add(v);
					
				return temp;
			}
	// c'è già una funzione di libreria che fa tutto questo, sotto implemento il metodo
	public Voto CercaEsame (String corso) {
		for (Voto v: this.voti) {
			if(v.getCorso().equals(corso))
				// non usare compareTo perchè non c'è un'ordinazione naturale!
				//ERRORE
				return v;
		}
	    return null;
	   
	}
	
	public Voto cercaEsame(String corso) {
		//alla funzione indexOf dobbiamo passare lo stesso oggetto che forma la lista in cui
		//lo stiamo cercando quindi creo un voto fittizioo
		
		Voto temp= new Voto (0, corso, null);
		int pos= voti.indexOf(temp);
		if(pos ==-1)
			return null;
		else
			return this.voti.get(pos);
	}
	
	
	// Per far si che non ci siano esami ripetuti, la cosa piu' giusta da fare
	// e' semplicimente vedere se esiste già il nome del corso, perchè tutti gli altri
	// campi possono essere uguali (voti, date)
	
	public boolean EsisteVoto(Voto v) {
		int pos= voti.indexOf(v);
		if(pos==-1)
			return false;
		else 
			if (v.getPunti()==voti.get(pos).getPunti())
				return true;
			else
				return false;
		
	}
//  lo stesso metodo è implementato sopra con indexOf
//	Voto trovato= CercaEsame(v.getCorso());
//		if(trovato==null)
//			return false;
//		
//		if(v.getPunti()==trovato.getPunti())
//			return true;
//		
//		else
//			return false;
//		
	public boolean votoInConflitto(Voto v) {
		int pos= voti.indexOf(v);
		if(pos==-1)
			return false;
		else 
			if (v.getPunti()==voti.get(pos).getPunti())
				return false;
			else
				return true;
		
	}

	
	
}
