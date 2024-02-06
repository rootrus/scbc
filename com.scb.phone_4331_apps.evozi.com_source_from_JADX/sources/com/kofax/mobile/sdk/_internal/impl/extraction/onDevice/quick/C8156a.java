package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import com.kofax.android.abc.vrs.VrsImage;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.a */
abstract class C8156a implements C8160e {
    private final int height;
    private final int rotation;
    private final int width;

    C8156a(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.rotation = i3;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRotation() {
        return this.rotation;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qc */
    public int mo54557qc() {
        int rotation2 = getRotation();
        if (rotation2 == 0) {
            return 0;
        }
        if (rotation2 == 90) {
            return 1;
        }
        if (rotation2 == 180) {
            return 2;
        }
        if (rotation2 == 270) {
            return 3;
        }
        throw new IllegalStateException();
    }

    /* renamed from: qd */
    public VrsImage mo54558qd() {
        byte[] qg = mo54561qg();
        VrsImage vrsImage = new VrsImage();
        try {
            vrsImage.fromGrayscale(qg, getWidth(), getHeight(), 0);
            return vrsImage;
        } catch (Throwable th) {
            vrsImage.dispose();
            throw th;
        }
    }
}
