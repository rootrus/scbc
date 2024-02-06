package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getDefaultNewRecordingFilePath */
public final /* synthetic */ class getDefaultNewRecordingFilePath implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ getAssetProvider MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getDefaultNewRecordingFilePath(getAssetProvider getassetprovider, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getassetprovider;
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7512tW) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer && this.MediaBrowserCompat$CustomActionResultReceiver.write);
    }
}
