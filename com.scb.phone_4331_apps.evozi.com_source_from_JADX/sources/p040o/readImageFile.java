package p040o;

import p040o.CheckExtractor_MembersInjector;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.readImageFile */
public final /* synthetic */ class readImageFile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ writePngImage$MediaBrowserCompat$CustomActionResultReceiver read;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ readImageFile(writePngImage$MediaBrowserCompat$CustomActionResultReceiver writepngimage_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.read = writepngimage_mediabrowsercompat_customactionresultreceiver;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        writePngImage$MediaBrowserCompat$CustomActionResultReceiver writepngimage_mediabrowsercompat_customactionresultreceiver = this.read;
        ((CheckExtractor_MembersInjector.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(writepngimage_mediabrowsercompat_customactionresultreceiver.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS));
    }
}
