package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.MarshalShort */
public final /* synthetic */ class MarshalShort implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ MarshalShort(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCheckUsabilityData$MediaBrowserCompat$ItemReceiver) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
