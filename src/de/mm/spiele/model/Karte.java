package de.mm.spiele.model;

public class Karte<T extends Thema> {
	//private Thema t;
	String buchstabe;
	String linkZurGraphik;
	int nummer;
	public Karte(int nummer, String buchstabe, String linkZurGraphik){
		this.nummer = nummer;
		this.buchstabe = buchstabe;
		this.linkZurGraphik = linkZurGraphik;
	}
	public Karte(int i){
		this.nummer = i;
		}
//	public Karte(Thema t, int nummer, String buchstabe, String linkZurGraphik){
//		this (nummer,buchstabe,linkZurGraphik);
	//	this.t = t;

//	}
//	public void setObjekt(Thema t) {
//		this.t = t;
//	}
//	
//	public Thema getObjekt() {
//		return t;
//	}
public int getNummer() {
	return nummer;
}
public void setNummer(int nummer) {
	this.nummer = nummer;
}
public String getBuchstabe() {
	return buchstabe;
}
public void setBuchstabe(String buchstabe) {
	this.buchstabe = buchstabe;
}
public String getLinkZurGraphik() {
	return linkZurGraphik;
}
public void setLinkZurGraphik(String linkZurGraphik) {
	this.linkZurGraphik = linkZurGraphik;
}
}