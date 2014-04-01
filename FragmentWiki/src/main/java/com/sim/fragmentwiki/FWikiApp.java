package com.sim.fragmentwiki;

import android.app.Application;
import dagger.ObjectGraph;
import hugo.weaving.DebugLog;
/**
 * Created by simsun on 14-4-2.
 */
public class FWikiApp extends Application {
  private ObjectGraph objectGraph;

  @Override
  public void onCreate() {
    super.onCreate();
    buildObjectGraphAndInject();
  }

  @DebugLog
  public void buildObjectGraphAndInject() {
    objectGraph = ObjectGraph.create(Modules.list(this));
    objectGraph.inject(this);
  }

  public void inject(Object obj) {
    objectGraph.inject(obj);
  }
}
