package com.kofax.kmc.kut.utilities.appstats;

public interface AppStatsWriteFileListener {

    public enum WriteFileStatus {
        WRITE_STATUS_WRITING,
        WRITE_STATUS_COMPLETE,
        WRITE_STATUS_FAILED
    }

    void writeFileStatusEvent(AppStatsWritetoFileEvent appStatsWritetoFileEvent);
}
