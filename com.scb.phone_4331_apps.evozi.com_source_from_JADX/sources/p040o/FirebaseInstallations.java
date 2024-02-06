package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallations */
public final /* synthetic */ class FirebaseInstallations implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withRegisteredFid read;

    public /* synthetic */ FirebaseInstallations(withRegisteredFid withregisteredfid) {
        this.read = withregisteredfid;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid withregisteredfid = this.read;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer(withregisteredfid.MediaDescriptionCompat.IconCompatParcelizer(withregisteredfid.ParcelableVolumeInfo));
    }
}
