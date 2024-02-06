package p040o;

import android.net.Uri;
import p040o.writeUInt64NoTag;

/* renamed from: o.hN */
public final /* synthetic */ class C4730hN implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Uri MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4730hN(Uri uri) {
        this.MediaBrowserCompat$ItemReceiver = uri;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_MembersInjector$MediaBrowserCompat$MediaItem) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
