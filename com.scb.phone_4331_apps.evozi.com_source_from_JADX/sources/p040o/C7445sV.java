package p040o;

/* renamed from: o.sV */
public final /* synthetic */ class C7445sV implements Runnable {
    private final /* synthetic */ sE$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7445sV(sE$MediaBrowserCompat$ItemReceiver se_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = se_mediabrowsercompat_itemreceiver;
    }

    public final void run() {
        C7430sE sEVar = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        C5209ra raVar = C5209ra.MediaBrowserCompat$CustomActionResultReceiver;
        if (sEVar.RatingCompat != null) {
            raVar.IconCompatParcelizer(sEVar.RatingCompat);
        }
    }
}
