package com.kofax.kmc.ken.engines;

import android.os.Build;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import com.kofax.mobile.sdk._internal.impl.detection.C7944e;

public class DetectionModule {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IFaceDetector mo10029a(C7944e eVar) {
        return eVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o.HmlReviewDocumentActivity, o.HmlReviewDocumentActivity<com.kofax.kmc.ken.engines.IDocumentDetector<com.kofax.kmc.ken.engines.data.DocumentDetectionSettings, com.kofax.kmc.ken.engines.data.DocumentDetectionResult>>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [o.HmlReviewDocumentActivity, o.HmlReviewDocumentActivity<com.kofax.kmc.ken.engines.IDocumentDetector<com.kofax.kmc.ken.engines.data.DocumentDetectionSettings, com.kofax.kmc.ken.engines.data.DocumentDetectionResult>>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    @p040o.HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FORCED_DOCUMENT")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.kofax.kmc.ken.engines.IDocumentDetector<com.kofax.kmc.ken.engines.data.DocumentDetectionSettings, com.kofax.kmc.ken.engines.data.DocumentDetectionResult> mo10028a(@p040o.HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FORCED_ISG_DOCUMENT") p040o.HmlReviewDocumentActivity<com.kofax.kmc.ken.engines.IDocumentDetector<com.kofax.kmc.ken.engines.data.DocumentDetectionSettings, com.kofax.kmc.ken.engines.data.DocumentDetectionResult>> r2, @p040o.HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FORCED_GPU_DOCUMENT") p040o.HmlReviewDocumentActivity<com.kofax.kmc.ken.engines.IDocumentDetector<com.kofax.kmc.ken.engines.data.DocumentDetectionSettings, com.kofax.kmc.ken.engines.data.DocumentDetectionResult>> r3) {
        /*
            r1 = this;
            boolean r0 = m106d()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r2 = r2.get()
            goto L_0x000f
        L_0x000b:
            java.lang.Object r2 = r3.get()
        L_0x000f:
            com.kofax.kmc.ken.engines.IDocumentDetector r2 = (com.kofax.kmc.ken.engines.IDocumentDetector) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.DetectionModule.mo10028a(o.HmlReviewDocumentActivity, o.HmlReviewDocumentActivity):com.kofax.kmc.ken.engines.IDocumentDetector");
    }

    /* renamed from: d */
    private static boolean m106d() {
        return Build.MODEL.equalsIgnoreCase(Utility.ASUS_ZENFONE_2E);
    }
}
