package de.mm.spiele.model;

public class Eigenschaften<T> {
	
	public <T extends Thema> Eigenschaften<T> getEigenschaften( Eigenschaften<T> e){
			return e;
	}	
}