package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import android.content.Context;
import bolts.Task;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk.extract.p018id.QuickExtractorSettings;
import java.util.concurrent.Callable;

public class BufferedQuickFaceExtractor {
    /* access modifiers changed from: private */

    /* renamed from: RF */
    public final C8164i f4177RF = new C8164i();
    /* access modifiers changed from: private */

    /* renamed from: RI */
    public final C8162g f4178RI;

    public BufferedQuickFaceExtractor(Context context, QuickExtractorSettings quickExtractorSettings) {
        this.f4178RI = new C8162g(context, quickExtractorSettings);
    }

    public Task<C8161f> extract(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        this.f4177RF.mo54571g(previewImageReadyBusEvent);
        return Task.callInBackground(new Callable<C8161f>() {
            /* renamed from: qh */
            public C8161f call() {
                return BufferedQuickFaceExtractor.this.f4178RI.mo54567a(BufferedQuickFaceExtractor.this.f4177RF.mo54575qk());
            }
        });
    }

    public void destroy() {
        this.f4178RI.destroy();
    }
}
