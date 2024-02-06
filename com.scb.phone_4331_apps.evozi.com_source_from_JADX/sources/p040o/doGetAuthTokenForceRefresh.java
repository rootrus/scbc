package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.doGetAuthTokenForceRefresh */
public final /* synthetic */ class doGetAuthTokenForceRefresh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withRegisteredFid read;

    public /* synthetic */ doGetAuthTokenForceRefresh(withRegisteredFid withregisteredfid) {
        this.read = withregisteredfid;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid withregisteredfid = this.read;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer(withregisteredfid.MediaDescriptionCompat.write(withregisteredfid.ParcelableVolumeInfo));
    }
}
