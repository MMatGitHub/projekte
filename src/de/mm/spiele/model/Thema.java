package de.mm.spiele.model;

public class Thema {

	
	
//	public String dump(){
//		String s ="";
//		int i = 0;
//		for (Karte<Himmelskoerper> k : quartett){
//			i++;
//			s += "\n" + i +": " + k.getNummer()+k.getBuchstabe() +" "+ k.getObjekt().bezeichnung + k.getObjekt().printEigenschaften(); ;
//		}
//		return s;
//	}

	public Karte<? extends Thema> getNextKarte(Quartett quartett){
		return quartett.getNext();
	}
	public Karte<? extends Thema> getNextKarte(int i, Quartett quartett){
		return quartett.get(i);
	}
	
}
