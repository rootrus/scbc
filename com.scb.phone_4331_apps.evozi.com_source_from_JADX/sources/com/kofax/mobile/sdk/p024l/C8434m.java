package com.kofax.mobile.sdk.p024l;

import com.kofax.kmc.ken.engines.data.DetectionResult;
import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.mobile.sdk._internal.capture.C0515d;
import com.kofax.mobile.sdk._internal.impl.detection.data.FixedAspectRatioDetectionResult;
import com.kofax.mobile.sdk.p023k.C8408a;

/* renamed from: com.kofax.mobile.sdk.l.m */
public class C8434m {
    /* renamed from: a */
    public static C0515d m5009a(PreviewFrameEvent previewFrameEvent, int i) {
        return new C8433l(previewFrameEvent.getWidth(), previewFrameEvent.getHeight(), i);
    }

    /* renamed from: e */
    public static C0515d m5011e(PreviewFrameEvent previewFrameEvent) {
        return new C8433l(previewFrameEvent.getWidth(), previewFrameEvent.getHeight(), previewFrameEvent.getRotation());
    }

    /* renamed from: a */
    public static C0515d m5008a(DetectionResult detectionResult, PreviewFrameEvent previewFrameEvent, int i) {
        if (detectionResult == null) {
            return m5009a(previewFrameEvent, i);
        }
        return new C8432k(detectionResult, new C8408a(detectionResult.getBounds(), previewFrameEvent.getWidth(), previewFrameEvent.getHeight(), i));
    }

    /* renamed from: a */
    public static C0515d m5010a(FixedAspectRatioDetectionResult fixedAspectRatioDetectionResult, PreviewFrameEvent previewFrameEvent, int i) {
        if (fixedAspectRatioDetectionResult == null) {
            return m5009a(previewFrameEvent, i);
        }
        return new C8435n(fixedAspectRatioDetectionResult, new C8408a(fixedAspectRatioDetectionResult.getBounds(), previewFrameEvent.getWidth(), previewFrameEvent.getHeight(), i));
    }
}
