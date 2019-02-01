package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters;

import android.arch.lifecycle.ViewModel;

import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ICastScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.interfaces.ICastPresenter;

public class CastPresenter extends ScreenPresenter<ICastScreenView> implements ICastPresenter {
    public CastPresenter(ICastScreenView screenView) {
        super(screenView);
    }
}
