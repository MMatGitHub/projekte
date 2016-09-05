package de.mm.spiele.model;

import java.util.ArrayList;
import java.util.List;

public class Thema_Himmelskoerper extends Thema {
	List<Karte<Thema_Himmelskoerper>> karten = new ArrayList<Karte<Thema_Himmelskoerper>>();
	final Thema thema;
	public Thema_Himmelskoerper(){
		thema = new Thema();
		doCreate ();
	}
		

	private void doCreate(){
		int i=1;
		new Karte<Thema_Himmelskoerper>(3, "u", "String linkZurGraphik");
	//	new Karte<Thema_Himmelskoerper>(2).add(new Eigenschaften<Himmelskoerper>("Pluto"));
		//getNextHimmelskoerper(i++).createMars();
		//getNextHimmelskoerper(i++).createNamedHimmelskoerper("Sonne");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Merkur");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Venus");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Erde");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Erdenmond");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Mars");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Jupiter");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Saturn");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Iapetus");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Uranus");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Neptun");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Pluto");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Charon");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Ganymed");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Titan (Saturnmond)");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Kallisto");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("IO");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Oberon");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Mimas (Saturnmond)");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("ISS Internationale Raumstation");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Halleyscher Komet");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Eris");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Kuipergürtel");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Milchstraße");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Andromeda");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Venus");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Alpha Centauri");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("Proxima Centauri");
//		getNextHimmelskoerper(i++).createNamedHimmelskoerper("V4641 Sagittarius (2000) Schwarzes Loch");
	}

}
