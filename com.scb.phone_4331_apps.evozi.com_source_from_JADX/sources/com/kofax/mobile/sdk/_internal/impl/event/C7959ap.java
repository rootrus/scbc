package com.kofax.mobile.sdk._internal.impl.event;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.mobile.sdk._internal.impl.C0729l;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.ap */
public final class C7959ap {

    /* renamed from: Jd */
    public final Bitmap f3713Jd;

    /* renamed from: Je */
    public final BoundingTetragon f3714Je;

    /* renamed from: Jf */
    public final boolean f3715Jf;
    public C0729l state;

    public C7959ap() {
        this((Bitmap) null, (BoundingTetragon) null, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7959ap(Bitmap bitmap, BoundingTetragon boundingTetragon) {
        this(bitmap, boundingTetragon, boundingTetragon != null);
    }

    public C7959ap(Bitmap bitmap, BoundingTetragon boundingTetragon, boolean z) {
        this.f3713Jd = bitmap;
        this.f3714Je = boundingTetragon;
        this.f3715Jf = z;
    }
}
