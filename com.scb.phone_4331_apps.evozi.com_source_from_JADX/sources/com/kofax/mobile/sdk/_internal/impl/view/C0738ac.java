package com.kofax.mobile.sdk._internal.impl.view;

import com.kofax.mobile.sdk._internal.capture.C0517g;
import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0771d;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C0773f;
import com.kofax.mobile.sdk._internal.view.C0774g;
import com.kofax.mobile.sdk._internal.view.C0777k;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ac */
public final class C0738ac implements MileageQuantitySelectionActivity<C0735aa> {

    /* renamed from: mW */
    private final HmlReviewDocumentActivity<C0774g> f1721mW;

    /* renamed from: mX */
    private final HmlReviewDocumentActivity<C0770c> f1722mX;

    /* renamed from: mY */
    private final HmlReviewDocumentActivity<C0771d> f1723mY;

    /* renamed from: mZ */
    private final HmlReviewDocumentActivity<C0772e> f1724mZ;

    /* renamed from: na */
    private final HmlReviewDocumentActivity<C0517g> f1725na;

    /* renamed from: nb */
    private final HmlReviewDocumentActivity<C0777k> f1726nb;

    /* renamed from: nc */
    private final HmlReviewDocumentActivity<C0773f> f1727nc;

    public C0738ac(HmlReviewDocumentActivity<C0774g> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0771d> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0777k> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0773f> hmlReviewDocumentActivity7) {
        this.f1721mW = hmlReviewDocumentActivity;
        this.f1722mX = hmlReviewDocumentActivity2;
        this.f1723mY = hmlReviewDocumentActivity3;
        this.f1724mZ = hmlReviewDocumentActivity4;
        this.f1725na = hmlReviewDocumentActivity5;
        this.f1726nb = hmlReviewDocumentActivity6;
        this.f1727nc = hmlReviewDocumentActivity7;
    }

    public static MileageQuantitySelectionActivity<C0735aa> create(HmlReviewDocumentActivity<C0774g> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0771d> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0517g> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0777k> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0773f> hmlReviewDocumentActivity7) {
        return new C0738ac(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7);
    }

    /* renamed from: d */
    public final void injectMembers(C0735aa aaVar) {
        m1684a(aaVar, this.f1721mW.get());
        m1680a(aaVar, this.f1722mX.get());
        m1681a(aaVar, this.f1723mY.get());
        m1682a(aaVar, this.f1724mZ.get());
        m1679a(aaVar, this.f1725na.get());
        m1685a(aaVar, this.f1726nb.get());
        m1683a(aaVar, this.f1727nc.get());
    }

    /* renamed from: a */
    public static void m1684a(C0735aa aaVar, C0774g gVar) {
        aaVar._documentOverlayFrameView = gVar;
    }

    /* renamed from: a */
    public static void m1680a(C0735aa aaVar, C0770c cVar) {
        aaVar._captureMessagesFrameView = cVar;
    }

    /* renamed from: a */
    public static void m1681a(C0735aa aaVar, C0771d dVar) {
        aaVar._capturedImageView = dVar;
    }

    /* renamed from: a */
    public static void m1682a(C0735aa aaVar, C0772e eVar) {
        aaVar._circleAnimationView = eVar;
    }

    /* renamed from: a */
    public static void m1679a(C0735aa aaVar, C0517g gVar) {
        aaVar.f1705VR = gVar;
    }

    /* renamed from: a */
    public static void m1685a(C0735aa aaVar, C0777k kVar) {
        aaVar.f1716Xu = kVar;
    }

    /* renamed from: a */
    public static void m1683a(C0735aa aaVar, C0773f fVar) {
        aaVar._debugView = fVar;
    }
}
