package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.factories;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ICastScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IDeviceBrowserScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IErrorScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IMediaPickerScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IMediaTypePickerScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ISettingsScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ITranscodingScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.CastPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.DeviceBrowserPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.ErrorPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.MediaPickerPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.MediaTypePickerPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.ScreenPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.SettingsPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.TranscodingPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.interfaces.ISettingsPresenter;

public class PresenterFactory implements ViewModelProvider.Factory {

    private final IScreenView screenView;

    public PresenterFactory(IScreenView screenView) {
        this.screenView = screenView;
    }

    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(DeviceBrowserPresenter.class)) {
            return (T) new DeviceBrowserPresenter((IDeviceBrowserScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(MediaPickerPresenter.class)) {
            return (T) new MediaPickerPresenter((IMediaPickerScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(MediaTypePickerPresenter.class)) {
            return (T) new MediaTypePickerPresenter((IMediaTypePickerScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(ErrorPresenter.class)) {
            return (T) new ErrorPresenter((IErrorScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(TranscodingPresenter.class)) {
            return (T) new TranscodingPresenter((ITranscodingScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(CastPresenter.class)) {
            return (T) new CastPresenter((ICastScreenView) screenView);
        }

        if (modelClass.isAssignableFrom(SettingsPresenter.class)) {
            return (T) new SettingsPresenter((ISettingsScreenView) screenView);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}

