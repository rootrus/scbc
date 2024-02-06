package p040o;

import p040o.access$2300;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.ob */
public final /* synthetic */ class C5086ob implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ mX$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ C5086ob(mX$MediaBrowserCompat$ItemReceiver mx_mediabrowsercompat_itemreceiver, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = mx_mediabrowsercompat_itemreceiver;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        mX$MediaBrowserCompat$ItemReceiver mx_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getDocumentFramingError.read) obj).IconCompatParcelizer(mx_mediabrowsercompat_itemreceiver.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS));
    }
}
