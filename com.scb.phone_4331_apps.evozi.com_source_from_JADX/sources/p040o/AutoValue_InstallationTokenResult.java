package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.AutoValue_InstallationTokenResult */
public final /* synthetic */ class AutoValue_InstallationTokenResult implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ AutoValue_InstallationTokenResult write = new AutoValue_InstallationTokenResult();

    /* renamed from: o.AutoValue_InstallationTokenResult$Builder */
    public final /* synthetic */ class Builder implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ C10865shutdown MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ Builder(C10865shutdown shutdown) {
            this.MediaBrowserCompat$CustomActionResultReceiver = shutdown;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((C7380xc8902ede) obj).read(!this.MediaBrowserCompat$CustomActionResultReceiver.read);
        }
    }

    private /* synthetic */ AutoValue_InstallationTokenResult() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.IconCompatParcelizer) obj).write();
    }
}
