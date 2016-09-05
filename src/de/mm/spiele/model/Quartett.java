package de.mm.spiele.model;

import java.util.ArrayList;
import java.util.List;

public class Quartett {
		List<Karte<T>> quartett = new ArrayList<Karte<T>>();
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
				//quartett.add(new Karte<Himmelskoerper>(new Himmelskoerper(), i, aBish.substring(c,c+1), "linkZurGraphik"));
				quartett.add(new Karte<Thema_Himmelskoerper>(i, aBish.substring(c,c+1), "linkZurGraphik"));
			}
	
		}
	}		
}
