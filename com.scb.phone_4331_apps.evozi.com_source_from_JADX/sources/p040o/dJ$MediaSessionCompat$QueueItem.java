package p040o;

import p040o.AutoValue_CrashlyticsReport_FilesPayload_File;
import p040o.writeUInt64NoTag;

/* renamed from: o.dJ$MediaSessionCompat$QueueItem */
final class dJ$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<IdRegion$MediaBrowserCompat$ItemReceiver> {
    private /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload_File.Builder read;

    dJ$MediaSessionCompat$QueueItem(AutoValue_CrashlyticsReport_FilesPayload_File.Builder builder) {
        this.read = builder;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        IdRegion$MediaBrowserCompat$ItemReceiver idRegion$MediaBrowserCompat$ItemReceiver = (IdRegion$MediaBrowserCompat$ItemReceiver) obj;
        idRegion$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        idRegion$MediaBrowserCompat$ItemReceiver.aj_();
    }
}
