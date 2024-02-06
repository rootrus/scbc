package com.kofax.mobile.sdk.p024l;

import android.util.Pair;
import com.kofax.kmc.ken.engines.DocumentDetector;
import com.kofax.kmc.ken.engines.data.DetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0515d;
import com.kofax.mobile.sdk.p023k.C0962o;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.l.f */
public class C0967f extends C0966c<DocumentDetector, DocumentDetectionSettings> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo11301a(C0513a aVar) {
        super.mo11301a(aVar);
    }

    @HmlPinActivity
    public C0967f(DocumentDetector documentDetector) {
        super(documentDetector, new DocumentDetectionSettings());
    }

    /* renamed from: a */
    public C0515d mo11300a(PreviewFrameEvent previewFrameEvent) {
        try {
            Pair<DetectionResult, Integer> c = m2513c(previewFrameEvent);
            return C8434m.m5008a((DetectionResult) c.first, previewFrameEvent, ((Integer) c.second).intValue());
        } catch (IllegalArgumentException e) {
            C0767k.m1822e("Detection failed", (Throwable) new RuntimeException(e));
            return C8434m.m5011e(previewFrameEvent);
        }
    }

    /* renamed from: c */
    private Pair<DetectionResult, Integer> m2513c(PreviewFrameEvent previewFrameEvent) {
        try {
            return m2514d(previewFrameEvent);
        } catch (IllegalArgumentException e) {
            C0767k.m1822e("Detection failed", (Throwable) new RuntimeException(e));
            return new Pair<>((Object) null, Integer.valueOf(previewFrameEvent.getRotation()));
        }
    }

    /* renamed from: d */
    private Pair<DetectionResult, Integer> m2514d(PreviewFrameEvent previewFrameEvent) {
        int i;
        DocumentDetectionResult documentDetectionResult;
        if (m2515lG()) {
            documentDetectionResult = ((DocumentDetector) this.f2345GV).detect((DocumentDetectionSettings) this.f2346GW, previewFrameEvent.getBitmapLandscape());
            i = previewFrameEvent.getRotation() - previewFrameEvent.getRotationLandscape();
        } else {
            documentDetectionResult = ((DocumentDetector) this.f2345GV).detect((DocumentDetectionSettings) this.f2346GW, previewFrameEvent.getData(), previewFrameEvent.getWidth(), previewFrameEvent.getHeight());
            i = previewFrameEvent.getRotation();
        }
        return new Pair<>(documentDetectionResult, Integer.valueOf(i));
    }

    /* renamed from: lG */
    private boolean m2515lG() {
        return DocumentDetectionSettings.DocumentEdgeDetection.ISG.equals(((DocumentDetectionSettings) this.f2346GW).getEdgeDetection());
    }

    public void doCleanUp() {
        ((DocumentDetector) this.f2345GV).destroy();
    }

    public double getMaxFillFraction() {
        return ((DocumentDetectionSettings) this.f2346GW).getMaxFillFraction();
    }

    /* renamed from: bt */
    public C0962o mo11302bt() {
        return new C0962o(((DocumentDetectionSettings) this.f2346GW).getTargetFrameAspectRatio(), ((DocumentDetectionSettings) this.f2346GW).getTargetFramePaddingPercent(), ((DocumentDetectionSettings) this.f2346GW).getCenterPoint());
    }
}
