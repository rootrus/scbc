package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getMissingBordersDetection */
public final /* synthetic */ class getMissingBordersDetection implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ getMissingBordersDetection(String str, String str2, String str3, boolean z) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        getFaceAngleTolerance.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.MediaBrowserCompat$ItemReceiver, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, (getUsable$MediaBrowserCompat$CustomActionResultReceiver) obj);
    }
}
