package p040o;

import java.util.List;
import p040o.getTransit;
import p040o.writeUInt64NoTag;

/* renamed from: o.startRecord */
public final /* synthetic */ class startRecord implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ startRecord(List list, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.write = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTransit.IconCompatParcelizer) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }
}
