package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.InstallationTokenResult */
public final /* synthetic */ class InstallationTokenResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setTvRemark MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.InstallationTokenResult$Builder */
    public final /* synthetic */ class Builder implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Builder read = new Builder();

        private /* synthetic */ Builder() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$MediaItem) obj).MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$MediaItem.incomplete_information);
        }
    }

    public /* synthetic */ InstallationTokenResult(setTvRemark settvremark) {
        this.MediaBrowserCompat$ItemReceiver = settvremark;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.MediaMetadataCompat) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.write);
    }
}
