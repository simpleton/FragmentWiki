package com.sim.fragmentwiki;

import android.app.Application;
import android.content.Context;
import com.sim.fragmentwiki.ui.ActivityHierarchyServer;
import dagger.ObjectGraph;
import hugo.weaving.DebugLog;

import javax.inject.Inject;

/**
 * Created by simsun on 14-4-2.
 */
public class FWikiApp extends Application {
  private ObjectGraph objectGraph;
  @Inject ActivityHierarchyServer activityHierarchyServer;

  @Override
  public void onCreate() {
    super.onCreate();
    buildObjectGraphAndInject();
    registerActivityLifecycleCallbacks(activityHierarchyServer);
  }

  @DebugLog
  public void buildObjectGraphAndInject() {
    objectGraph = ObjectGraph.create(Modules.list(this));
    objectGraph.inject(this);
  }

  public void inject(Object obj) {
    objectGraph.inject(obj);
  }

  public static FWikiApp get(Context context) {
    return (FWikiApp) context.getApplicationContext();
  }
}
