package com.malagasys.client.top;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface TopView extends IsWidget {
	void setText(String content);
	
	void setBackgroud(String validHtmlColor);
	
	void setPresenter(Presenter presenter);
	
	interface Presenter {
		void goTo(Place place);
		
		void onNextClicked();
	}
}
