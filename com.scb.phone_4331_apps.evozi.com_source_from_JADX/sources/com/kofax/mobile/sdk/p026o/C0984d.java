package com.kofax.mobile.sdk.p026o;

import android.graphics.Bitmap;
import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.mobile.sdk._internal.impl.detection.C0668a;

/* renamed from: com.kofax.mobile.sdk.o.d */
public class C0984d extends C0668a implements C0985f {
    public C0984d(Bitmap bitmap) {
        super(bitmap);
    }

    /* renamed from: a */
    public void mo12394a(DocumentTracker documentTracker) {
        documentTracker.grabImageFrame(this._bitmap);
    }
}
