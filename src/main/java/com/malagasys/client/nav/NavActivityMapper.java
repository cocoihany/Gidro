package com.malagasys.client.nav;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.malagasys.client.NamedPlace;

public class NavActivityMapper implements ActivityMapper {
	
	@Inject
	private Provider<Place1Activity> place1ActivityProvider;
	
	@Inject
	private Provider<Place2Activity> place2ActivityProvider;
	
	@Inject
	private Provider<Place3Activity> place3ActivityProvider;
    
    public Activity getActivity(Place place) {
        if (place instanceof NamedPlace) {
            NamedPlace pl = (NamedPlace) place;
            if (pl.getName().equals(NamedPlace.TYPE.PLACE1.name())) {
                return place1ActivityProvider.get();
            } else if (pl.getName().equals(NamedPlace.TYPE.PLACE2.name())) {
                return place2ActivityProvider.get();
            } else if (pl.getName().equals(NamedPlace.TYPE.PLACE3.name())) {
                return place3ActivityProvider.get();
            }
        }
        return null;
    }
}
