package p040o;

import android.view.ViewGroup;
import android.widget.ScrollView;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferLandingBottomFragment;

/* renamed from: o.deactivateECoupon */
public final /* synthetic */ class deactivateECoupon implements Runnable {
    private final /* synthetic */ DeejungTransferLandingBottomFragment IconCompatParcelizer;
    private final /* synthetic */ ViewGroup MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ScrollView write;

    public /* synthetic */ deactivateECoupon(DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment, ViewGroup viewGroup, ScrollView scrollView) {
        this.IconCompatParcelizer = deejungTransferLandingBottomFragment;
        this.MediaBrowserCompat$ItemReceiver = viewGroup;
        this.write = scrollView;
    }

    public final void run() {
        DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment = this.IconCompatParcelizer;
        ViewGroup viewGroup = this.MediaBrowserCompat$ItemReceiver;
        ScrollView scrollView = this.write;
        scrollView.smoothScrollTo(0, deejungTransferLandingBottomFragment.selectPaymentLabel.getBottom() + ((int) (((float) viewGroup.getHeight()) - scrollView.getY())));
    }
}
