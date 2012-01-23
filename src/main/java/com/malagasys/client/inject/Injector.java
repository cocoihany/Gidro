package com.malagasys.client.inject;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.malagasys.client.Main;

@GinModules({Module.class, com.malagasys.client.nav.Module.class, com.malagasys.client.top.Module.class})
public interface Injector extends Ginjector{
	Main mainPanel();
	EventBus eventBus();
	PlaceController placeController();
}
