package io.fp.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VokabeltrainerModel {

	private Map<String, String> wörter = new HashMap<>();
	
	public void addword(String englishWord, String germanWord) {
		if(!wörter.containsKey(englishWord)) {
			wörter.put(englishWord, germanWord);
			System.out.println("Wort erfolgreich hinzugefügt");
		}
		else {
			System.out.println("Wort schon vorhanden!");
		}
	}
	
	public void checkTranslationEnglish(String englishWord) {
		if(wörter.containsKey(englishWord)) {
			
		}
	}
	
	public void wähleWort() {

	}
}
