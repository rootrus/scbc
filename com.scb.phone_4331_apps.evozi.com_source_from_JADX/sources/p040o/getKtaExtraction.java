package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getKtaExtraction */
public final /* synthetic */ class getKtaExtraction implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ getKtaExtraction(String str, String str2, String str3) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractorResponse) obj).IconCompatParcelizer(this.read, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
