package p040o;

import p040o.access$2300;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.getUserName */
public final /* synthetic */ class getUserName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDocumentNote$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getUserName(getDocumentNote$MediaBrowserCompat$ItemReceiver getdocumentnote_mediabrowsercompat_itemreceiver, Throwable th) {
        this.IconCompatParcelizer = getdocumentnote_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getDocumentNote$MediaBrowserCompat$ItemReceiver getdocumentnote_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
        ((getMicrAmount.IconCompatParcelizer) obj).read(getdocumentnote_mediabrowsercompat_itemreceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
