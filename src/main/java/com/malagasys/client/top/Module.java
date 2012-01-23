package com.malagasys.client.top;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class Module extends AbstractGinModule {

	@Override
    protected void configure() {
		bind(TopView.class).to(TopViewImpl.class).in(Singleton.class);
		
		bind(TopActivityMapper.class);
		bind(Place1Activity.class);
		bind(Place2Activity.class);
		bind(Place3Activity.class);
    }
}
