package com.kofax.mobile.sdk.p076h;

import bolts.Continuation;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.p070a.C8239a;
import com.kofax.mobile.sdk.p070a.C8240b;
import java.util.Set;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk.h.c */
public class C8398c implements C8240b {

    /* renamed from: yI */
    private final C8239a f4923yI;
    /* access modifiers changed from: private */

    /* renamed from: yJ */
    public final C8239a f4924yJ;

    @HmlPinActivity
    C8398c(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ATALABAR") C8239a aVar, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "MANATEE") C8239a aVar2) {
        this.f4923yI = aVar;
        this.f4924yJ = aVar2;
    }

    /* renamed from: a */
    public Task<BarCodeResult> mo54700a(final Image image, String str, String str2, final Set<BarCodeType> set) {
        if (image == null || set.isEmpty()) {
            return Task.forResult((Object) null);
        }
        return this.f4923yI.mo54699a(image, set).continueWithTask(new Continuation<BarCodeResult, Task<BarCodeResult>>() {
            public Task<BarCodeResult> then(Task<BarCodeResult> task) throws Exception {
                return m4890a(task) ? C8398c.this.f4924yJ.mo54699a(image, set) : task;
            }

            /* renamed from: a */
            private boolean m4890a(Task<BarCodeResult> task) {
                BarCodeResult barCodeResult = (BarCodeResult) task.getResult();
                if (!task.isFaulted() && barCodeResult != null) {
                    String value = barCodeResult.getValue();
                    if (!(value == null || value.length() == 0)) {
                        return false;
                    }
                }
                return true;
            }
        });
    }
}
