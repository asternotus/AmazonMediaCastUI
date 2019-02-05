package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters;

import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ITranscodingScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.interfaces.ITranscodingPresenter;

public class TranscodingPresenter extends ScreenPresenter<ITranscodingScreenView> implements ITranscodingPresenter {

    public TranscodingPresenter(ITranscodingScreenView screenView) {
        super(screenView);
    }
}
