package p040o;

import p040o.ExtractionParameters;
import p040o.writeUInt64NoTag;
import p040o.zzct;

/* renamed from: o.getUserEmailAddress$MediaSessionCompat$QueueItem */
public final class getUserEmailAddress$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ zzct.zza IconCompatParcelizer;

    public getUserEmailAddress$MediaSessionCompat$QueueItem(zzct.zza zza) {
        this.IconCompatParcelizer = zza;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ExtractionParameters.ExtractionType) obj).write(this.IconCompatParcelizer);
    }
}
