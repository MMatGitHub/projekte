package de.mm.spiele.model;

import java.util.ArrayList;
import java.util.List;

public class Quartett {
	List<Karte<? extends Thema>> quartett = new ArrayList<Karte<? extends Thema>>();
	int i;
	public Quartett (){
		createQuartett();
	}
	public int getAnzahlKarten(){
		return quartett.size();
		
	}
	private void createQuartett(){
		String a_Bis_h= "abcdefgh";
		for (int i=1 ; i<5;i++){
			for (int c = 0; c < a_Bis_h.length();c++){
				//quartett.add(new Karte<Himmelskoerper>(new Himmelskoerper(), i, aBish.substring(c,c+1), "linkZurGraphik"));
				quartett.add(new Karte<Thema>(i, a_Bis_h.substring(c,c+1), "linkZurGraphik"));
			}
	
		}
	}

	public Karte<? extends Thema> getNext() throws java.lang.IndexOutOfBoundsException{
		i++;
		if (i > quartett.size()){
			throw new IndexOutOfBoundsException("Es gibt nur 32 Karten!");
		}
		return get(i);		
	}
	public Karte<? extends Thema> get(int i){
		return quartett.get(i);		
	}

}
