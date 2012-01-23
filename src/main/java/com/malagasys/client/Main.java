package com.malagasys.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.malagasys.client.nav.NavActivityMapper;
import com.malagasys.client.top.TopActivityMapper;

public class Main extends Composite {

	@UiField
	SimplePanel body;
	
	@UiField
	SimplePanel top;
	
	@UiField
	SimplePanel navigation;
	
	@UiTemplate("Main.ui.xml")
	interface ContentBinder extends UiBinder<Widget, Main> {}
	private static ContentBinder uiBinder = GWT.create(ContentBinder.class);
	
	@Inject
	public Main(TopActivityMapper top, NavActivityMapper nav, EventBus evtBus) {
		initWidget(uiBinder.createAndBindUi(this));
		
		//Create activity manager
		ActivityManager topManager = new ActivityManager(top, evtBus);
		topManager.setDisplay(getTop());
		
		ActivityManager navManager = new ActivityManager(nav, evtBus);
		navManager.setDisplay(getNavigation());
	}

//    public AcceptsOneWidget getBody() {
//        return new AcceptsOneWidget() {
//            public void setWidget(IsWidget w) {
//                body.setWidget(w);
//            }
//        };
//    }
//
    public AcceptsOneWidget getTop() {
        return new AcceptsOneWidget() {
            public void setWidget(IsWidget w) {
                top.setWidget(w);
            }
        };
    }

    public AcceptsOneWidget getNavigation() {
        return new AcceptsOneWidget() {
            public void setWidget(IsWidget w) {
                navigation.setWidget(w);
            }
        };
    }

    public static ContentBinder getUiBinder() {
        return uiBinder;
    }
}
