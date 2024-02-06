package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsTargetRectangleFilled$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C5041x83538465<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor> {
    private /* synthetic */ nativeIsTargetRectangleFilled IconCompatParcelizer;
    private /* synthetic */ getGeoDataClient MediaBrowserCompat$ItemReceiver;

    C5041x83538465(nativeIsTargetRectangleFilled nativeistargetrectanglefilled, getGeoDataClient getgeodataclient) {
        this.IconCompatParcelizer = nativeistargetrectanglefilled;
        this.MediaBrowserCompat$ItemReceiver = getgeodataclient;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdExtractor) obj).MediaBrowserCompat$ItemReceiver(nativeIsTargetRectangleFilled.read(this.MediaBrowserCompat$ItemReceiver));
    }
}
