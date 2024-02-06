package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.createView */
public final /* synthetic */ class createView implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

    public /* synthetic */ createView(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        setPrice setprice = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
        defaultPort defaultport = (defaultPort) ((SingleDataEntity) obj).getData();
        useViewLifecycleInFragment write = useViewLifecycleInFragment.write();
        write.MediaSessionCompat$ResultReceiverWrapper = defaultport.f5537x50fd9e4a;
        write.MediaSessionCompat$Token = FragmentBuilder_BindSummaryFragment.write(defaultport.ParcelableVolumeInfo, (OffsetDateTime) null);
        write.MediaBrowserCompat$SearchResultReceiver = defaultport.MediaSessionCompat$QueueItem;
        write.ParcelableVolumeInfo = defaultport.MediaSessionCompat$Token;
        write.MediaBrowserCompat$MediaItem = defaultport.MediaBrowserCompat$MediaItem;
        write.MediaDescriptionCompat = defaultport.RatingCompat;
        write.MediaMetadataCompat = defaultport.MediaSessionCompat$ResultReceiverWrapper;
        write.RatingCompat = defaultport.MediaMetadataCompat;
        write.write = Double.valueOf(defaultport.MediaBrowserCompat$CustomActionResultReceiver).doubleValue();
        write.MediaBrowserCompat$ItemReceiver = Double.valueOf(defaultport.write).doubleValue();
        write.MediaBrowserCompat$CustomActionResultReceiver = defaultport.MediaDescriptionCompat;
        write.read = Double.valueOf(defaultport.read).doubleValue();
        return DebitCardResetOtpActivity.just(write);
    }
}
