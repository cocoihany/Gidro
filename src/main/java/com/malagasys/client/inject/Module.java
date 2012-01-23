package com.malagasys.client.inject;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.malagasys.client.Main;

public class Module extends AbstractGinModule {

	@Override
    protected void configure() {
		//Bind singleton views
		bind(Main.class).in(Singleton.class);
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
    }
	
	@Provides
	@Singleton
	PlaceController createPlaceController(EventBus evtBus) {
		return new PlaceController(evtBus);
	}
}
