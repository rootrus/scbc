package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.lO */
public final /* synthetic */ class C4927lO implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ C4927lO(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractorAgent) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}
