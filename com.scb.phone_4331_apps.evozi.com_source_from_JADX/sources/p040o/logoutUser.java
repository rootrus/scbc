package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.logoutUser */
public final /* synthetic */ class logoutUser implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ addBarCodeFoundEventListener MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ logoutUser(addBarCodeFoundEventListener addbarcodefoundeventlistener, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = addbarcodefoundeventlistener;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        addBarCodeFoundEventListener addbarcodefoundeventlistener = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.MediaBrowserCompat$ItemReceiver;
        getCheckUsabilityData$MediaBrowserCompat$ItemReceiver getcheckusabilitydata_mediabrowsercompat_itemreceiver = (getCheckUsabilityData$MediaBrowserCompat$ItemReceiver) obj;
        getcheckusabilitydata_mediabrowsercompat_itemreceiver.IconCompatParcelizer(addbarcodefoundeventlistener.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(i));
        String str = addbarcodefoundeventlistener.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(i).MediaBrowserCompat$MediaItem;
        boolean z = addbarcodefoundeventlistener.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(i).MediaBrowserCompat$ItemReceiver;
        if ("S".equals(str) || "L".equals(str) || z) {
            addbarcodefoundeventlistener.MediaBrowserCompat$CustomActionResultReceiver(i);
        } else {
            getcheckusabilitydata_mediabrowsercompat_itemreceiver.IconCompatParcelizer();
        }
    }
}
