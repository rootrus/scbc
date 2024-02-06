package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.triggerOnException */
public final /* synthetic */ class triggerOnException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withRegisteredFid MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ triggerOnException(withRegisteredFid withregisteredfid) {
        this.MediaBrowserCompat$ItemReceiver = withregisteredfid;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid withregisteredfid = this.MediaBrowserCompat$ItemReceiver;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).read(withregisteredfid.MediaDescriptionCompat.IconCompatParcelizer(withregisteredfid.MediaSessionCompat$Token));
    }
}
