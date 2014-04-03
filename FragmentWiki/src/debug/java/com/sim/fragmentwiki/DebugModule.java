package com.sim.fragmentwiki;

import com.sim.fragmentwiki.ui.DebugUiModule;
import dagger.Module;

/**
 * Created by simsun on 14-4-4.
 */
@Module(
    addsTo = FWikiModule.class,
    includes = {
        DebugUiModule.class
    },
    overrides = true
)
public final class DebugModule {
}
