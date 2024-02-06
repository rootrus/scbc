package com.kofax.mobile.sdk.p029y;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk.p029y.C8660v;
import com.kofax.mobile.sdk.p030z.C1012a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.y.t */
public class C8656t implements C7916m {
    /* access modifiers changed from: private */

    /* renamed from: Sy */
    public final C7916m f5354Sy;

    @HmlPinActivity
    public C8656t(@C1012a C7916m mVar) {
        this.f5354Sy = mVar;
    }

    /* renamed from: b */
    public Image mo54322b(final String str, final Image image) {
        return (Image) new C8660v().mo55533a("ImageProcessor.processImage()", new C8660v.C8662a<Image>() {
            /* renamed from: qC */
            public Image run() {
                return C8656t.this.f5354Sy.mo54322b(str, image);
            }
        });
    }

    /* renamed from: a */
    public Image mo54321a(final ImagePerfectionProfile imagePerfectionProfile, final Image image) {
        return (Image) new C8660v().mo55533a("ImageProcessor.processImage()", new C8660v.C8662a<Image>() {
            /* renamed from: qC */
            public Image run() {
                return C8656t.this.f5354Sy.mo54321a(imagePerfectionProfile, image);
            }
        });
    }
}
