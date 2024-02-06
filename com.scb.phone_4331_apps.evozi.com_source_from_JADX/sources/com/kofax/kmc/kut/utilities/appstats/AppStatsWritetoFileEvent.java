package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsWriteFileListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EventObject;

public class AppStatsWritetoFileEvent extends EventObject {
    private static final long serialVersionUID = 7736630429273660485L;
    private ErrorInfo errorInfo;

    /* renamed from: qp */
    private AppStatsWriteFileListener.WriteFileStatus f814qp;

    /* renamed from: qq */
    private float f815qq;

    public AppStatsWritetoFileEvent(Object obj, AppStatsWriteFileListener.WriteFileStatus writeFileStatus, float f, ErrorInfo errorInfo2) {
        super(obj);
        this.f814qp = writeFileStatus;
        this.f815qq = f;
        this.errorInfo = errorInfo2;
    }

    public float getPercentComplete() {
        return this.f815qq;
    }

    public AppStatsWriteFileListener.WriteFileStatus getWritetoFileStatus() {
        return this.f814qp;
    }

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10927a(AppStatsWriteFileListener.WriteFileStatus writeFileStatus) {
        this.f814qp = writeFileStatus;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10928d(float f) {
        this.f815qq = f;
    }
}
