package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import bolts.Task;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import java.util.Set;
import java.util.concurrent.Callable;

public class BufferedQuickBarcodeExtractor {
    /* access modifiers changed from: private */

    /* renamed from: RF */
    public final C8164i f4174RF = new C8164i();
    /* access modifiers changed from: private */

    /* renamed from: RG */
    public final C8159d f4175RG;

    public BufferedQuickBarcodeExtractor(Set<BarCodeType> set) {
        this.f4175RG = new C8159d(set);
    }

    public void destroy() {
        this.f4175RG.destroy();
    }

    public Task<C8161f> extract(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        this.f4174RF.mo54571g(previewImageReadyBusEvent);
        return Task.callInBackground(new Callable<C8161f>() {
            /* renamed from: qh */
            public C8161f call() {
                return BufferedQuickBarcodeExtractor.this.f4175RG.mo54562a(BufferedQuickBarcodeExtractor.this.f4174RF.mo54575qk());
            }
        });
    }
}
