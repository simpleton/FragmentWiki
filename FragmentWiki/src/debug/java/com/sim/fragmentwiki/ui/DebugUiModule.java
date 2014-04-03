package com.sim.fragmentwiki.ui;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by simsun on 14-4-4.
 */
@Module(
    injects = DebugAppContainer.class,
    complete = false,
    library = true,
    overrides = true
)
public class DebugUiModule {
  @Provides @Singleton AppContainer provideAppContainer(DebugAppContainer debugAppContainer) {
    return debugAppContainer;
  }

  @Provides @Singleton ActivityHierarchyServer provideActivityHierarchyServer() {
    return new LogActivityHierarchyServer();
  }
}
