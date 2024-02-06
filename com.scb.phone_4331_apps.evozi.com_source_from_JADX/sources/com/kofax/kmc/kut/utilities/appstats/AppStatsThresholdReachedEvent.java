package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatistics;
import java.util.EventObject;

public class AppStatsThresholdReachedEvent extends EventObject {
    private static final long serialVersionUID = 7736630429273660485L;

    /* renamed from: qm */
    private AppStatistics.ThresholdType f812qm;
    private long size;

    public AppStatsThresholdReachedEvent(Object obj, AppStatistics.ThresholdType thresholdType, long j) {
        super(obj);
        this.f812qm = thresholdType;
        this.size = j;
    }

    public AppStatistics.ThresholdType getThresholdType() {
        return this.f812qm;
    }

    public long getSize() {
        return this.size;
    }
}
