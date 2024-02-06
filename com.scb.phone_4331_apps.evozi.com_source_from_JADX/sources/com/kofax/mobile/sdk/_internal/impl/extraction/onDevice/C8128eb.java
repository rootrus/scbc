package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.eb */
public final class C8128eb implements MileageQuantitySelectionActivity<OnDeviceExtractionServer> {

    /* renamed from: Mz */
    private final HmlReviewDocumentActivity<IIdExtractor> f4107Mz;

    public C8128eb(HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity) {
        this.f4107Mz = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<OnDeviceExtractionServer> create(HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity) {
        return new C8128eb(hmlReviewDocumentActivity);
    }

    /* renamed from: b */
    public final void injectMembers(OnDeviceExtractionServer onDeviceExtractionServer) {
        m4309a(onDeviceExtractionServer, this.f4107Mz.get());
    }

    /* renamed from: a */
    public static void m4309a(OnDeviceExtractionServer onDeviceExtractionServer, IIdExtractor iIdExtractor) {
        onDeviceExtractionServer.f3854Mn = iIdExtractor;
    }
}
