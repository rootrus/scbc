package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getAccountAccessor */
public final /* synthetic */ class getAccountAccessor implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getAccountAccessor(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        String str;
        setQuantity setquantity = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
        getChecked getchecked = (getChecked) ((SingleDataEntity) obj).getData();
        isMapToolbarEnabled read = isMapToolbarEnabled.read();
        read.MediaBrowserCompat$SearchResultReceiver = getchecked.AlertController$RecycleListView;
        read.read = getchecked.read;
        read.MediaDescriptionCompat = getchecked.MediaSessionCompat$ResultReceiverWrapper;
        String str2 = "";
        if (getchecked.MediaSessionCompat$QueueItem != null) {
            str = getchecked.MediaSessionCompat$QueueItem;
        } else {
            str = str2;
        }
        read.MediaMetadataCompat = str;
        if (getchecked.setHasDecor != null) {
            str2 = getchecked.setHasDecor;
        }
        read.RatingCompat = str2;
        read.write = Double.valueOf(getchecked.IconCompatParcelizer);
        read.MediaBrowserCompat$CustomActionResultReceiver = getchecked.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindSummaryFragment.write(getchecked.MediaBrowserCompat$MediaItem, (OffsetDateTime) null);
        read.MediaBrowserCompat$ItemReceiver = Double.valueOf(getchecked.MediaMetadataCompat);
        read.MediaBrowserCompat$MediaItem = getchecked.MediaDescriptionCompat;
        if (getchecked.MediaBrowserCompat$CustomActionResultReceiver != null) {
            Double.valueOf(getchecked.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return DebitCardResetOtpActivity.just(read);
    }
}
