package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getLicenseFieldName */
public final /* synthetic */ class getLicenseFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getLicenseFieldName(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractor) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
