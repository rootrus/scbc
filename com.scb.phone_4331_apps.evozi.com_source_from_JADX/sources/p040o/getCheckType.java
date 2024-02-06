package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCheckType */
public final /* synthetic */ class getCheckType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getCheckType(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        registerNewObjectListener.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, (C7138hs) obj);
    }
}
