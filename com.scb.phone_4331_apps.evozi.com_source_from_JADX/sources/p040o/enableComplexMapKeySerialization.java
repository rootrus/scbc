package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.enableComplexMapKeySerialization */
public final /* synthetic */ class enableComplexMapKeySerialization implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ enableComplexMapKeySerialization(List list, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.write = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        setPrettyPrinting.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, (isBarcodeRead) obj);
    }
}
