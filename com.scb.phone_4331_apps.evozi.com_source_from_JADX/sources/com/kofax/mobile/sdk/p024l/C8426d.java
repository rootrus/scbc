package com.kofax.mobile.sdk.p024l;

import com.kofax.kmc.ken.engines.data.FixedAspectRatioDetectionSettings;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0515d;
import com.kofax.mobile.sdk._internal.impl.detection.FixedAspectRatioDetector;
import com.kofax.mobile.sdk.p023k.C0962o;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.l.d */
public class C8426d extends C0966c<FixedAspectRatioDetector, FixedAspectRatioDetectionSettings> {
    public double getMaxFillFraction() {
        return 1.3d;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo11301a(C0513a aVar) {
        super.mo11301a(aVar);
    }

    @HmlPinActivity
    public C8426d(FixedAspectRatioDetector fixedAspectRatioDetector) {
        super(fixedAspectRatioDetector, new FixedAspectRatioDetectionSettings());
    }

    /* renamed from: a */
    public C0515d mo11300a(PreviewFrameEvent previewFrameEvent) {
        try {
            return C8434m.m5010a(((FixedAspectRatioDetector) this.f2345GV).detect((FixedAspectRatioDetectionSettings) this.f2346GW, previewFrameEvent.getData(), previewFrameEvent.getWidth(), previewFrameEvent.getHeight()), previewFrameEvent, previewFrameEvent.getRotation() - previewFrameEvent.getRotationLandscape());
        } catch (IllegalArgumentException e) {
            C0767k.m1822e("Detection failed", (Throwable) new RuntimeException(e));
            return C8434m.m5011e(previewFrameEvent);
        }
    }

    public void doCleanUp() {
        ((FixedAspectRatioDetector) this.f2345GV).doCleanUp();
    }

    /* renamed from: bt */
    public C0962o mo11302bt() {
        return new C0962o(((FixedAspectRatioDetectionSettings) this.f2346GW).getTargetFrameAspectRatio(), ((FixedAspectRatioDetectionSettings) this.f2346GW).getTargetFramePaddingPercent(), ((FixedAspectRatioDetectionSettings) this.f2346GW).getCenterPoint());
    }
}
