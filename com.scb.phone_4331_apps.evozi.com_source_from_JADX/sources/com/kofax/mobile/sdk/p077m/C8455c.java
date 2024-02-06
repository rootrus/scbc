package com.kofax.mobile.sdk.p077m;

import android.graphics.Bitmap;
import com.kofax.android.abc.image_classification.ImageClassifier;
import com.kofax.android.abc.image_classification.ResultPair;
import com.kofax.mobile.sdk.p073c.C8298b;
import com.kofax.mobile.sdk.p073c.C8300d;
import java.util.List;
import java.util.Vector;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.m.c */
public class C8455c implements C8298b {

    /* renamed from: Hg */
    private final C8300d f5026Hg;

    @HmlPinActivity
    C8455c(C8300d dVar) {
        this.f5026Hg = dVar;
    }

    /* renamed from: a */
    public List<ResultPair> mo54763a(String str, Bitmap bitmap, int i) {
        Vector<ResultPair> classificationResults;
        synchronized (this) {
            ImageClassifier N = this.f5026Hg.mo54765N(str);
            N.classify(bitmap, i);
            classificationResults = N.getClassificationResults();
            N.dispose();
        }
        return classificationResults;
    }
}
