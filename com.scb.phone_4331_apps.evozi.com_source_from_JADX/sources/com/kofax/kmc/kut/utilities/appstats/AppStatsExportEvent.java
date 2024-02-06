package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsExportListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EventObject;

public class AppStatsExportEvent extends EventObject {
    private static final long serialVersionUID = 7736630429273660485L;
    private ErrorInfo errorInfo;

    /* renamed from: pA */
    private int f801pA;

    /* renamed from: pz */
    private AppStatsExportListener.ExportStatus f802pz;

    public AppStatsExportEvent(Object obj, AppStatsExportListener.ExportStatus exportStatus, int i, ErrorInfo errorInfo2) {
        super(obj);
        this.f802pz = exportStatus;
        this.f801pA = i;
        this.errorInfo = errorInfo2;
    }

    public AppStatsExportListener.ExportStatus getExportStatus() {
        return this.f802pz;
    }

    public int getPercentComplete() {
        return this.f801pA;
    }

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }
}
