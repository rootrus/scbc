package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.addGetAuthTokenListener */
public final /* synthetic */ class addGetAuthTokenListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withRegisteredFid MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ addGetAuthTokenListener(withRegisteredFid withregisteredfid) {
        this.MediaBrowserCompat$CustomActionResultReceiver = withregisteredfid;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid withregisteredfid = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).read(withregisteredfid.MediaDescriptionCompat.write(withregisteredfid.MediaSessionCompat$Token));
    }
}
