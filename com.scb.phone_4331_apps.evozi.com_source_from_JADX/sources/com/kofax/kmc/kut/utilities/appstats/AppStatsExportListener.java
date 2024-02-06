package com.kofax.kmc.kut.utilities.appstats;

public interface AppStatsExportListener {

    public enum ExportStatus {
        EXPORTING,
        COMPLETE,
        FAILED
    }

    void exportStatusEvent(AppStatsExportEvent appStatsExportEvent);
}
