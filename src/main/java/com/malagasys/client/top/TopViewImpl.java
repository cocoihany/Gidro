package com.malagasys.client.top;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.InlineLabel;

public class TopViewImpl extends Composite implements TopView {

	private InlineLabel label;
	
	private Button next;
	
	private TopView.Presenter presenter;
	
	public TopViewImpl() {
		label = new InlineLabel("Top");
		next = new Button("Suivant");
		FlowPanel panel = new FlowPanel();
		panel.add(label);
		panel.add(next);
		initWidget(panel);
		
		next.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                if (presenter != null) {
                    presenter.onNextClicked();
                }
            }
        });
	}
	
	public void setText(String content) {
		label.setText(content);
	}

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

    public void setBackgroud(String validHtmlColor) {
        DOM.setStyleAttribute(getElement(), "background", validHtmlColor);        
    }
}
