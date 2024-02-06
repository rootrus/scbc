package com.kofax.mobile.sdk.p019f;

import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.f.c */
public final class C0886c implements MileageQuantitySelectionActivity<C0884a> {

    /* renamed from: xa */
    private final HmlReviewDocumentActivity<C0890j> f2094xa;

    /* renamed from: xb */
    private final HmlReviewDocumentActivity<C0891l> f2095xb;

    /* renamed from: xc */
    private final HmlReviewDocumentActivity<C0889h> f2096xc;

    /* renamed from: xd */
    private final HmlReviewDocumentActivity<C0887d> f2097xd;

    /* renamed from: xe */
    private final HmlReviewDocumentActivity<C0888f> f2098xe;

    public C0886c(HmlReviewDocumentActivity<C0890j> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0891l> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0889h> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0887d> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0888f> hmlReviewDocumentActivity5) {
        this.f2094xa = hmlReviewDocumentActivity;
        this.f2095xb = hmlReviewDocumentActivity2;
        this.f2096xc = hmlReviewDocumentActivity3;
        this.f2097xd = hmlReviewDocumentActivity4;
        this.f2098xe = hmlReviewDocumentActivity5;
    }

    public static MileageQuantitySelectionActivity<C0884a> create(HmlReviewDocumentActivity<C0890j> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0891l> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0889h> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0887d> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0888f> hmlReviewDocumentActivity5) {
        return new C0886c(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    /* renamed from: b */
    public final void injectMembers(C0884a aVar) {
        m2289a(aVar, this.f2094xa.get());
        m2290a(aVar, this.f2095xb.get());
        m2288a(aVar, this.f2096xc.get());
        m2286a(aVar, this.f2097xd.get());
        m2287a(aVar, this.f2098xe.get());
    }

    /* renamed from: a */
    public static void m2289a(C0884a aVar, C0890j jVar) {
        aVar.f2084wV = jVar;
    }

    /* renamed from: a */
    public static void m2290a(C0884a aVar, C0891l lVar) {
        aVar.f2085wW = lVar;
    }

    /* renamed from: a */
    public static void m2288a(C0884a aVar, C0889h hVar) {
        aVar.f2086wX = hVar;
    }

    /* renamed from: a */
    public static void m2286a(C0884a aVar, C0887d dVar) {
        aVar.f2087wY = dVar;
    }

    /* renamed from: a */
    public static void m2287a(C0884a aVar, C0888f fVar) {
        aVar.f2088wZ = fVar;
    }
}
