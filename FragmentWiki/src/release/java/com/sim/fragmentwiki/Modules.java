package com.sim.fragmentwiki;

import com.sim.fragmentwiki.FWikiApp;
import com.sim.fragmentwiki.FWikiModule;

/**
 * Created by simsun on 14-4-2.
 */
public class Modules {
  public static Object[] list(FWikiApp app) {
    return new Object[] {
        new FWikiModule(app)
    };
  }
  private Modules() {
    // No instances.
  }
}
