package com.scb.phone.view.custom.debitcard;

import p040o.MerchantService;

/* renamed from: com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$CustomActionResultReceiver */
final class C8945xfa665e9d implements Runnable {
    private /* synthetic */ CustomPinWithMaxInput write;

    C8945xfa665e9d(CustomPinWithMaxInput customPinWithMaxInput) {
        this.write = customPinWithMaxInput;
    }

    public final void run() {
        MerchantService write2 = this.write.write;
        if (write2 != null) {
            write2.MediaBrowserCompat$CustomActionResultReceiver(this.write.MediaBrowserCompat$ItemReceiver.toString());
        }
    }
}
