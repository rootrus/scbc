package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.setFirebaseInstallationId */
public final /* synthetic */ class setFirebaseInstallationId implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getUri$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ setFirebaseInstallationId(getUri$MediaBrowserCompat$ItemReceiver geturi_mediabrowsercompat_itemreceiver, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = geturi_mediabrowsercompat_itemreceiver;
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        getUri$MediaBrowserCompat$ItemReceiver geturi_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        List list = this.write;
        newHashMap unused = geturi_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.read;
        ((C7381x4108488a) obj).write(newHashMap.MediaBrowserCompat$ItemReceiver(list, new insertOrUpdatePersistedInstallationEntry(geturi_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.read)), String.valueOf(list.size()));
    }
}
