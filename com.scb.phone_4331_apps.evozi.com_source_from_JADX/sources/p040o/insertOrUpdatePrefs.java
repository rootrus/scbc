package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.insertOrUpdatePrefs */
public final /* synthetic */ class insertOrUpdatePrefs implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withRegisteredFid IconCompatParcelizer;

    public /* synthetic */ insertOrUpdatePrefs(withRegisteredFid withregisteredfid) {
        this.IconCompatParcelizer = withregisteredfid;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid withregisteredfid = this.IconCompatParcelizer;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).write(withregisteredfid.MediaDescriptionCompat.IconCompatParcelizer(withregisteredfid.MediaBrowserCompat$MediaItem));
    }
}
