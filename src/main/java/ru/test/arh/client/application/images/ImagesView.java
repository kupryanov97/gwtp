package ru.test.arh.client.application.images;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import javax.inject.Inject;


public class ImagesView extends ViewWithUiHandlers<ImagesUiHandlers> implements ImagesPresenter.MyView {
    interface Binder extends UiBinder<Widget, ImagesView> {
    }

    @UiField
    SimplePanel main;

    @Inject
    ImagesView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));

        bindSlot(ImagesPresenter.SLOT_IMAGES, main);
    }
}
