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
		int i=1;
		getHimmelskoerperAusListe(i++).createMars();
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Sonne");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Merkur");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Erde");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Erdenmond");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Mars");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Jupiter");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Saturn");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Iapetus");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Uranus");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Neptun");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Pluto");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Charon");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Ganymed");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Titan (Saturnmond)");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Kallisto");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("IO");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Oberon");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Mimas (Saturnmond)");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("ISS Internationale Raumstation");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Halleyscher Komet");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Eris");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Kuipergürtel");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Milchstraße");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Andromeda");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Venus");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Alpha Centauri");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("Proxima Centauri");
		getHimmelskoerperAusListe(i++).createNamedHimmelskoerper("V4641 Sagittarius (2000) Schwarzes Loch");

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
