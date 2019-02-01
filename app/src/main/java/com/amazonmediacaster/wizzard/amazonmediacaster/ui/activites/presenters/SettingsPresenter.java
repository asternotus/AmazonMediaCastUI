package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters;

import android.arch.lifecycle.ViewModel;

import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ISettingsScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.interfaces.ISettingsPresenter;

public class SettingsPresenter extends ScreenPresenter<ISettingsScreenView> implements ISettingsPresenter {
    public SettingsPresenter(ISettingsScreenView screenView) {
        super(screenView);
    }
}
