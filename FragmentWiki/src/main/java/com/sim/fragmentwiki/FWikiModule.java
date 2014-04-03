package com.sim.fragmentwiki;
import com.sim.fragmentwiki.ui.UiModule;
import dagger.Module;

@Module(
    includes = {
        UiModule.class
    },
    injects = {
        FWikiApp.class
    }
)
public final class FWikiModule {
  private final FWikiApp app;

  public FWikiModule(FWikiApp app) {
    this.app = app;
  }

/*  @Provides @Singleton Application provideApplication() {
    return app;
  }*/
}