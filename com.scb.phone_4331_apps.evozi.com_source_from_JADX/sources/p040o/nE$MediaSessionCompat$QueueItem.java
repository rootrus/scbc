package p040o;

import p040o.C3085x7c929f5b;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.nE$MediaSessionCompat$QueueItem */
final class nE$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getHighestVersionAsync> {
    private /* synthetic */ scrollGesturesEnabled IconCompatParcelizer;
    private /* synthetic */ C3085x7c929f5b.C30861 MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ double read;
    private /* synthetic */ C5000nE write;

    nE$MediaSessionCompat$QueueItem(C5000nE nEVar, CrashlyticsReport.FilesPayload.File.Builder builder, C3085x7c929f5b.C30861 r3, scrollGesturesEnabled scrollgesturesenabled, double d) {
        this.write = nEVar;
        this.MediaBrowserCompat$ItemReceiver = builder;
        this.MediaBrowserCompat$CustomActionResultReceiver = r3;
        this.IconCompatParcelizer = scrollgesturesenabled;
        this.read = d;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getHighestVersionAsync) obj).IconCompatParcelizer(this.write.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(C5000nE.MediaDescriptionCompat(this.write), this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.read, this.write.IconCompatParcelizer, this.write.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat()));
    }
}
