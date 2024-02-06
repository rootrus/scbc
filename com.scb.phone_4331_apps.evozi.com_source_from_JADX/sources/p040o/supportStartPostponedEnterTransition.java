package p040o;

/* renamed from: o.supportStartPostponedEnterTransition */
public final class supportStartPostponedEnterTransition implements performOptionsMenuClosed<byte[]> {
    private final byte[] MediaBrowserCompat$ItemReceiver;

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public supportStartPostponedEnterTransition(byte[] bArr) {
        if (bArr != null) {
            this.MediaBrowserCompat$ItemReceiver = bArr;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final Class<byte[]> IconCompatParcelizer() {
        return byte[].class;
    }

    public final int read() {
        return this.MediaBrowserCompat$ItemReceiver.length;
    }

    public final /* bridge */ /* synthetic */ Object write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
