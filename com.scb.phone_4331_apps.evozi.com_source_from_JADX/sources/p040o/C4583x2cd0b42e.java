package p040o;

import android.net.Uri;
import p040o.writeUInt64NoTag;

/* renamed from: o.getHorizontalMovementGuidance$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4583x2cd0b42e<V> implements writeUInt64NoTag.IconCompatParcelizer<C7510tT> {
    private /* synthetic */ Uri.Builder MediaBrowserCompat$CustomActionResultReceiver;

    public C4583x2cd0b42e(Uri.Builder builder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = builder;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Uri build = this.MediaBrowserCompat$CustomActionResultReceiver.build();
        onGetStartedClick.IconCompatParcelizer((Object) build, "newUriBuilder.build()");
        ((C7510tT) obj).IconCompatParcelizer(build);
    }
}
