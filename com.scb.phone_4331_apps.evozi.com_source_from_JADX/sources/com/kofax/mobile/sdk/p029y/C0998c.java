package com.kofax.mobile.sdk.p029y;

import android.content.Context;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk.p016b.C0862c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.y.c */
public final class C0998c implements OPRStatusRewardsLandingActivity_ViewBinding<C0995b> {

    /* renamed from: Le */
    private final HmlReviewDocumentActivity<C0862c> f2394Le;

    /* renamed from: Lj */
    private final HmlReviewDocumentActivity<C0530i> f2395Lj;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f2396X;

    public C0998c(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0530i> hmlReviewDocumentActivity3) {
        this.f2396X = hmlReviewDocumentActivity;
        this.f2394Le = hmlReviewDocumentActivity2;
        this.f2395Lj = hmlReviewDocumentActivity3;
    }

    /* renamed from: qm */
    public final C0995b get() {
        return new C0995b(this.f2396X.get(), this.f2394Le.get(), this.f2395Lj.get());
    }

    /* renamed from: g */
    public static C0998c m2581g(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0530i> hmlReviewDocumentActivity3) {
        return new C0998c(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: b */
    public static C0995b m2580b(Context context, C0862c cVar, C0530i iVar) {
        return new C0995b(context, cVar, iVar);
    }
}
