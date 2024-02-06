package p040o;

import p040o.NativeSessionFileProvider;
import p040o.NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver */
public abstract class NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver<T extends NativeSessionFileProvider, B extends NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver<T, B>> {
    boolean IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    String read;
    String write;

    public abstract T MediaBrowserCompat$CustomActionResultReceiver();

    /* access modifiers changed from: protected */
    public abstract B write();

    public final B write(String str) {
        this.write = str;
        return write();
    }

    public final B MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.read = str;
        return write();
    }

    public final B read(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        return write();
    }

    public final B IconCompatParcelizer(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
        return write();
    }

    public final B MediaBrowserCompat$ItemReceiver() {
        this.IconCompatParcelizer = true;
        return write();
    }
}
