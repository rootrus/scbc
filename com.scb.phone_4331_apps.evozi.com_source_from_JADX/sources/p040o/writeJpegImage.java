package p040o;

import p040o.CheckExtractor_MembersInjector;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeJpegImage */
public final /* synthetic */ class writeJpegImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ writeToFileBuffer$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ writeJpegImage(writeToFileBuffer$MediaBrowserCompat$ItemReceiver writetofilebuffer_mediabrowsercompat_itemreceiver, Throwable th) {
        this.write = writetofilebuffer_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        writeToFileBuffer$MediaBrowserCompat$ItemReceiver writetofilebuffer_mediabrowsercompat_itemreceiver = this.write;
        ((CheckExtractor_MembersInjector.read) obj).MediaBrowserCompat$CustomActionResultReceiver(writetofilebuffer_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}
