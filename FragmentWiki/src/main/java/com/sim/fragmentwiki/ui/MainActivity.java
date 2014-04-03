package com.sim.fragmentwiki.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.sim.fragmentwiki.FWikiApp;
import com.sim.fragmentwiki.R;
import com.umeng.analytics.MobclickAgent;

import javax.inject.Inject;


public class MainActivity extends ActionBarActivity {
  @Inject AppContainer appContainer;
  private ViewGroup container;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    FWikiApp app = FWikiApp.get(this);
    app.inject(this);
    container = appContainer.get(this, app);

    getLayoutInflater().inflate(R.layout.activity_main, container);
  }

  @Override
  protected void onResume() {
    super.onResume();
    MobclickAgent.onResume(this);
  }

  @Override
  protected void onPause() {
    super.onPause();
    MobclickAgent.onPause(this);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {

    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    if (id == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

}
