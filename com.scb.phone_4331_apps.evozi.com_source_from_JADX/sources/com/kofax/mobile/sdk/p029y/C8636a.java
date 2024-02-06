package com.kofax.mobile.sdk.p029y;

import bolts.Task;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.p070a.C8239a;
import java.util.Set;

/* renamed from: com.kofax.mobile.sdk.y.a */
public class C8636a implements C8239a {

    /* renamed from: RX */
    private final C8239a f5320RX;

    public C8636a(C8239a aVar) {
        this.f5320RX = aVar;
    }

    /* renamed from: a */
    public Task<BarCodeResult> mo54699a(Image image, Set<BarCodeType> set) {
        C8660v vVar = new C8660v();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5320RX.getClass().getSimpleName());
        sb.append(".read()");
        return vVar.mo55532a(sb.toString(), this.f5320RX.mo54699a(image, set));
    }
}
