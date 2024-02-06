package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import bolts.Task;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import java.util.concurrent.Callable;

public class BufferedQuickMrzExtractor {
    /* access modifiers changed from: private */

    /* renamed from: RF */
    public final C8164i f4180RF = new C8164i();
    /* access modifiers changed from: private */

    /* renamed from: RK */
    public final C8163h f4181RK = new C8163h();

    public void destroy() {
        this.f4181RK.destroy();
    }

    public Task<C8161f> extract(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        this.f4180RF.mo54571g(previewImageReadyBusEvent);
        return Task.callInBackground(new Callable<C8161f>() {
            /* renamed from: qh */
            public C8161f call() {
                return BufferedQuickMrzExtractor.this.f4181RK.mo54569a(BufferedQuickMrzExtractor.this.f4180RF.mo54575qk());
            }
        });
    }
}
