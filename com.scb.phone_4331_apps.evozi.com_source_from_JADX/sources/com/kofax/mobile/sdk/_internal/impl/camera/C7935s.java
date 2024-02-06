package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Bitmap;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.mobile.sdk._internal.camera.C7890l;
import com.kofax.mobile.sdk._internal.camera.C7891m;
import com.kofax.mobile.sdk._internal.camera.C7893v;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.s */
public class C7935s implements C7890l {

    /* renamed from: BA */
    private final C7893v f3676BA;

    /* renamed from: BB */
    private final C7891m f3677BB;

    @HmlPinActivity
    public C7935s(C7893v vVar, C7891m mVar) {
        this.f3676BA = vVar;
        this.f3677BB = mVar;
    }

    /* renamed from: a */
    public Bitmap mo54219a(byte[] bArr, int i, int i2, int i3) {
        if (i == 256) {
            return this.f3677BB.mo54221c(bArr);
        }
        if (i == 17) {
            return this.f3676BA.mo54223b(bArr, i2, i3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown image format: ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }

    public Bitmap imageDataToBitmap(byte[] bArr, int i, int i2, int i3, int i4) {
        return Utility.Rotate(mo54219a(bArr, i, i2, i3), (float) i4);
    }
}
