package p040o;

import android.widget.ScrollView;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferLandingBottomFragment;

/* renamed from: o.RewardRedemptionService */
public final /* synthetic */ class RewardRedemptionService implements Runnable {
    private final /* synthetic */ ScrollView MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DeejungTransferLandingBottomFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ RewardRedemptionService(DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment, ScrollView scrollView) {
        this.MediaBrowserCompat$ItemReceiver = deejungTransferLandingBottomFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = scrollView;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.smoothScrollTo(0, this.MediaBrowserCompat$ItemReceiver.layoutReviewButtonMinMax.getBottom());
    }
}
