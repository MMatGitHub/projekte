package de.mm.spiele.model;

public class Karte<T> {
	private T t;
	String buchstabe;
	String linkZurGraphik;
	int nummer;
	public Karte(T t, int nummer, String buchstabe, String linkZurGraphik){
		this.t = t;
		this.nummer = nummer;
		this.buchstabe = buchstabe;
		this.linkZurGraphik = linkZurGraphik;
	}
	public void setObjekt(T t) {
		this.t = t;
	}
	
	public T getObjekt() {
		return t;
	}
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