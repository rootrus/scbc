package p040o;

/* renamed from: o.CountingOutputStream */
public final /* synthetic */ class CountingOutputStream implements findFragmentByWho {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Files MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ CountingOutputStream(Files files, String str, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = files;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final Object IconCompatParcelizer(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((zzvo) obj, this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
