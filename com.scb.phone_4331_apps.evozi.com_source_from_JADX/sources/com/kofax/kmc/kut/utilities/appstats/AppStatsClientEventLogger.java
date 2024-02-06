package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

public interface AppStatsClientEventLogger {
    void logEvent(AppStatsEventIDType appStatsEventIDType);
}
