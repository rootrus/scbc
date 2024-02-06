package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsTargetRectangleFilled$MediaSessionCompat$Token */
final class nativeIsTargetRectangleFilled$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor> {
    private /* synthetic */ nativeIsTargetRectangleFilled IconCompatParcelizer;
    private /* synthetic */ getGeoDataClient read;

    nativeIsTargetRectangleFilled$MediaSessionCompat$Token(nativeIsTargetRectangleFilled nativeistargetrectanglefilled, getGeoDataClient getgeodataclient) {
        this.IconCompatParcelizer = nativeistargetrectanglefilled;
        this.read = getgeodataclient;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdExtractor) obj).write(nativeIsTargetRectangleFilled.read(this.read));
    }
}
