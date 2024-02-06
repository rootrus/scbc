package com.kofax.mobile.sdk.p081u;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C7919g;

/* renamed from: com.kofax.mobile.sdk.u.b */
public class C8478b {

    /* renamed from: NV */
    public C7919g.C7920a f5065NV;

    /* renamed from: NW */
    public Image f5066NW;

    /* renamed from: NX */
    public C7919g.C7920a f5067NX;
    public Image originalImage;

    public C8478b(Image image) {
        this.originalImage = image;
    }

    /* renamed from: ow */
    public void mo55385ow() {
        C7919g.C7920a aVar = this.f5065NV;
        if (aVar != null) {
            aVar.mo54326be();
        }
        C7919g.C7920a aVar2 = this.f5067NX;
        if (aVar2 != null) {
            aVar2.mo54326be();
        }
    }
}
