package p040o;

import com.scb.phone.data.network.service.EDonationService;
import p040o.OnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.IExtractionServer */
public final class IExtractionServer extends writeUInt64NoTag<OnDeviceIdExtractor.C6966a.C69682.write> {
    public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    public final LineBuffer read;

    /* renamed from: o.IExtractionServer$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.C69682.write> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor.C6966a.C69682.write) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.IExtractionServer$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.C69682.write> {
        private /* synthetic */ ForwardingService IconCompatParcelizer;

        public write(ForwardingService forwardingService) {
            this.IconCompatParcelizer = forwardingService;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor.C6966a.C69682.write) obj).write(this.IconCompatParcelizer);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IExtractionServer(RegularImmutableBiMap regularImmutableBiMap, LineBuffer lineBuffer, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) lineBuffer, "prepaidRequestReviewDisplayMapper");
        onGetStartedClick.write((Object) getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, "profileRepositoryContractor");
        this.read = lineBuffer;
        this.MediaBrowserCompat$ItemReceiver = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    /* renamed from: o.IExtractionServer$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public EDonationService IconCompatParcelizer;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(EDonationService eDonationService) {
            this.IconCompatParcelizer = eDonationService;
        }
    }
}
