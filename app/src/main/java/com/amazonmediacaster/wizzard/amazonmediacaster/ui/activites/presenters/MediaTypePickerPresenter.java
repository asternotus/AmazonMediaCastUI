package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters;

import android.arch.lifecycle.ViewModel;

import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IMediaTypePickerScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.interfaces.IMediaTypePickerPresenter;

public class MediaTypePickerPresenter extends ScreenPresenter<IMediaTypePickerScreenView> implements IMediaTypePickerPresenter {
    public MediaTypePickerPresenter(IMediaTypePickerScreenView screenView) {
        super(screenView);
    }
}
