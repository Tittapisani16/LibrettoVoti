package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libr= new Libretto();
		
		libr.add(new Voto(30, "Fisica I",LocalDate.of(2018, 3, 15)));
		libr.add(new Voto(21, "Analisi I",LocalDate.of(2019, 1, 17)));
		libr.add(new Voto(22, "Fisica II",LocalDate.of(2017, 1, 21)));
		libr.add(new Voto(30, "Analisi II",LocalDate.of(2018, 7, 18)));
		libr.add(new Voto(17, "Geometria I",LocalDate.of(2017, 1, 25)));
		libr.add(new Voto(20, "Meccanica I",LocalDate.of(2017, 9, 15)));
		libr.add(new Voto(20, "Programmazione I",LocalDate.of(2017, 1, 5)));
		libr.add(new Voto(19, "Programmazione II",LocalDate.of(2017, 1, 5)));
		libr.add(new Voto(30, "Logistica",LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(30, "Economia",LocalDate.of(2018, 1, 15)));
		
		
	
	
	List <Voto> trenta= libr.StampaVoti(30);
	System.out.println(trenta);
	
	Voto result= libr.CercaEsame("Logistica ");
	System.out.println(result);
	
	
	}
}
