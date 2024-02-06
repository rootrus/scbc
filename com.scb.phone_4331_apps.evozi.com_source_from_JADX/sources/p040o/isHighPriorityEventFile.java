package p040o;

import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelServicesTabFragment;
import p040o.writeUInt64NoTag;

/* renamed from: o.isHighPriorityEventFile */
public final /* synthetic */ class isHighPriorityEventFile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ PrepaidTravelServicesTabFragment.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isHighPriorityEventFile(getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver geteventappsize_mediabrowsercompat_customactionresultreceiver, PrepaidTravelServicesTabFragment.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = geteventappsize_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver geteventappsize_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((ICheckExtractionServer) obj).MediaBrowserCompat$CustomActionResultReceiver(geteventappsize_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$ItemReceiver, false));
    }
}
