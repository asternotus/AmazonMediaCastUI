package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters;

import android.arch.lifecycle.ViewModel;

import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IScreenView;

public class ScreenPresenter<T extends IScreenView> extends ViewModel {

    private final T screenView;

    public ScreenPresenter(T screenView) {
        this.screenView = screenView;
    }

    public T getScreenView() {
        return screenView;
    }
}
