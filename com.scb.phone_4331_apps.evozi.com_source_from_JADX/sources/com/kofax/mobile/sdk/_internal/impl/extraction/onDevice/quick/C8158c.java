package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import android.graphics.Bitmap;
import com.google.android.gms.vision.Frame;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.kmc.kui.uicontrols.Utility;
import java.nio.ByteBuffer;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.c */
public class C8158c extends C8156a {
    private final byte[] data;
    private final int format = 17;

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

    public C8158c(byte[] bArr, int i, int i2, int i3) {
        super(i, i2, i3);
        this.data = bArr;
    }

    /* renamed from: qe */
    public Frame mo54559qe() {
        return new Frame.Builder().setImageData(ByteBuffer.wrap(this.data), getWidth(), getHeight(), 17).setRotation(mo54557qc()).build();
    }

    /* renamed from: qf */
    public Bitmap mo54560qf() {
        return Utility.imageDataToBitmap(this.data, getWidth(), getHeight(), 17, getRotation());
    }

    /* renamed from: qg */
    public byte[] mo54561qg() {
        return this.data;
    }
}
