package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.loadBitmapFromURI */
public final /* synthetic */ class loadBitmapFromURI implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPageID$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ loadBitmapFromURI(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        this.read = getpageid_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).IconCompatParcelizer(this.read);
    }
}
