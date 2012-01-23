package com.malagasys.client.top;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.malagasys.client.NamedPlace;

public class TopActivityMapper implements ActivityMapper {
	private Provider<Place1Activity> place1ActivityProvider;
	private Provider<Place2Activity> place2ActivityProvider;
	private Provider<Place3Activity> place3ActivityProvider;
    
	@Inject
    public TopActivityMapper(Provider<Place1Activity> p1, Provider<Place2Activity> p2, Provider<Place3Activity> p3) {
    	this.place1ActivityProvider = p1;
    	this.place2ActivityProvider = p2;
    	this.place3ActivityProvider = p3;
    }

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
