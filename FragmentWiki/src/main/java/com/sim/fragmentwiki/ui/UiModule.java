package com.sim.fragmentwiki.ui;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by simsun on 14-4-3.
 */

@Module (
    injects = {
        MainActivity.class
    },
    complete = false,
    library = true
)
public class UiModule {
  @Provides @Singleton ActivityHierarchyServer provideActivityHierarchyServer() {
    return ActivityHierarchyServer.NONE;
  }

  @Provides @Singleton AppContainer provideAppContainer() {
    return AppContainer.DEFAULT;
  }
}
