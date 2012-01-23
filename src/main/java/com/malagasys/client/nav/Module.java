package com.malagasys.client.nav;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class Module extends AbstractGinModule {

	@Override
    protected void configure() {
		bind(NavView.class).to(NavViewImpl.class).in(Singleton.class);
		
		bind(NavActivityMapper.class);
		bind(Place1Activity.class);
		bind(Place2Activity.class);
		bind(Place3Activity.class);
    }
}
