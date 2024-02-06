package com.kofax.mobile.sdk._internal.impl.extraction;

import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk._internal.extraction.C7901c;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.d */
public class C7988d implements C7901c {

    /* renamed from: Js */
    private C7900b f3735Js;

    @HmlPinActivity
    public C7988d(C7900b bVar) {
        this.f3735Js = bVar;
    }

    /* renamed from: P */
    public ImageProcessor mo54271P(String str) {
        ImagePerfectionProfile O = this.f3735Js.mo54270O(str);
        ImageProcessor imageProcessor = new ImageProcessor();
        imageProcessor.setImagePerfectionProfile(O);
        return imageProcessor;
    }

    /* renamed from: d */
    public ImageProcessor mo54272d(ImagePerfectionProfile imagePerfectionProfile) {
        ImageProcessor imageProcessor = new ImageProcessor();
        imageProcessor.setImagePerfectionProfile(imagePerfectionProfile);
        return imageProcessor;
    }
}
