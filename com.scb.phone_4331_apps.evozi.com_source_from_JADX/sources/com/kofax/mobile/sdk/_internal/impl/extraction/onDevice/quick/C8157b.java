package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import android.graphics.Bitmap;
import com.google.android.gms.vision.Frame;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.kmc.kui.uicontrols.Utility;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.b */
public class C8157b extends C8156a {

    /* renamed from: RE */
    private byte[] f4183RE = null;
    private final Bitmap bitmap;

    public /* bridge */ /* synthetic */ int getHeight() {
        return super.getHeight();
    }

    public /* bridge */ /* synthetic */ int getRotation() {
        return super.getRotation();
    }

    public /* bridge */ /* synthetic */ int getWidth() {
        return super.getWidth();
    }

    /* renamed from: qd */
    public /* bridge */ /* synthetic */ VrsImage mo54558qd() {
        return super.mo54558qd();
    }

    public C8157b(Bitmap bitmap2, int i) {
        super(bitmap2.getWidth(), bitmap2.getHeight(), i);
        this.bitmap = bitmap2;
    }

    /* renamed from: qe */
    public Frame mo54559qe() {
        return new Frame.Builder().setBitmap(this.bitmap).setRotation(mo54557qc()).build();
    }

    /* renamed from: qf */
    public Bitmap mo54560qf() {
        return Utility.createBitmap(this.bitmap, getRotation());
    }

    /* renamed from: qg */
    public byte[] mo54561qg() {
        byte[] bArr;
        synchronized (this) {
            if (this.f4183RE == null) {
                this.f4183RE = Utility.imageToGray(this.bitmap);
            }
            bArr = this.f4183RE;
        }
        return bArr;
    }
}
