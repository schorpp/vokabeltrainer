package io.fp.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VokabeltrainerModel {

	private Map<String, String> w�rter = new HashMap<>();
	
	public void addword(String englishWord, String germanWord) {
		if(!w�rter.containsKey(englishWord)) {
			w�rter.put(englishWord, germanWord);
			System.out.println("Wort erfolgreich hinzugef�gt");
		}
		else {
			System.out.println("Wort schon vorhanden!");
		}
	}
	
	public void checkTranslationEnglish(String englishWord) {
		if(w�rter.containsKey(englishWord)) {
			
		}
	}
	
	public void w�hleWort() {

	}
}
