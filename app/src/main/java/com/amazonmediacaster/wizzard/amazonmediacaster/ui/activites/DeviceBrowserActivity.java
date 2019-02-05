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
import android.widget.TextView;

import com.amazonmediacaster.wizzard.amazonmediacaster.R;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IDeviceBrowserScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.DeviceBrowserPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.factories.PresenterFactory;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.interfaces.IDeviceBrowserPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DeviceBrowserActivity extends AppCompatActivity implements IDeviceBrowserScreenView {

    private IDeviceBrowserPresenter deviceBrowserPresenter;
    private Toolbar myToolbar;

    @BindView(R.id.device_browser_screen_tv_title)
    TextView tv_title;

    @BindView(R.id.device_browser_screen_tv_hint)
    TextView tv_hint;

    @BindView(R.id.device_browser_screen_iv_refresh)
    ImageView iv_refresh;

    @BindView(R.id.device_browser_screen_tv_device_is_found)
    TextView tv_device_is_found;

    @BindView(R.id.device_browser_screen_rv_device_list)
    RecyclerView rv_device_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_browser);
        ButterKnife.bind(this);

        toolbarSetup();

        PresenterFactory factory = new PresenterFactory(this);
        deviceBrowserPresenter = ViewModelProviders.of(this, factory).get(DeviceBrowserPresenter.class);

        getLifecycle().addObserver(deviceBrowserPresenter);
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
    }
}
