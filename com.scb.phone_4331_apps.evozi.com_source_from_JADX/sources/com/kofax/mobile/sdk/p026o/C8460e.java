package com.kofax.mobile.sdk.p026o;

import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.mobile.sdk._internal.impl.detection.C7943b;

/* renamed from: com.kofax.mobile.sdk.o.e */
public class C8460e extends C7943b implements C0985f {
    public C8460e(byte[] bArr, int i, int i2, int i3) {
        super(bArr, i, i2, i3);
    }

    /* renamed from: a */
    public void mo12394a(DocumentTracker documentTracker) {
        documentTracker.grabVideoFrame(this._data, this._format, this._width, this._height);
    }
}
