package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.readInstance */
public final /* synthetic */ class readInstance implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ readInstance(boolean z, List list, List list2, String str) {
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        addBarCodeFoundEventListener.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read, (getCheckUsabilityData$MediaBrowserCompat$ItemReceiver) obj);
    }
}
