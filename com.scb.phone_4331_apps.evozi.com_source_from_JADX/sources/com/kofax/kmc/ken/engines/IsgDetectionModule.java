package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlRepaymentMethodAboutActivity;

public class IsgDetectionModule {
    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FORCED_ISG_DOCUMENT")
    /* renamed from: a */
    public IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> mo10103a(C0441e eVar) {
        return eVar;
    }

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ISG_DOCUMENT")
    /* renamed from: a */
    public IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> mo10104a(C0464i iVar) {
        return iVar;
    }
}
