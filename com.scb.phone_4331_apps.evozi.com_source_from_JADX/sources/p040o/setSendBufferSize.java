package p040o;

/* renamed from: o.setSendBufferSize */
public final /* synthetic */ class setSendBufferSize implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setSendBufferSize(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final boolean write(Object obj) {
        return ((zzup) obj).MediaBrowserCompat$CustomActionResultReceiver.equals(this.MediaBrowserCompat$ItemReceiver);
    }
}
