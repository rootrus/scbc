package com.kofax.mobile.sdk.p077m;

import com.kofax.android.abc.image_classification.ImageClassifier;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.p016b.C8296b;
import com.kofax.mobile.sdk.p073c.C8300d;
import java.io.File;
import p040o.HmlPinActivity;
import p040o.HmlReviewDocumentActivity;

/* renamed from: com.kofax.mobile.sdk.m.a */
public class C8453a implements C8300d {

    /* renamed from: Hc */
    private final C8296b f5022Hc;

    /* renamed from: Hd */
    private final HmlReviewDocumentActivity<ImageClassifier> f5023Hd;

    @HmlPinActivity
    public C8453a(C8296b bVar, HmlReviewDocumentActivity<ImageClassifier> hmlReviewDocumentActivity) {
        this.f5022Hc = bVar;
        this.f5023Hd = hmlReviewDocumentActivity;
    }

    /* renamed from: N */
    public ImageClassifier mo54765N(String str) {
        ImageClassifier imageClassifier = this.f5023Hd.get();
        m5068a(str, imageClassifier);
        return imageClassifier;
    }

    /* renamed from: a */
    private void m5068a(String str, ImageClassifier imageClassifier) {
        String ak = m5070ak(str);
        String aj = m5069aj(str);
        imageClassifier.loadConfigurationFile(ak);
        imageClassifier.loadModel(aj);
    }

    /* renamed from: aj */
    private String m5069aj(String str) {
        File I = this.f5022Hc.mo54760I(str);
        if (I != null && I.exists()) {
            return I.getAbsolutePath();
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_CL_MODEL_NULL);
    }

    /* renamed from: ak */
    private String m5070ak(String str) {
        File H = this.f5022Hc.mo54759H(str);
        if (H != null && H.exists()) {
            return H.getAbsolutePath();
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_CL_CONFIG_NULL);
    }
}
