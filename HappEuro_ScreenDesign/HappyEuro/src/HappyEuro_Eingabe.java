//package de.slimou.test;

/**
 * 
 * @author Salim Oussayfi
 *
 */
public class HappyEuro_Eingabe {
	
	/**
	 * 
	 * @param eingabe_1
	 * @param eingabe_2
	 * @return
	 * 
	 * Klasse nimmt 2 Strings entgegegen, bevorzugterweise Geldbetraege
	 * in Komma-Schreibweise und gibt die Summe beider Eingaben aus
	 * 
	 * ein nicht eingegebenes Komma und/oder einstellige Nachkomma-Stellen
	 * werden in der Klasse behandelt
	 */
	
	public String add(String eingabe_1, String eingabe_2){
		
		//---------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------
		
		//eingabe_1 wird verarbeitet
				
		//alle fuer den ersten Parameter noetigen Variablen werden deklariert
		String euro_1_asString, cent_1_asString;
		int komma_1;
		int euro_1_asInt, cent_1_asInt; 
		
		
		//komma_1 wird mit dem Index des Kommas initialisiert
		komma_1 = eingabe_1.indexOf(",");
		
		//---------------------------------------------------------------------------------
		
		//pruefen, ob ueberhaupt ein Komma eingegeben wurde
		//falls kein Komma, dann speicher "00" als Wert in cent_1_asString
		if(komma_1 == -1){
			euro_1_asString = eingabe_1;
			cent_1_asString = "00";
		}
		
		//---------------------------------------------------------------------------------
		
		//falls Komma gesetzt, splitte die Eingabe in Euro & Cent
		else{
			euro_1_asString = eingabe_1.substring(0, komma_1);
			cent_1_asString = eingabe_1.substring(komma_1 +1);
		}
		
		//---------------------------------------------------------------------------------
		
		//cent_1_asString wird auf 2 Nach-Kommastellen beschnitten
		cent_1_asString = cent_1_asString.substring(0,2);
		
		//---------------------------------------------------------------------------------
		
		//Strings in Integer
		euro_1_asInt = Integer.parseInt(euro_1_asString);
		cent_1_asInt = Integer.parseInt(cent_1_asString);
		
		
		//---------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------
		
		//eingabe_2 wird verarbeitet
				
		//alle fuer den zweiten Parameter noetigen Variablen werden deklariert
		String euro_2_asString, cent_2_asString;
		int komma_2;
		int euro_2_asInt, cent_2_asInt; 
		
		//---------------------------------------------------------------------------------
		
		//komma_2 wird mit dem Index des Kommas initialisiert
		komma_2 = eingabe_2.indexOf(",");
		
		//---------------------------------------------------------------------------------
		
		//pruefen, ob ueberhaupt ein Komma eingegeben wurde
		//falls kein Komma, dann speicher "00" als Wert in cent_1_asString
		if(komma_2 == -1){
			euro_2_asString = eingabe_2;
			cent_2_asString = "00";
		}
		
		//---------------------------------------------------------------------------------
		
		//falls Komma gesetzt, splitte die Eingabe in Euro & Cent
		else{
			euro_2_asString = eingabe_2.substring(0, komma_2);
			cent_2_asString = eingabe_2.substring(komma_2 +1);
		}
		
		//---------------------------------------------------------------------------------
		
		//cent_2_asString wird auf 2 Nach-Kommastellen beschnitten
		cent_2_asString = cent_2_asString.substring(0,2);
		
		//---------------------------------------------------------------------------------
		
		//Strings in Integer
		euro_2_asInt = Integer.parseInt(euro_2_asString);
		cent_2_asInt = Integer.parseInt(cent_2_asString);
		
		
		//---------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------
		
		//Ergebnis berechnen
				
		//alle fuer die Ausgabe noetigen Variablen werden deklariert
		int euro_ergebnis_asInt, cent_ergebnis_asInt;
		String cent_ergebnis_asString;
		String ausgabe;
		
		//---------------------------------------------------------------------------------
		
		//Eingabe berechnen
		euro_ergebnis_asInt = euro_1_asInt + euro_2_asInt;
		cent_ergebnis_asInt = cent_1_asInt + cent_2_asInt;
		
		//---------------------------------------------------------------------------------
		
		//es wird geprueft, ob der Cent-Betrag geringer als 10 ist, also einstellig
		if(cent_ergebnis_asInt < 10 && cent_ergebnis_asInt > 0 || cent_ergebnis_asInt == 0){
			//dem einstelligen Cent-Betrag wird eine 0 vorangestellt
			cent_ergebnis_asString = "0"+cent_ergebnis_asInt;			
			//ausgabe wird mit dem vervollstaendigten Cent-Betrag initialisiert
			ausgabe = euro_ergebnis_asInt + "," + cent_ergebnis_asString;
		}
		
		//---------------------------------------------------------------------------------
		
		//es wird geprueft, ob die Summe beider Cent-Eingaben 1 Euro uebersteigen
		else if(cent_ergebnis_asInt >= 100){
			euro_ergebnis_asInt +=1;
			cent_ergebnis_asInt %=100;
			ausgabe = euro_ergebnis_asInt + "," + cent_ergebnis_asInt;
		}
		
		//---------------------------------------------------------------------------------
		
		//trifft keine dieser beiden Ausnahmen zu, wird ausgabe initialisiert
		else {
			 ausgabe = euro_ergebnis_asInt + "," + cent_ergebnis_asInt;
		}
			
		
		//---------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------
		//Ausgabe
		
		return ausgabe ;
	}	
	
}
