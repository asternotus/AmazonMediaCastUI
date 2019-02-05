package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.amazonmediacaster.wizzard.amazonmediacaster.R;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.ISettingsScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.CastPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.SettingsPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.factories.PresenterFactory;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SettingsActivity extends AppCompatActivity implements ISettingsScreenView {

    private SettingsPresenter settingsPresenter;
    private Toolbar myToolbar;

    @BindView(R.id.settings_screen_tv_main_settings)
    TextView tv_main_settings;

    @BindView(R.id.settings_screen_sw_transcoding)
    Switch sw_transcoding;

    @BindView(R.id.settings_screen_sw_conversion)
    Switch sw_conversion;

    @BindView(R.id.settings_screen_sw_cache)
    Switch sw_cache;

    @BindView(R.id.settings_screen_tv_theme_colors)
    TextView tv_theme_colors;

    @BindView(R.id.settings_screen_rb_group)
    RadioGroup rb_group;

    @BindView(R.id.settings_screen_rb_warm)
    RadioButton rb_warm;

    @BindView(R.id.settings_screen_rb_cold)
    RadioButton rb_cold;

    @BindView(R.id.settings_screen_rb_gray)
    RadioButton rb_gray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);

        toolbarSetup();

        PresenterFactory factory = new PresenterFactory(this);
        settingsPresenter = ViewModelProviders.of(this, factory).get(SettingsPresenter.class);

        getLifecycle().addObserver(settingsPresenter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings_menu:
                // Do whatever you want to do on logout click.
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void toolbarSetup() {
        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
