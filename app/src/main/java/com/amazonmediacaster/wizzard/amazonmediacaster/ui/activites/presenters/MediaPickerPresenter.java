package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters;

import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IMediaPickerScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.interfaces.IMediaPickerPresenter;

public class MediaPickerPresenter extends ScreenPresenter<IMediaPickerScreenView> implements IMediaPickerPresenter {
    public MediaPickerPresenter(IMediaPickerScreenView screenView) {
        super(screenView);
    }
}
