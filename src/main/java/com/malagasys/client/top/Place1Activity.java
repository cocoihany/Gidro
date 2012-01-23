package com.malagasys.client.top;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.malagasys.client.NamedPlace;

public final class Place1Activity extends AbstractActivity implements TopView.Presenter {
	private final TopView view;
	private final PlaceController placeController;
	
	@Inject
	public Place1Activity(TopView nv, PlaceController pc) {
		this.view = nv;
		this.placeController = pc;
	}
	
	public void goTo(Place place) {
	    placeController.goTo(place);
	}

	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		view.setPresenter(this);
		view.setText("Place1");
		view.setBackgroud("red");
		panel.setWidget(view);
	}

    public void onNextClicked() {
        goTo(NamedPlace.PLACE2);
    }

    @Override
    public String mayStop() {
    	return null;
    }
}
