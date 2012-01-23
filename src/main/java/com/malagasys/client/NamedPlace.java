package com.malagasys.client;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class NamedPlace extends Place {
	
	//Available place names in the application
	public enum Name {
		NEW_PROJECT,
	}
	
    private String name;

    private NamedPlace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public static class Tokenizer implements PlaceTokenizer<NamedPlace> {

        public NamedPlace getPlace(String token) {
            try {
                return new NamedPlace(token);
            } catch (Exception ex) {
                return new NamedPlace(TYPE.UNKNOWN.name());
            }
        }

        public String getToken(final NamedPlace place) {
            return place.getName();
        }
    }
}
