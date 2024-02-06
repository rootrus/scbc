package p040o;

import com.scb.phone.view.custom.common.CustomDeltaInputPressed;

/* renamed from: o.verifyFastPayTransfer */
public final /* synthetic */ class verifyFastPayTransfer implements Runnable {
    private final /* synthetic */ CustomDeltaInputPressed.C58111 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ double read;

    public /* synthetic */ verifyFastPayTransfer(CustomDeltaInputPressed.C58111 r1, double d) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.read = d;
    }

    public final void run() {
        CustomDeltaInputPressed.C58111 r0 = this.MediaBrowserCompat$ItemReceiver;
        CustomDeltaInputPressed.IconCompatParcelizer(CustomDeltaInputPressed.this, this.read);
    }
}
