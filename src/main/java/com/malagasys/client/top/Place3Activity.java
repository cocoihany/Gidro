package com.malagasys.client.top;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.malagasys.client.NamedPlace;

public final class Place3Activity extends AbstractActivity implements TopView.Presenter{
	private TopView view;
	private PlaceController placeController;
	
	@Inject
	public Place3Activity(TopView view, PlaceController placeController) {
		this.view = view;
		this.placeController = placeController;
	}
	
	public void goTo(Place place) {
	    placeController.goTo(place);
	}

	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		view.setPresenter(this);
        view.setText("Place3");
        view.setBackgroud("blue");
		panel.setWidget(view);
	}
	
    public void onNextClicked() {
        goTo(NamedPlace.PLACE1);
    }
}
