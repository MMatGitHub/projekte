package de.mm.spiele.model;

import java.util.ArrayList;
import java.util.List;

public class Quartett {
	@SuppressWarnings("rawtypes")
	List<Karte> quartett = new ArrayList<Karte>();
	public int getAnzahlKarten(){
		return quartett.size();
		
	}
	public Quartett (){
		createQuartett();		
	}
	private void createQuartett(){
		String aBish= "abcdefgh";
		for (int i=1 ; i<5;i++){
			for (int c = 0; c < aBish.length();c++){
				quartett.add(new Karte<Himmelskoerper>(new Himmelskoerper(), i, aBish.substring(c,c+1), "linkZurGraphik"));
			}
		}
		getHimmelskoerperAusListe(1).createErde();
		getHimmelskoerperAusListe(2).createMars();
		getHimmelskoerperAusListe(3).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(4).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(5).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(6).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(7).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(8).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(9).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(10).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(11).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(12).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(13).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(14).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(15).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(16).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(17).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(18).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(19).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(20).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(21).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(22).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(23).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(24).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(25).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(26).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(27).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(28).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(29).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(30).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(31).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(32).createNamedHimmelskoerper("Venus");

	}
	private Himmelskoerper getHimmelskoerperAusListe(int i){
		Himmelskoerper hk;
		Karte<Himmelskoerper> temp = quartett.get(i);
		hk = temp.getObjekt();
		return hk;
	}
	private Himmelskoerper create(String bezeichnung){
		return new Himmelskoerper(bezeichnung);
	}
	public String dump(){
		String s ="";
		int i = 0;
		for (Karte<Himmelskoerper> k : quartett){
			i++;
			s += "\n" + i +": " + k.getNummer()+k.getBuchstabe() +" "+ k.getObjekt().bezeichnung + k.getObjekt().printEigenschaften(); ;
		}
		return s;
	}
}
