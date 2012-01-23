package com.malagasys.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.malagasys.client.inject.Injector;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class JCD implements EntryPoint {
	
	private final Injector injector = GWT.create(Injector.class);
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// Start PlaceHistoryHandler with our PlaceHistoryMapper
		AppPlaceHistoryMapper historyMapper = GWT.create(AppPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);

		historyHandler.register(injector.placeController(), injector.eventBus(), NamedPlace.PLACE1);
		RootLayoutPanel.get().add(injector.mainPanel());
		historyHandler.handleCurrentHistory();
	}
}
