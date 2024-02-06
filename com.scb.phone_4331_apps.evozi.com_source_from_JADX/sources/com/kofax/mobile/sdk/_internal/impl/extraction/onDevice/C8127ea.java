package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ea */
public final class C8127ea implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceExtractionServer> {

    /* renamed from: Mz */
    private final HmlReviewDocumentActivity<IIdExtractor> f4106Mz;

    public C8127ea(HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity) {
        this.f4106Mz = hmlReviewDocumentActivity;
    }

    /* renamed from: of */
    public final OnDeviceExtractionServer get() {
        OnDeviceExtractionServer onDeviceExtractionServer = new OnDeviceExtractionServer();
        C8128eb.m4309a(onDeviceExtractionServer, this.f4106Mz.get());
        return onDeviceExtractionServer;
    }

    /* renamed from: T */
    public static C8127ea m4306T(HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity) {
        return new C8127ea(hmlReviewDocumentActivity);
    }

    /* renamed from: og */
    public static OnDeviceExtractionServer m4307og() {
        return new OnDeviceExtractionServer();
    }
}
