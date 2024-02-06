package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.f */
public class C8161f {

    /* renamed from: RP */
    private final Bitmap f4187RP;

    /* renamed from: RQ */
    private final Bitmap f4188RQ;

    /* renamed from: iI */
    private final List<DataField> f4189iI;

    C8161f(List<DataField> list, Bitmap bitmap) {
        Object[] objArr = new Object[0];
        if (list != null) {
            this.f4189iI = list;
            this.f4187RP = null;
            Object[] objArr2 = new Object[0];
            if (bitmap != null) {
                this.f4188RQ = bitmap;
                return;
            }
            throw new NullPointerException(String.format("The validated object is null", objArr2));
        }
        throw new NullPointerException(String.format("The validated object is null", objArr));
    }

    C8161f(Bitmap bitmap, Bitmap bitmap2) {
        this.f4189iI = null;
        this.f4187RP = bitmap;
        Object[] objArr = new Object[0];
        if (bitmap2 != null) {
            this.f4188RQ = bitmap2;
            return;
        }
        throw new NullPointerException(String.format("The validated object is null", objArr));
    }

    public List<DataField> getFields() {
        return this.f4189iI;
    }

    /* renamed from: qi */
    public Image mo54565qi() {
        if (this.f4187RP == null) {
            return null;
        }
        return new Image(this.f4187RP);
    }

    /* renamed from: qj */
    public Image mo54566qj() {
        return new Image(this.f4188RQ);
    }
}
