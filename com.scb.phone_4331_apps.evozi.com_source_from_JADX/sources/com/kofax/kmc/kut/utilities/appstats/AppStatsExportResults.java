package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsExportListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class AppStatsExportResults {

    /* renamed from: pC */
    private AppStatsExportListener.ExportStatus f3610pC;

    /* renamed from: pD */
    private ErrorInfo f3611pD;

    public AppStatsExportResults(ErrorInfo errorInfo, AppStatsExportListener.ExportStatus exportStatus) {
        this.f3611pD = errorInfo;
        this.f3610pC = exportStatus;
    }

    public ErrorInfo isError() {
        return this.f3611pD;
    }

    public AppStatsExportListener.ExportStatus getState() {
        return this.f3610pC;
    }

    public void setState(AppStatsExportListener.ExportStatus exportStatus) {
        this.f3610pC = exportStatus;
    }

    public void setError(ErrorInfo errorInfo) {
        this.f3611pD = errorInfo;
    }
}
