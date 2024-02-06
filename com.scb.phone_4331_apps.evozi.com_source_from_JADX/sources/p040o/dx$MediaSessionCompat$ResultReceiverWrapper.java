package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.dx$MediaSessionCompat$ResultReceiverWrapper */
final class dx$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
    private /* synthetic */ int IconCompatParcelizer;
    private /* synthetic */ getGeofenceTransition read;
    private /* synthetic */ C4305dx write;

    dx$MediaSessionCompat$ResultReceiverWrapper(int i, getGeofenceTransition getgeofencetransition, C4305dx dxVar) {
        this.IconCompatParcelizer = i;
        this.read = getgeofencetransition;
        this.write = dxVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        doBackgroundInitializationAsync write2 = this.write.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.read);
        onGetStartedClick.IconCompatParcelizer((Object) write2, "investmentDetailsClientD…                        )");
        ((LocalProjectProvider.write) obj).MediaBrowserCompat$CustomActionResultReceiver(write2, this.IconCompatParcelizer);
    }
}
