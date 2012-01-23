package com.malagasys.client.nav;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.InlineLabel;

public class NavViewImpl extends Composite implements NavView {
	private InlineLabel label;

	private Presenter presenter;
	
	public NavViewImpl() {
		label = new InlineLabel();
		initWidget(label);
	}
	
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	public void setText(String txt) {
		this.label.setText(txt);
	}
}
