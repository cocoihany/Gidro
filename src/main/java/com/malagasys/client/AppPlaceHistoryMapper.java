package com.malagasys.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({NamedPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper { }
