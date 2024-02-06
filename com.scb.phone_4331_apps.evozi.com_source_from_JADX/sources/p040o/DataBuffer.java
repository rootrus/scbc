package p040o;

import com.scb.phone.data.network.service.hml.HmlBusinessOwnerService;
import com.scb.phone.data.network.service.hml.HmlService;

/* renamed from: o.DataBuffer */
public final class DataBuffer {
    public final HmlService MediaBrowserCompat$CustomActionResultReceiver;
    public final HmlBusinessOwnerService MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public DataBuffer(HmlBusinessOwnerService hmlBusinessOwnerService, HmlService hmlService) {
        onGetStartedClick.write((Object) hmlBusinessOwnerService, "hmlBusinessOwnerService");
        onGetStartedClick.write((Object) hmlService, "hmlConsumerService");
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerService;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlService;
    }
}
