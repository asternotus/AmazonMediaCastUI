package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import com.amazonmediacaster.wizzard.amazonmediacaster.R;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ICastScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.CastPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.factories.PresenterFactory;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CastActivity extends AppCompatActivity implements ICastScreenView {

    private CastPresenter castPresenter;

    @BindView(R.id.cast_screen_btn_stop)
    Button btn_stop;

    @BindView(R.id.cast_screen_tv_name)
    TextView tv_name;

    @BindView(R.id.cast_screen_vv_video)
    VideoView vv_video;

    @BindView(R.id.cast_screen_btn_pause)
    Button btn_pause;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cast);
        ButterKnife.bind(this);

        PresenterFactory factory = new PresenterFactory(this);
        castPresenter = ViewModelProviders.of(this, factory).get(CastPresenter.class);

        getLifecycle().addObserver(castPresenter);
    }
}
