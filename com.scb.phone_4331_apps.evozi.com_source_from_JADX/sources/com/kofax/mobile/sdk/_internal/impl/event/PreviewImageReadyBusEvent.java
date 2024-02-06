package com.kofax.mobile.sdk._internal.impl.event;

import android.graphics.Bitmap;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.mobile.sdk._internal.impl.C0729l;
import org.bouncycastle.crypto.tls.CipherSuite;

public class PreviewImageReadyBusEvent {

    /* renamed from: Jg */
    private int f1607Jg;
    private Bitmap bitmap;
    public final int height;
    public final byte[] imageData;
    public final int imageFormat = 17;
    public final int rotation;
    public C0729l state;
    public final int width;

    public PreviewImageReadyBusEvent(byte[] bArr, int i, int i2, int i3) {
        this.imageData = bArr;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
    }

    public void deleteBitmap() {
        this.bitmap = null;
    }

    public Bitmap getBitmap(boolean z) {
        if (z) {
            return getBitmap(this.rotation);
        }
        return getBitmap(0);
    }

    public Bitmap getBitmapLandscape() {
        return getBitmap(getRotationLandscape());
    }

    public int getRotationLandscape() {
        return m1470n(this.rotation) ? this.rotation : this.rotation - 90;
    }

    /* renamed from: n */
    private boolean m1470n(int i) {
        boolean z = false;
        boolean z2 = this.width >= this.height;
        if (i % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0) {
            z = true;
        }
        return z2 ? z : !z;
    }

    private Bitmap getBitmap(int i) {
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null) {
            this.bitmap = Utility.imageDataToBitmap(this.imageData, this.width, this.height, 17, i);
            this.f1607Jg = i;
        } else {
            int i2 = this.f1607Jg;
            if (i != i2) {
                this.bitmap = Utility.Rotate(bitmap2, (float) (i - i2));
                this.f1607Jg = i;
            }
        }
        return this.bitmap;
    }
}
