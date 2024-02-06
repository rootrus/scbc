package com.kofax.mobile.sdk._internal.impl;

import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C7898e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.kofax.mobile.sdk._internal.impl.q */
public class C8190q implements C7898e {

    /* renamed from: wC */
    private static final Map<String, C8192a> f4240wC = new HashMap();

    /* renamed from: com.kofax.mobile.sdk._internal.impl.q$a */
    static class C8192a {

        /* renamed from: dC */
        Rect f4241dC;

        /* renamed from: wD */
        Image.ImageMimeType f4242wD;

        /* renamed from: wE */
        int f4243wE;

        /* renamed from: wF */
        Image.OutputColor f4244wF;

        private C8192a() {
        }
    }

    /* renamed from: a */
    public void mo54258a(String str, Image.ImageMimeType imageMimeType) {
        C8192a aVar = f4240wC.get(str);
        if (aVar == null) {
            aVar = new C8192a();
        }
        aVar.f4242wD = imageMimeType;
        f4240wC.put(str, aVar);
    }

    /* renamed from: x */
    public Image.ImageMimeType mo54260x(String str) {
        C8192a aVar = f4240wC.get(str);
        return aVar != null ? aVar.f4242wD : Image.ImageMimeType.MIMETYPE_UNKNOWN;
    }

    /* renamed from: a */
    public void mo54256a(String str, int i) {
        C8192a aVar = f4240wC.get(str);
        if (aVar == null) {
            aVar = new C8192a();
        }
        aVar.f4243wE = i;
        f4240wC.put(str, aVar);
    }

    /* renamed from: y */
    public int mo54261y(String str) {
        C8192a aVar = f4240wC.get(str);
        if (aVar != null) {
            return aVar.f4243wE;
        }
        return 72;
    }

    /* renamed from: z */
    public Image.OutputColor mo54262z(String str) {
        C8192a aVar = f4240wC.get(str);
        return aVar != null ? aVar.f4244wF : Image.OutputColor.BITDEPTH_COLOR;
    }

    /* renamed from: a */
    public void mo54259a(String str, Image.OutputColor outputColor) {
        C8192a aVar = f4240wC.get(str);
        if (aVar == null) {
            aVar = new C8192a();
        }
        aVar.f4244wF = outputColor;
        f4240wC.put(str, aVar);
    }

    /* renamed from: A */
    public Rect mo54255A(String str) {
        C8192a aVar = f4240wC.get(str);
        if (aVar != null) {
            return aVar.f4241dC;
        }
        return null;
    }

    /* renamed from: a */
    public void mo54257a(String str, Rect rect) {
        C8192a aVar = f4240wC.get(str);
        if (aVar == null) {
            aVar = new C8192a();
        }
        aVar.f4241dC = rect;
        f4240wC.put(str, aVar);
    }
}
