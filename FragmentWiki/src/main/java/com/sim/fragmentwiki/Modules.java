package com.sim.fragmentwiki;

/**
 * Created by simsun on 14-4-2.
 */
public class Modules {
  static Object[] list(FWikiApp app) {
    return new Object[] {
        new FWikiModule(app)
    };
  }
  private Modules() {
    // No instances.
  }
}
