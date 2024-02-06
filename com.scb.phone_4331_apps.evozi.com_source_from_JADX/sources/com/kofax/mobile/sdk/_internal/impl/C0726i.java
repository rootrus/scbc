package com.kofax.mobile.sdk._internal.impl;

import com.kofax.mobile.sdk._internal.impl.camera.C0576d;
import com.kofax.mobile.sdk._internal.impl.camera.focus.FocusStatistics;
import com.kofax.mobile.sdk.p010af.C0801d;
import com.kofax.mobile.sdk.p010af.C0805f;
import com.kofax.mobile.sdk.p019f.C0884a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.i */
public final class C0726i implements MileageQuantitySelectionActivity<ComponentsInitAndBusRegister> {

    /* renamed from: we */
    private final HmlReviewDocumentActivity<C0732o> f1680we;

    /* renamed from: wf */
    private final HmlReviewDocumentActivity<C0533aa> f1681wf;

    /* renamed from: wg */
    private final HmlReviewDocumentActivity<C0730m> f1682wg;

    /* renamed from: wh */
    private final HmlReviewDocumentActivity<C0884a> f1683wh;

    /* renamed from: wi */
    private final HmlReviewDocumentActivity<C0801d> f1684wi;

    /* renamed from: wj */
    private final HmlReviewDocumentActivity<C0805f> f1685wj;

    /* renamed from: wk */
    private final HmlReviewDocumentActivity<C0576d> f1686wk;

    /* renamed from: wl */
    private final HmlReviewDocumentActivity<FocusStatistics> f1687wl;

    public C0726i(HmlReviewDocumentActivity<C0732o> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0533aa> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0730m> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0884a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0801d> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0805f> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0576d> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<FocusStatistics> hmlReviewDocumentActivity8) {
        this.f1680we = hmlReviewDocumentActivity;
        this.f1681wf = hmlReviewDocumentActivity2;
        this.f1682wg = hmlReviewDocumentActivity3;
        this.f1683wh = hmlReviewDocumentActivity4;
        this.f1684wi = hmlReviewDocumentActivity5;
        this.f1685wj = hmlReviewDocumentActivity6;
        this.f1686wk = hmlReviewDocumentActivity7;
        this.f1687wl = hmlReviewDocumentActivity8;
    }

    public static MileageQuantitySelectionActivity<ComponentsInitAndBusRegister> create(HmlReviewDocumentActivity<C0732o> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0533aa> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0730m> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0884a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0801d> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0805f> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0576d> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<FocusStatistics> hmlReviewDocumentActivity8) {
        return new C0726i(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    /* renamed from: b */
    public final void injectMembers(ComponentsInitAndBusRegister componentsInitAndBusRegister) {
        m1643a(componentsInitAndBusRegister, this.f1680we.get());
        m1639a(componentsInitAndBusRegister, this.f1681wf.get());
        m1642a(componentsInitAndBusRegister, this.f1682wg.get());
        m1646a(componentsInitAndBusRegister, this.f1683wh.get());
        m1644a(componentsInitAndBusRegister, this.f1684wi.get());
        m1645a(componentsInitAndBusRegister, this.f1685wj.get());
        m1640a(componentsInitAndBusRegister, this.f1686wk.get());
        m1641a(componentsInitAndBusRegister, this.f1687wl.get());
    }

    /* renamed from: a */
    public static void m1643a(ComponentsInitAndBusRegister componentsInitAndBusRegister, C0732o oVar) {
        componentsInitAndBusRegister.f1179vW = oVar;
    }

    /* renamed from: a */
    public static void m1639a(ComponentsInitAndBusRegister componentsInitAndBusRegister, C0533aa aaVar) {
        componentsInitAndBusRegister.f1180vX = aaVar;
    }

    /* renamed from: a */
    public static void m1642a(ComponentsInitAndBusRegister componentsInitAndBusRegister, C0730m mVar) {
        componentsInitAndBusRegister.f1181vY = mVar;
    }

    /* renamed from: a */
    public static void m1646a(ComponentsInitAndBusRegister componentsInitAndBusRegister, C0884a aVar) {
        componentsInitAndBusRegister.f1182vZ = aVar;
    }

    /* renamed from: a */
    public static void m1644a(ComponentsInitAndBusRegister componentsInitAndBusRegister, C0801d dVar) {
        componentsInitAndBusRegister.f1183wa = dVar;
    }

    /* renamed from: a */
    public static void m1645a(ComponentsInitAndBusRegister componentsInitAndBusRegister, C0805f fVar) {
        componentsInitAndBusRegister.f1184wb = fVar;
    }

    /* renamed from: a */
    public static void m1640a(ComponentsInitAndBusRegister componentsInitAndBusRegister, C0576d dVar) {
        componentsInitAndBusRegister.f1185wc = dVar;
    }

    /* renamed from: a */
    public static void m1641a(ComponentsInitAndBusRegister componentsInitAndBusRegister, FocusStatistics focusStatistics) {
        componentsInitAndBusRegister.f1186wd = focusStatistics;
    }
}
