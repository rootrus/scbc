package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.doGetAuthTokenWithoutForceRefresh */
public final /* synthetic */ class doGetAuthTokenWithoutForceRefresh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withRegisteredFid MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ doGetAuthTokenWithoutForceRefresh(withRegisteredFid withregisteredfid) {
        this.MediaBrowserCompat$CustomActionResultReceiver = withregisteredfid;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid withregisteredfid = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).write(withregisteredfid.MediaDescriptionCompat.write(withregisteredfid.MediaBrowserCompat$MediaItem));
    }
}
