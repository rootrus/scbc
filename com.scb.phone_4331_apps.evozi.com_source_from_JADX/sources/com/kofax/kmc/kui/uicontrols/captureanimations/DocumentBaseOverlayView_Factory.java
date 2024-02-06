package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.impl.view.C0735aa;
import com.kofax.mobile.sdk._internal.impl.view.C0738ac;
import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0771d;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C0773f;
import com.kofax.mobile.sdk._internal.view.C0774g;
import com.kofax.mobile.sdk._internal.view.C0777k;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class DocumentBaseOverlayView_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<DocumentBaseOverlayView> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f687X;

    /* renamed from: mW */
    private final HmlReviewDocumentActivity<C0774g> f688mW;

    /* renamed from: mX */
    private final HmlReviewDocumentActivity<C0770c> f689mX;

    /* renamed from: mY */
    private final HmlReviewDocumentActivity<C0771d> f690mY;

    /* renamed from: mZ */
    private final HmlReviewDocumentActivity<C0772e> f691mZ;

    /* renamed from: na */
    private final HmlReviewDocumentActivity<C0517g> f692na;

    /* renamed from: nb */
    private final HmlReviewDocumentActivity<C0777k> f693nb;

    /* renamed from: nc */
    private final HmlReviewDocumentActivity<C0773f> f694nc;

    public DocumentBaseOverlayView_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0774g> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0771d> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0777k> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<C0773f> hmlReviewDocumentActivity8) {
        this.f687X = hmlReviewDocumentActivity;
        this.f688mW = hmlReviewDocumentActivity2;
        this.f689mX = hmlReviewDocumentActivity3;
        this.f690mY = hmlReviewDocumentActivity4;
        this.f691mZ = hmlReviewDocumentActivity5;
        this.f692na = hmlReviewDocumentActivity6;
        this.f693nb = hmlReviewDocumentActivity7;
        this.f694nc = hmlReviewDocumentActivity8;
    }

    public final DocumentBaseOverlayView get() {
        DocumentBaseOverlayView documentBaseOverlayView = new DocumentBaseOverlayView(this.f687X.get());
        C0738ac.m1684a((C0735aa) documentBaseOverlayView, this.f688mW.get());
        C0738ac.m1680a((C0735aa) documentBaseOverlayView, this.f689mX.get());
        C0738ac.m1681a((C0735aa) documentBaseOverlayView, this.f690mY.get());
        C0738ac.m1682a((C0735aa) documentBaseOverlayView, this.f691mZ.get());
        C0738ac.m1679a((C0735aa) documentBaseOverlayView, this.f692na.get());
        C0738ac.m1685a((C0735aa) documentBaseOverlayView, this.f693nb.get());
        C0738ac.m1683a((C0735aa) documentBaseOverlayView, this.f694nc.get());
        return documentBaseOverlayView;
    }

    public static DocumentBaseOverlayView_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0774g> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0771d> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0777k> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<C0773f> hmlReviewDocumentActivity8) {
        return new DocumentBaseOverlayView_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public static DocumentBaseOverlayView newDocumentBaseOverlayView(Context context) {
        return new DocumentBaseOverlayView(context);
    }
}
