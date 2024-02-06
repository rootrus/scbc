package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.isValidApiKeyFormat */
public final /* synthetic */ class isValidApiKeyFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFid read;

    public /* synthetic */ isValidApiKeyFormat(getFid getfid) {
        this.read = getfid;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$MediaItem) obj).write(this.read.IconCompatParcelizer.MediaMetadataCompat);
    }
}
