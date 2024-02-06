package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getTimeMillis */
public final /* synthetic */ class getTimeMillis implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDeejungTransferMinMaxReviewFragment read;

    public /* synthetic */ getTimeMillis(FragmentBuilder_BindDeejungTransferMinMaxReviewFragment fragmentBuilder_BindDeejungTransferMinMaxReviewFragment) {
        this.read = fragmentBuilder_BindDeejungTransferMinMaxReviewFragment;
    }

    public final Object write(Object obj) {
        SignInButton signInButton = this.read.IconCompatParcelizer;
        PointFParser pointFParser = (PointFParser) ((SingleDataEntity) obj).getData();
        onStreetViewPanoramaLongClick write = onStreetViewPanoramaLongClick.write();
        write.MediaBrowserCompat$SearchResultReceiver = pointFParser.MediaBrowserCompat$CustomActionResultReceiver;
        write.f5555x50fd9e4a = FragmentBuilder_BindSummaryFragment.write(pointFParser.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
        write.ParcelableVolumeInfo = pointFParser.read;
        return DebitCardResetOtpActivity.just(write);
    }
}
