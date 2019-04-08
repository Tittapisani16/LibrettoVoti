package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti;
	
	public Libretto () {
		this.voti= new ArrayList <Voto>();
	}
	
	public void add(Voto v) {
		voti.add(v);
	}
	
	public List <Voto> StampaVoti(int punti) {
		List <Voto> temp= new LinkedList <Voto>();
		for(Voto v: this.voti)
			if(v.getPunti()==punti)
				temp.add(v);
					
				return temp;
			}
	
	public Voto CercaEsame (String corso) {
		for (Voto v: this.voti) {
			if(v.getCorso().equals(corso))
				// non usare compareTo perchè non c'è un'ordinazione naturale!
				//ERRORE
				return v;
		}
	    return null;

}
}
