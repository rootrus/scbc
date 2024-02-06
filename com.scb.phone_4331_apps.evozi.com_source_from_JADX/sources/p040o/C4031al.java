package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.al */
public final /* synthetic */ class C4031al implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ C4031al(boolean z, List list, List list2, String str) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.IconCompatParcelizer = list2;
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        addBarCodeFoundEventListener.write(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.write, (getCheckUsabilityData$MediaBrowserCompat$ItemReceiver) obj);
    }
}
