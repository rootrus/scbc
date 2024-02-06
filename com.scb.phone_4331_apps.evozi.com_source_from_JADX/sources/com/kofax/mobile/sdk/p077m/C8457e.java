package com.kofax.mobile.sdk.p077m;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.android.abc.image_classification.ResultPair;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p073c.C8298b;
import com.kofax.mobile.sdk.p073c.C8299c;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.m.e */
public class C8457e implements C8299c {

    /* renamed from: Hi */
    private final C8298b f5028Hi;

    /* renamed from: wM */
    private final C7919g f5029wM;

    @HmlPinActivity
    C8457e(C8298b bVar, C7919g gVar) {
        this.f5028Hi = bVar;
        this.f5029wM = gVar;
    }

    /* renamed from: a */
    public C8297a mo54764a(String str, Image image) {
        synchronized (this) {
            List<ResultPair> c = m5078c(str, image);
            m5079p(c);
            ResultPair resultPair = c.get(0);
            if (resultPair.confidence <= BitmapDescriptorFactory.HUE_RED && !m5080q(c)) {
                return null;
            }
            C8458a aVar = new C8458a(resultPair);
            return aVar;
        }
    }

    /* renamed from: com.kofax.mobile.sdk.m.e$a */
    class C8458a implements C8297a {

        /* renamed from: Hj */
        private final float f5030Hj;

        /* renamed from: ah */
        private final String f5032ah;

        C8458a(ResultPair resultPair) {
            this.f5032ah = resultPair.classID;
            this.f5030Hj = resultPair.confidence;
        }

        public String getClassId() {
            return this.f5032ah;
        }

        public float getConfidence() {
            return this.f5030Hj;
        }
    }

    /* renamed from: c */
    private List<ResultPair> m5078c(String str, Image image) {
        C7919g.C7920a w = this.f5029wM.mo54325w(image);
        try {
            return this.f5028Hi.mo54763a(str, w.getBitmap(), 2);
        } finally {
            w.mo54326be();
        }
    }

    /* renamed from: p */
    private void m5079p(List<ResultPair> list) {
        if (list == null || list.size() <= 0) {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_INVALID_IMAGE_SUPPLIED);
        }
    }

    /* renamed from: q */
    private static boolean m5080q(List<ResultPair> list) {
        return list.size() >= 2 && list.get(0).confidence - list.get(1).confidence > 0.2f;
    }
}
