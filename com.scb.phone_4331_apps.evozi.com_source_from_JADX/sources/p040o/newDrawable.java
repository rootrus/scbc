package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.AbstractMultimap;

/* renamed from: o.newDrawable */
public final /* synthetic */ class newDrawable implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ newDrawable(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentReviewActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        synchronized (bankingAgentReviewActivity) {
            KeyframeParser MediaBrowserCompat$ItemReceiver = bankingAgentReviewActivity.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver();
            if (bankingAgentReviewActivity.MediaBrowserCompat$MediaItem == AbstractMultimap.AsMap.AsMapEntries.ERROR) {
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = null;
            } else {
                Short3 short3 = bankingAgentReviewActivity.MediaSessionCompat$Token;
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = ((jsonToColor) singleDataEntity.getData()).read;
                short3.write(MediaBrowserCompat$ItemReceiver);
                bankingAgentReviewActivity.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
            }
        }
    }
}
