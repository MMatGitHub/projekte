package de.mm.spiele;

import de.mm.spiele.model.Eigenschaft;

public class Vergleicher {


	  public boolean jaEsGewinntA( Eigenschaft ersteEigenschaftA, Eigenschaft zweiteEigenschaftB ){
		  return (ersteEigenschaftA.getWert() > zweiteEigenschaftB.getWert());
	  }
	  
	  String getDifferenzBetragAsString( Eigenschaft ersterWertA, Eigenschaft zweiterWertB ){
		   return new String(""+(Math.abs(ersterWertA.getWert()-zweiterWertB.getWert())));
	   }


		
	}