package com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.amazonmediacaster.wizzard.amazonmediacaster.R;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.interfaces.IErrorScreenView;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.CastPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.ErrorPresenter;
import com.amazonmediacaster.wizzard.amazonmediacaster.ui.activites.presenters.factories.PresenterFactory;

public class ErrorActivity extends AppCompatActivity implements IErrorScreenView {

    private ErrorPresenter errorPresenter;
    private Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        toolbarSetup();

        PresenterFactory factory = new PresenterFactory(this);
        errorPresenter = ViewModelProviders.of(this, factory).get(ErrorPresenter.class);

        getLifecycle().addObserver(errorPresenter);
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
