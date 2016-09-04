package de.mm.spiele.model;

public class Eigenschaft {

	private double wert;
	private Dimension d;

	public Eigenschaft(Dimension d, double wert) {
		this.wert = wert;
		this.d = d;
	}

	public String getAuspraegung(){
		return "" + wert +" "+ d;
	}
	
	public String getDimension() {
		return d.name();
	}

	public double getWert() {
		return wert;
	}
	public void setWert(int wert) {
		this.wert = wert;
	}
}

