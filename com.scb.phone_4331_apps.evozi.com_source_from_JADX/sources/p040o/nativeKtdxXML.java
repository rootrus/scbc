package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeKtdxXML */
public final /* synthetic */ class nativeKtdxXML implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String[] MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String[] write;

    public /* synthetic */ nativeKtdxXML(String[] strArr, String[] strArr2) {
        this.write = strArr;
        this.MediaBrowserCompat$ItemReceiver = strArr2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetUriKtaFactory) obj).read(this.write, this.MediaBrowserCompat$ItemReceiver);
    }
}
