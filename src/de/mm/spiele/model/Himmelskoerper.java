package de.mm.spiele.model;

import java.util.HashSet;
import java.util.Set;

public class Himmelskoerper {
	Set<Eigenschaft> eigenschaftsSet = new HashSet<Eigenschaft> ();
	public String bezeichnung;
	
	public Himmelskoerper (){
		this.eigenschaftsSet = new HashSet<Eigenschaft> ();
		this.bezeichnung= "<udef>";
	}
	public Himmelskoerper (String bezeichnung){
		this();
		createNamedHimmelskoerper(bezeichnung);
	}
	public Himmelskoerper createNamedHimmelskoerper(String bezeichnung){
		this.bezeichnung= bezeichnung;
		switch (this.bezeichnung){
			case "Venus": {
				this.eigenschaftsSet.add(new Eigenschaft(Dimension.GEWICHT, 1.99));
				this.eigenschaftsSet.add(new Eigenschaft(Dimension.ANZAHLMONDE, 0.0));
				this.eigenschaftsSet.add(new Eigenschaft(Dimension.ENTFERNUNGZURSONNE, 1000000));
				break;
				}
			default:  {break;}
		}
		return this; 	
		
		
		
	}
	public Himmelskoerper createErde(){
		this.bezeichnung= "Erde";
		this.eigenschaftsSet.add(new Eigenschaft(Dimension.GEWICHT, 1.0));
		this.eigenschaftsSet.add(new Eigenschaft(Dimension.ANZAHLMONDE, 1.0));
		this.eigenschaftsSet.add(new Eigenschaft(Dimension.ENTFERNUNGZURSONNE, 3000000));
		return this;
	}
	public Himmelskoerper createMars(){
		this.bezeichnung= "Mars";
		this.eigenschaftsSet.add(new Eigenschaft(Dimension.GEWICHT, 0.9));
		this.eigenschaftsSet.add(new Eigenschaft(Dimension.ANZAHLMONDE, 0.0));
		this.eigenschaftsSet.add(new Eigenschaft(Dimension.ENTFERNUNGZURSONNE, 2000000));
		return this;
	}
	

	public String printEigenschaften() {
		String s = " [ ";
		for (Eigenschaft e: this.eigenschaftsSet){
			//s += e.getAuspraegung()+" ";
			s += e.getDimension().toString() +":" + e.getWert()+" ";
			
		}; 
		return s+"]";
	}

}
