package p040o;

import java.util.List;
import p040o.PersistedInstallationEntry;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.AutoValue_PersistedInstallationEntry */
public final /* synthetic */ class AutoValue_PersistedInstallationEntry implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_InstallationResponse write;

    public /* synthetic */ AutoValue_PersistedInstallationEntry(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        this.write = autoValue_InstallationResponse;
    }

    /* renamed from: o.AutoValue_PersistedInstallationEntry$Builder */
    public final /* synthetic */ class Builder implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ List read;
        private final /* synthetic */ PersistedInstallationEntry.Builder.read write;

        public /* synthetic */ Builder(PersistedInstallationEntry.Builder.read read2, List list) {
            this.write = read2;
            this.read = list;
        }

        public final void IconCompatParcelizer(Object obj) {
            PersistedInstallationEntry.Builder.read read2 = this.write;
            List list = this.read;
            notifyStopped unused = PersistedInstallationEntry.Builder.this.read;
            ((proxyGetICheckDeserializerRtti$MediaSessionCompat$QueueItem) obj).write(notifyStopped.MediaBrowserCompat$ItemReceiver(list, new getIdFromPublicKey(PersistedInstallationEntry.Builder.this.read)));
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.write;
        proxyGetICheckDeserializerRtti.MediaDescriptionCompat mediaDescriptionCompat = (proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj;
        String str = autoValue_InstallationResponse.IconCompatParcelizer;
        if (str == null) {
            str = "";
        }
        mediaDescriptionCompat.write(str, autoValue_InstallationResponse.MediaBrowserCompat$MediaItem);
    }
}
