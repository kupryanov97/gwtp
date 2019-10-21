package ru.test.arh.client.application;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.event.dom.client.*;

import com.google.gwt.user.client.ui.*;

import com.google.gwt.event.dom.client.*;

import com.google.gwt.user.client.ui.*;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    interface Binder extends UiBinder<Widget, ApplicationView> {
    }
    @UiField
    SimplePanel mainContentPanel;

    @Inject
    ApplicationView(Binder uiBinder) {
       // username.setFocus(true);
        initWidget(uiBinder.createAndBindUi(this));
        bindSlot(ApplicationPresenter.SLOT_MAIN, mainContentPanel);
    }

}
