package com.kofax.mobile.sdk.p024l;

import com.kofax.kmc.ken.engines.ICheckDetector;
import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;
import com.kofax.kmc.ken.engines.data.DetectionResult;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0515d;
import com.kofax.mobile.sdk.p023k.C0962o;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.l.a */
public class C8424a extends C0966c<ICheckDetector, CheckDetectionSettings> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo11301a(C0513a aVar) {
        super.mo11301a(aVar);
    }

    @HmlPinActivity
    public C8424a(ICheckDetector iCheckDetector) {
        super(iCheckDetector, new CheckDetectionSettings());
    }

    /* renamed from: a */
    public C0515d mo11300a(PreviewFrameEvent previewFrameEvent) {
        try {
            return C8434m.m5008a((DetectionResult) ((ICheckDetector) this.f2345GV).detect((CheckDetectionSettings) this.f2346GW, previewFrameEvent.getBitmapLandscape()), previewFrameEvent, previewFrameEvent.getRotation() - previewFrameEvent.getRotationLandscape());
        } catch (IllegalArgumentException e) {
            C0767k.m1822e("Detection failed", (Throwable) new RuntimeException(e));
            return C8434m.m5011e(previewFrameEvent);
        }
    }

    public void doCleanUp() {
        ((ICheckDetector) this.f2345GV).destroy();
    }

    public double getMaxFillFraction() {
        return ((CheckDetectionSettings) this.f2346GW).getMaxFillFraction();
    }

    /* renamed from: bt */
    public C0962o mo11302bt() {
        return new C0962o(((CheckDetectionSettings) this.f2346GW).getTargetFrameAspectRatio(), ((CheckDetectionSettings) this.f2346GW).getTargetFramePaddingPercent(), ((CheckDetectionSettings) this.f2346GW).getCenterPoint());
    }
}
