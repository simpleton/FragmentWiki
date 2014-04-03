package com.sim.fragmentwiki.ui;


import android.app.Activity;
import android.view.ViewGroup;
import com.sim.fragmentwiki.FWikiApp;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by simsun on 14-4-4.
 */
@Singleton
public class DebugAppContainer implements AppContainer {
  private static final DateFormat DATE_DISPLAY_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
  @Inject ActivityHierarchyServer activityHierarchyServer;
  @Override
  public ViewGroup get(Activity activity, FWikiApp app) {
    return null;
  }
}
