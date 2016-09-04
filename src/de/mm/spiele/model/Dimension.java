package de.mm.spiele.model;

public enum Dimension {
	
	GEWICHT ("Erdmassen", "Mio. t") ,
	GROESSEBZWRADIUS ("Mio. km",""),
	ANZAHLMONDE ("St�ck","Monde"),
	ENTFERNUNGZURSONNE ("Mio. km", "Lichtjahre"),
	HOECHSTTEMPERATUR  ("�C","�F"),
	TIEFSSTTEMPERATUR  ("�C","�F"),
	LANDUNGMOEGLICH ("ist m�glich", "ja"),
	LEBENMOEGLICH ("ist m�glich", "ja") ;
	
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
