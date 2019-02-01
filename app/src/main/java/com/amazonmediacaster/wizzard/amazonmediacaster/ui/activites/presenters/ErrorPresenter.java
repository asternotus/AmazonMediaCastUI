package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters;

import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IErrorScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.interfaces.IErrorPresenter;

public class ErrorPresenter extends ScreenPresenter<IErrorScreenView> implements IErrorPresenter {
    public ErrorPresenter(IErrorScreenView screenView) {
        super(screenView);
    }
}
