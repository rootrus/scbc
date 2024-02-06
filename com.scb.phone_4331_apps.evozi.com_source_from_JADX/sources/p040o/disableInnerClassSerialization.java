package p040o;

import java.util.List;
import p040o.setPrettyPrinting;
import p040o.writeUInt64NoTag;

/* renamed from: o.disableInnerClassSerialization */
public final /* synthetic */ class disableInnerClassSerialization implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setPrettyPrinting.write IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ disableInnerClassSerialization(setPrettyPrinting.write write, List list) {
        this.IconCompatParcelizer = write;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        setPrettyPrinting.write write = this.IconCompatParcelizer;
        List list = this.MediaBrowserCompat$ItemReceiver;
        int MediaBrowserCompat$CustomActionResultReceiver = setPrettyPrinting.read(list, ((isBarcodeRead) obj).write());
        if (MediaBrowserCompat$CustomActionResultReceiver == -1) {
            MediaBrowserCompat$CustomActionResultReceiver = 0;
        }
        setPrettyPrinting.write(setPrettyPrinting.this, list, MediaBrowserCompat$CustomActionResultReceiver);
    }
}
