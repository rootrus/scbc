package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getServiceCall */
public final /* synthetic */ class getServiceCall implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ populateEventDeviceData MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getServiceCall(populateEventDeviceData populateeventdevicedata) {
        this.MediaBrowserCompat$ItemReceiver = populateeventdevicedata;
    }

    public final void IconCompatParcelizer(Object obj) {
        setRequest.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, (getFrontRearHeightDifference) obj);
    }
}
