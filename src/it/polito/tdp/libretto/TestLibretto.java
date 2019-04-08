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
		libr.add(new Voto(18, "Geometria I",LocalDate.of(2017, 1, 25)));
		libr.add(new Voto(20, "Meccanica I",LocalDate.of(2017, 9, 15)));
		libr.add(new Voto(20, "Programmazione I",LocalDate.of(2017, 1, 5)));
		libr.add(new Voto(19, "Programmazione II",LocalDate.of(2017, 1, 5)));
		libr.add(new Voto(30, "Logistica",LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(30, "Economia",LocalDate.of(2018, 1, 15)));
		
		
	
	
	List <Voto> trenta= libr.StampaVoti(30);
	System.out.println(trenta);
	
	Voto result= libr.cercaEsame("Logistica ");
	System.out.println(result);
	
	Voto giusto= new Voto(18, "Geometria I", LocalDate.now());
	Voto sbagliato= new Voto (28, "Geometria I", LocalDate.now());
	Voto merendine= new Voto (45, "Merendine", LocalDate.now());
	System.out.format("Il voto %s e' %s\n", giusto.toString(), libr.EsisteVoto(giusto));
	System.out.format("Il voto %s e' %s\n", sbagliato.toString(), libr.EsisteVoto(sbagliato));
	System.out.format("Il voto %s e' %s\n", merendine.toString(), libr.EsisteVoto(merendine));


	
	
	}
}
