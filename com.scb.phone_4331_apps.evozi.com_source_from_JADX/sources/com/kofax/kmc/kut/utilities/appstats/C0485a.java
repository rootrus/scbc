package com.kofax.kmc.kut.utilities.appstats;

import java.util.Map;

/* renamed from: com.kofax.kmc.kut.utilities.appstats.a */
enum C0485a {
    STATE_UNINITIALIZED,
    STATE_INITIALIZING,
    STATE_INITIALIZED,
    STATE_PURGING,
    STATE_RECORDING,
    STATE_WRITING,
    STATE_RECORDING_WRITING,
    STATE_EXPORTING,
    STATE_BEGINNING_SESSION,
    STATE_LOGGING_SESSION,
    STATE_ENDING_SESSION,
    STATE_UPGRADING,
    STATE_ANY;
    

    /* renamed from: qE */
    private Map<C0485a, AppStatsState> f830qE;

    /* access modifiers changed from: package-private */
    /* renamed from: aV */
    public final AppStatsState mo10933aV() {
        if (this.f830qE.isEmpty()) {
            this.f830qE.put(STATE_UNINITIALIZED, AppStatsState.APP_STATS_UNINITIALIZED);
            this.f830qE.put(STATE_INITIALIZING, AppStatsState.APP_STATS_INITIALIZING);
            this.f830qE.put(STATE_INITIALIZED, AppStatsState.APP_STATS_INITIALIZED);
            this.f830qE.put(STATE_PURGING, AppStatsState.APP_STATS_PURGING);
            this.f830qE.put(STATE_RECORDING, AppStatsState.APP_STATS_RECORDING);
            this.f830qE.put(STATE_WRITING, AppStatsState.APP_STATS_WRITING);
            this.f830qE.put(STATE_RECORDING_WRITING, AppStatsState.APP_STATS_RECORDING_WRITING);
            this.f830qE.put(STATE_EXPORTING, AppStatsState.APP_STATS_EXPORTING);
            this.f830qE.put(STATE_LOGGING_SESSION, AppStatsState.APP_STATS_LOGGING_SESSION);
            this.f830qE.put(STATE_UPGRADING, AppStatsState.APP_STATS_UPGRADING);
        }
        return this.f830qE.get(this);
    }
}
