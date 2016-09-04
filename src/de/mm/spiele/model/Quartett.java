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
//				Karte<Himmelskoerper> k = new Karte<Himmelskoerper>(new Himmelskoerper()
//						.createMars(), i, aBish.substring(c,c+1), "linkZurGraphik");
//				quartett.add(k);
				quartett.add(new Karte<Himmelskoerper>(new Himmelskoerper(), i, aBish.substring(c,c+1), "linkZurGraphik"));
			}
			//quartett.add(new Karte(1, "a", "href://eertlksd", new Himmelskoerper().createErde()));
			//quartett.add(new Karte(1, "b", "href://mars", new Himmelskoerper().createMars()));
		}
		getHimmelskoerperAusListe(1).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(2).createErde();
		getHimmelskoerperAusListe(3).createMars();
//		Karte<Himmelskoerper> x = quartett.get(4);
//		x.getObjekt().createNamedHimmelskoerper("Venus");
//		for (Karte<Himmelskoerper> k :quartett){
//			k.getObjekt().createNamedHimmelskoerper("Venus");
//		}
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
