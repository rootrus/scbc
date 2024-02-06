package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.mobile.sdk.p026o.C0983c;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.kmc.ken.engines.e */
class C0441e extends C0464i implements IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> {
    @HmlPinActivity
    C0441e(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FORCED_DOCUMENT") C0983c cVar) {
        super(cVar);
    }
}
