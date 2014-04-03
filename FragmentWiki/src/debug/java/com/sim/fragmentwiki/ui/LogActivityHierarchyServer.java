package com.sim.fragmentwiki.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by simsun on 14-4-4.
 */
public class LogActivityHierarchyServer implements ActivityHierarchyServer {
  private static final String TAG = "LogActivityHierarchyServer";
  @Override
  public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    Log.d(TAG, "onActivityCreated:" + activity.getLocalClassName());
  }

  @Override
  public void onActivityStarted(Activity activity) {
    Log.d(TAG, "onActivityStarted:" + activity.getLocalClassName());
  }

  @Override
  public void onActivityResumed(Activity activity) {
    Log.d(TAG, "onActivityResumed:" + activity.getLocalClassName());
  }

  @Override
  public void onActivityPaused(Activity activity) {
    Log.d(TAG, "onActivityPaused:" + activity.getLocalClassName());
  }

  @Override
  public void onActivityStopped(Activity activity) {
    Log.d(TAG, "onActivityStopped:" + activity.getLocalClassName());
  }

  @Override
  public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    Log.d(TAG, "onActivitySaveInstanceState:" + activity.getLocalClassName());
  }

  @Override
  public void onActivityDestroyed(Activity activity) {
    Log.d(TAG, "onActivityDestroyed:" + activity.getLocalClassName());
  }
}
