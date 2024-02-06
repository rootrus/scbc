package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.android.abc.machine_vision.CaptureGuidance;
import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.kut.utilities.RectUtil;
import com.kofax.mobile.sdk._internal.impl.detection.Frame;
import com.kofax.mobile.sdk.p026o.C0983c;
import com.kofax.mobile.sdk.p026o.C0984d;
import com.kofax.mobile.sdk.p026o.C0985f;
import com.kofax.mobile.sdk.p026o.C8460e;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.kmc.ken.engines.i */
class C0464i implements IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> {

    /* renamed from: T */
    private final IBoundingRectCalculator f514T;

    /* renamed from: ae */
    private final IOrientationGuidanceCalculator f515ae;

    /* renamed from: bI */
    private final C0983c f516bI;

    @HmlPinActivity
    C0464i(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DOCUMENT") C0983c cVar) {
        C0433a aVar = new C0433a();
        this.f514T = aVar;
        this.f515ae = new C0466l(aVar);
        this.f516bI = cVar;
    }

    public DocumentDetectionResult detect(DocumentDetectionSettings documentDetectionSettings, Bitmap bitmap) {
        return m402a(documentDetectionSettings, new C0984d(bitmap));
    }

    public DocumentDetectionResult detect(DocumentDetectionSettings documentDetectionSettings, byte[] bArr, int i, int i2) {
        return m402a(documentDetectionSettings, new C8460e(bArr, 17, i, i2));
    }

    public void destroy() {
        this.f516bI.destroy();
    }

    /* renamed from: a */
    private DocumentDetectionResult m402a(DocumentDetectionSettings documentDetectionSettings, C0985f fVar) {
        TrackedDocument a = this.f516bI.mo12371a(fVar);
        if (a == null) {
            return null;
        }
        return m401a(documentDetectionSettings, fVar, a);
    }

    /* renamed from: a */
    private C0435c m401a(DocumentDetectionSettings documentDetectionSettings, Frame frame, TrackedDocument trackedDocument) {
        return new C0435c(RectUtil.createTargetRect(documentDetectionSettings.getTargetFramePaddingPercent(), documentDetectionSettings.getTargetFrameAspectRatio(), documentDetectionSettings.getCenterPoint(), frame.getWidth(), frame.getHeight()), trackedDocument.Boundary().Corners(), frame, new C0465k(new CaptureGuidance(trackedDocument, CaptureGuidance.GuidanceSource.BEST_RECTANGLE)), documentDetectionSettings, this.f514T, this.f515ae);
    }
}
