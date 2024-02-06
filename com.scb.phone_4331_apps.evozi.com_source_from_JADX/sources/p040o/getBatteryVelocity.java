package p040o;

/* renamed from: o.getBatteryVelocity */
public final class getBatteryVelocity extends getReportsEndpointFilename {
    public subscribe MediaBrowserCompat$CustomActionResultReceiver;

    public getBatteryVelocity() {
        this((Boolean) null, (subscribe) null, 3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getBatteryVelocity(Boolean bool, subscribe subscribe, int i) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : subscribe);
    }

    private getBatteryVelocity(Boolean bool, subscribe subscribe) {
        super(bool);
        this.MediaBrowserCompat$CustomActionResultReceiver = subscribe;
    }
}
