package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EventObject;

public class LicenseFoundEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: mb */
    private ErrorInfo f3528mb;

    /* renamed from: mc */
    private int f3529mc;

    /* renamed from: md */
    private String f3530md;

    public LicenseFoundEvent(Object obj, ErrorInfo errorInfo, int i, String str) {
        super(obj);
        this.f3528mb = errorInfo;
        this.f3529mc = i;
        this.f3530md = str;
    }

    public ErrorInfo getErrorInfo() {
        return this.f3528mb;
    }

    public int getDaysRemaining() {
        return this.f3529mc;
    }

    public String getLicenseString() {
        return this.f3530md;
    }
}
