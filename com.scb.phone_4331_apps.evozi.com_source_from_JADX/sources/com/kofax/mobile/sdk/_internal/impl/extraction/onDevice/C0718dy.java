package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import java.io.File;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dy */
public final class C0718dy implements OPRStatusRewardsLandingActivity_ViewBinding<File> {

    /* renamed from: LV */
    private final C0705ah f1665LV;

    /* renamed from: ws */
    private final HmlReviewDocumentActivity<Context> f1666ws;

    public C0718dy(C0705ah ahVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f1665LV = ahVar;
        this.f1666ws = hmlReviewDocumentActivity;
    }

    /* renamed from: bn */
    public final File get() {
        File d = this.f1665LV.mo11730d(this.f1666ws.get());
        if (d != null) {
            return d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: aj */
    public static C0718dy m1619aj(C0705ah ahVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C0718dy(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: c */
    public static File m1620c(C0705ah ahVar, Context context) {
        File d = ahVar.mo11730d(context);
        if (d != null) {
            return d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
