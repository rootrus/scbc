package p040o;

import p040o.CrashlyticsController;
import p040o.writeUInt64NoTag;

/* renamed from: o.md5Hash$MediaSessionCompat$QueueItem */
public final class md5Hash$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
    private /* synthetic */ md5Hash MediaBrowserCompat$ItemReceiver;

    public md5Hash$MediaSessionCompat$QueueItem(md5Hash md5hash) {
        this.MediaBrowserCompat$ItemReceiver = md5hash;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str;
        ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
        zzwd zzwd = zzwd.GALLERY;
        CrashlyticsController.FileNameContainsFilter MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
        if (MediaBrowserCompat$ItemReceiver2 == null || (str = MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer) == null) {
            str = "";
        }
        processingParameters_Factory.MediaBrowserCompat$ItemReceiver(zzwd, str);
    }
}
