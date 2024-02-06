package com.kofax.mobile.sdk.p009ae;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;

/* renamed from: com.kofax.mobile.sdk.ae.g */
public class C0797g {

    /* renamed from: HG */
    private Bitmap f1911HG;

    /* renamed from: HH */
    private BoundingTetragon f1912HH;

    /* renamed from: HI */
    private boolean f1913HI;

    public C0797g(Bitmap bitmap, BoundingTetragon boundingTetragon, boolean z) {
        this.f1911HG = bitmap;
        this.f1912HH = boundingTetragon;
        this.f1913HI = z;
    }

    public Bitmap getProcessedImage() {
        return this.f1911HG;
    }

    public BoundingTetragon getBounds() {
        return this.f1912HH;
    }

    /* renamed from: lR */
    public boolean mo11942lR() {
        return this.f1913HI;
    }
}
