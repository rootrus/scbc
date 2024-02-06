package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentTracker */
public final /* synthetic */ class DocumentTracker implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DocumentTracker(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.C6915a) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
