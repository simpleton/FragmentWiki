package com.sim.fragmentwiki;


/**
 * Created by simsun on 14-4-3.
 */
public class Modules {
  public static Object[] list(FWikiApp app) {
    return new Object[] {
        new FWikiModule(app),
        new DebugModule()
    };
  }
  private Modules() {
    // No instances.
  }
}
