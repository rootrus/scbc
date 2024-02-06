package p040o;

import java.util.List;
import p040o.ExtractionParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.getUserEmailAddress$MediaBrowserCompat$MediaItem */
final class getUserEmailAddress$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ List write;

    getUserEmailAddress$MediaBrowserCompat$MediaItem(List list) {
        this.write = list;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ExtractionParameters.ExtractionType) obj).MediaBrowserCompat$ItemReceiver(this.write);
    }
}
