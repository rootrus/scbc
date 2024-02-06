package p040o;

import p040o.ByteStreams;
import p040o.C4128bz;

/* renamed from: o.getSupportedFlashModes */
public final /* synthetic */ class getSupportedFlashModes implements findFragmentByWho {
    private final /* synthetic */ C4128bz.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getSupportedFlashModes(C4128bz.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final Object IconCompatParcelizer(Object obj) {
        C4128bz.write write = this.MediaBrowserCompat$ItemReceiver;
        ByteStreams.ByteArrayDataInputStream unused = C4128bz.this.Keep;
        return ByteStreams.ByteArrayDataInputStream.IconCompatParcelizer((isMyLocationEnabled) obj, C4128bz.this.MediaSessionCompat$Token.read.setCheckable());
    }
}
