package com.kofax.mobile.sdk.p080t;

import android.content.Context;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p016b.C0863d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.t.b */
public final class C8469b implements OPRStatusRewardsLandingActivity_ViewBinding<C8468a> {

    /* renamed from: Le */
    private final HmlReviewDocumentActivity<C0862c> f5041Le;

    /* renamed from: Lg */
    private final HmlReviewDocumentActivity<C7913j> f5042Lg;

    /* renamed from: Lj */
    private final HmlReviewDocumentActivity<C0530i> f5043Lj;

    /* renamed from: ND */
    private final HmlReviewDocumentActivity<C0863d> f5044ND;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f5045X;

    public C8469b(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0530i> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C7913j> hmlReviewDocumentActivity5) {
        this.f5045X = hmlReviewDocumentActivity;
        this.f5041Le = hmlReviewDocumentActivity2;
        this.f5044ND = hmlReviewDocumentActivity3;
        this.f5043Lj = hmlReviewDocumentActivity4;
        this.f5042Lg = hmlReviewDocumentActivity5;
    }

    /* renamed from: or */
    public final C8468a get() {
        return new C8468a(this.f5045X.get(), this.f5041Le.get(), this.f5044ND.get(), this.f5043Lj.get(), this.f5042Lg.get());
    }

    /* renamed from: c */
    public static C8469b m5089c(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0862c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0863d> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0530i> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C7913j> hmlReviewDocumentActivity5) {
        return new C8469b(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    /* renamed from: a */
    public static C8468a m5088a(Context context, C0862c cVar, C0863d dVar, C0530i iVar, C7913j jVar) {
        return new C8468a(context, cVar, dVar, iVar, jVar);
    }
}
