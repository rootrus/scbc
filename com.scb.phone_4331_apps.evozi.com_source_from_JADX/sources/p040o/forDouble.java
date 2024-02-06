package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.forDouble */
public final /* synthetic */ class forDouble implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ forDouble(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        OffsetDateTime offsetDateTime;
        String str;
        OffsetDateTime offsetDateTime2;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        getClientVersion getclientversion = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
        getPlaceTypes getplacetypes = new getPlaceTypes();
        getSolidHeight getsolidheight = (getSolidHeight) singleDataEntity.getData();
        if (singleDataEntity.getStatus() == null || singleDataEntity.getStatus().write() == null || !"9200".equalsIgnoreCase(singleDataEntity.getStatus().write())) {
            getplacetypes.read = false;
        } else {
            getplacetypes.read = true;
            getWebsiteUri$MediaBrowserCompat$CustomActionResultReceiver getwebsiteuri_mediabrowsercompat_customactionresultreceiver = new getWebsiteUri$MediaBrowserCompat$CustomActionResultReceiver();
            getwebsiteuri_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = singleDataEntity.getStatus().MediaBrowserCompat$ItemReceiver();
            getwebsiteuri_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = singleDataEntity.getStatus().IconCompatParcelizer();
            getplacetypes.MediaBrowserCompat$CustomActionResultReceiver = new getWebsiteUri(getwebsiteuri_mediabrowsercompat_customactionresultreceiver, (byte) 0);
        }
        OffsetDateTime offsetDateTime3 = null;
        if (getsolidheight.MediaMetadataCompat != null) {
            if (getsolidheight.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver != null) {
                offsetDateTime = FragmentBuilder_BindSummaryFragment.write(getsolidheight.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
            } else {
                offsetDateTime = null;
            }
            str = getsolidheight.MediaMetadataCompat.IconCompatParcelizer;
        } else {
            offsetDateTime = null;
            str = null;
        }
        getplacetypes.MediaDescriptionCompat = getsolidheight.RatingCompat;
        getplacetypes.RatingCompat = getsolidheight.MediaBrowserCompat$MediaItem;
        if (getsolidheight.read != null) {
            offsetDateTime2 = FragmentBuilder_BindSummaryFragment.write(getsolidheight.read, (OffsetDateTime) null);
        } else {
            offsetDateTime2 = null;
        }
        getplacetypes.MediaBrowserCompat$MediaItem = offsetDateTime2;
        getplacetypes.MediaMetadataCompat = offsetDateTime;
        getplacetypes.MediaSessionCompat$QueueItem = str;
        getplacetypes.IconCompatParcelizer = getsolidheight.write;
        getplacetypes.write = getsolidheight.MediaBrowserCompat$CustomActionResultReceiver;
        getplacetypes.MediaBrowserCompat$SearchResultReceiver = getsolidheight.IconCompatParcelizer;
        if (getsolidheight.MediaBrowserCompat$ItemReceiver != null) {
            offsetDateTime3 = FragmentBuilder_BindSummaryFragment.write(getsolidheight.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
        }
        getplacetypes.MediaBrowserCompat$ItemReceiver = offsetDateTime3;
        return DebitCardResetOtpActivity.just(getplacetypes);
    }
}
