package com.malagasys.client.nav;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface NavView extends IsWidget {
	
	void setText(String txt);
	
	void setPresenter(Presenter presenter);
	
	interface Presenter {
		void goTo(Place place);
	}
}
