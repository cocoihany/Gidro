package com.malagasys.client.nav;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

public final class Place3Activity extends AbstractActivity implements NavView.Presenter{
	private final NavView navView;
	private final PlaceController placeController;
	
	@Inject
	public Place3Activity(NavView view, PlaceController placeController) {
		this.navView = view;
		this.placeController = placeController;
	}

	public void goTo(Place place) {
		placeController.goTo(place);
	}

	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		navView.setPresenter(this);
		navView.setText("Place3");
		panel.setWidget(navView);
	}
}
