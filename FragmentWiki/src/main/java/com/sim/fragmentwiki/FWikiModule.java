package com.sim.fragmentwiki;

import dagger.Module;

@Module(
    includes = {

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
}