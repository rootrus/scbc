package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.onDetachFromWindow */
public final /* synthetic */ class onDetachFromWindow implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getAssetProvider read;

    public /* synthetic */ onDetachFromWindow(getAssetProvider getassetprovider) {
        this.read = getassetprovider;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7512tW) obj).write(this.read.MediaBrowserCompat$MediaItem);
    }
}
