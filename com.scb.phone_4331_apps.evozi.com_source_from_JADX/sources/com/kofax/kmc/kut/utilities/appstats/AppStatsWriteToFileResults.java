package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsWriteFileListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class AppStatsWriteToFileResults {

    /* renamed from: pD */
    private ErrorInfo f3640pD;

    /* renamed from: qo */
    private AppStatsWriteFileListener.WriteFileStatus f3641qo;

    public AppStatsWriteToFileResults(ErrorInfo errorInfo, AppStatsWriteFileListener.WriteFileStatus writeFileStatus) {
        this.f3640pD = errorInfo;
        this.f3641qo = writeFileStatus;
    }

    public ErrorInfo isError() {
        return this.f3640pD;
    }

    public AppStatsWriteFileListener.WriteFileStatus getState() {
        return this.f3641qo;
    }

    public void setState(AppStatsWriteFileListener.WriteFileStatus writeFileStatus) {
        this.f3641qo = writeFileStatus;
    }

    public void setError(ErrorInfo errorInfo) {
        this.f3640pD = errorInfo;
    }
}
