package p040o;

import p040o.setExclusionStrategies;
import p040o.writeUInt64NoTag;
import p040o.zzqj;

/* renamed from: o.addSerializationExclusionStrategy */
public final /* synthetic */ class addSerializationExclusionStrategy implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzqj.zza MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setExclusionStrategies.write read;

    public /* synthetic */ addSerializationExclusionStrategy(setExclusionStrategies.write write, zzqj.zza zza) {
        this.read = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        setExclusionStrategies.write write = this.read;
        ((getLastName) obj).MediaBrowserCompat$CustomActionResultReceiver(setExclusionStrategies.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
