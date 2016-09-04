package de.mm.spiele.model;

public enum Dimension {
	
	GEWICHT ("Erdmassen", "Mio. t") ,
	GROESSEBZWRADIUS ("Mio. km",""),
	ANZAHLMONDE ("Stück","Monde"),
	ENTFERNUNGZURSONNE ("Mio. km", "Lichtjahre"),
	HOECHSTTEMPERATUR  ("°C","°F"),
	TIEFSSTTEMPERATUR  ("°C","°F"),
	LANDUNGMOEGLICH ("ist möglich", "ja"),
	LEBENMOEGLICH ("ist möglich", "ja") ;
	
	private final String einheit;
	private final String alternative;
	Dimension( String einheit, String alternative ) { this.einheit = einheit; this.alternative = alternative;}
	public String einheit() { 
    	return einheit; 
    }
	public String alternative() { 
    	return alternative; 
    }
}
