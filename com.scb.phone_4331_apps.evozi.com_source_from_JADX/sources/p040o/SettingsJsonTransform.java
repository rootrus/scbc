package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsJsonTransform */
public final /* synthetic */ class SettingsJsonTransform implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List read;

    public /* synthetic */ SettingsJsonTransform(List list) {
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCAR$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver(this.read);
    }
}
