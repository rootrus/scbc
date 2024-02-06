package p040o;

import com.scb.phone.view.custom.common.CustomDeltaInputPressed;

/* renamed from: o.getGeomarkers */
public final /* synthetic */ class getGeomarkers implements Runnable {
    private final /* synthetic */ double MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CustomDeltaInputPressed.C58111 read;

    public /* synthetic */ getGeomarkers(CustomDeltaInputPressed.C58111 r1, double d) {
        this.read = r1;
        this.MediaBrowserCompat$ItemReceiver = d;
    }

    public final void run() {
        CustomDeltaInputPressed.C58111 r0 = this.read;
        CustomDeltaInputPressed.read(CustomDeltaInputPressed.this, this.MediaBrowserCompat$ItemReceiver);
    }
}
