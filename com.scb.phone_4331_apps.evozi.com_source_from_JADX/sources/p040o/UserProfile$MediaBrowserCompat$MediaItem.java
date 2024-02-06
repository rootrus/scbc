package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.UserProfile$MediaBrowserCompat$MediaItem */
public final class UserProfile$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIExtractionServerRttiFactory> {
    private /* synthetic */ zzfe.zza IconCompatParcelizer;
    private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

    public UserProfile$MediaBrowserCompat$MediaItem(zzfe.zza zza, boolean z) {
        this.IconCompatParcelizer = zza;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetIExtractionServerRttiFactory) obj).IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
