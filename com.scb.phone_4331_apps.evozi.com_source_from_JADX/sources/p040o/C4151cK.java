package p040o;

import java.util.List;
import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.cK */
public final /* synthetic */ class C4151cK implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List read;
    private final /* synthetic */ List write;

    public /* synthetic */ C4151cK(List list, List list2, List list3, List list4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.write = list3;
        this.read = list4;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.MediaMetadataCompat) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.write, this.read);
    }
}
