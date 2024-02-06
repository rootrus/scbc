package com.kofax.mobile.sdk.p084x;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8496ac;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.x.q */
public class C8626q implements C8496ac.C8498a {

    /* renamed from: QT */
    private static final String f5307QT = "Mexico (MEX) Voter Identification Card (2004) - Back (Vertical)";

    /* renamed from: QU */
    private static final String f5308QU = "Mexico (MEX) Voter Identification Card (2004) - Back";

    /* renamed from: QV */
    private Image f5309QV = null;

    /* renamed from: Qk */
    private final C7908c f5310Qk;

    @HmlPinActivity
    public C8626q(C7908c cVar) {
        this.f5310Qk = cVar;
    }

    /* renamed from: e */
    public String mo55400e(C8340a aVar) {
        return aVar.mo55128ht();
    }

    /* renamed from: f */
    public String mo55401f(C8340a aVar) {
        if (aVar.mo55131hw() != null) {
            return f5307QT;
        }
        return null;
    }

    /* renamed from: g */
    public Image mo55402g(C8340a aVar) {
        C7919g.C7920a aVar2;
        C8297a hw = aVar.mo55131hw();
        if (!f5308QU.equals(hw != null ? hw.getClassId() : null) || (aVar2 = aVar.mo55127hs().f5067NX) == null) {
            return null;
        }
        Bitmap bitmap = aVar2.getBitmap();
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f);
        Image image = new Image(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        this.f5309QV = image;
        return image;
    }

    /* renamed from: c */
    public void mo55399c(C8340a aVar, List<DataField> list, Exception exc) {
        aVar.mo55102b(exc);
        aVar.mo55141o((aVar.mo55127hs().originalImage == null || list == null || list.size() <= 0) ? false : true);
        aVar.mo55104c(this.f5310Qk.mo54313a(aVar.mo55133hy(), list));
        Image image = this.f5309QV;
        if (image != null) {
            image.imageClearBitmap();
        }
    }
}
