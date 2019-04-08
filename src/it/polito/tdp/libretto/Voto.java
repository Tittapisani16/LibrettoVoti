package it.polito.tdp.libretto;
import java.time.LocalDate;

public class Voto {
	private int punti;
	private String corso;
	private LocalDate data;
	
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.data = data;
	}

	public int getPunti() {
		return punti;
	}

	public String getCorso() {
		return corso;
	}

	public LocalDate getData() {
		return data;
	}

	@Override
	public String toString() {
		return String.format("Voto [punti=%s, corso=%s, data=%s]", punti, corso, data);
	}
	
	
	
}
