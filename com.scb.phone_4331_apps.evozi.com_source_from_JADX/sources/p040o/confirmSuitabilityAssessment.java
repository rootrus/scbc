package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.fragment.ccrredemption.product.OPRRewardsFragment;

/* renamed from: o.confirmSuitabilityAssessment */
public final /* synthetic */ class confirmSuitabilityAssessment implements Runnable {
    private final /* synthetic */ OPRRewardsFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ confirmSuitabilityAssessment(OPRRewardsFragment oPRRewardsFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = oPRRewardsFragment;
    }

    public final void run() {
        int i;
        OPRRewardsFragment oPRRewardsFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        RecyclerView recyclerView = oPRRewardsFragment.rcvTierRewards;
        RecyclerView recyclerView2 = oPRRewardsFragment.rcvTierRewards;
        View childAt = recyclerView2.getChildAt(recyclerView2.AppCompatActivity.MediaSessionCompat$ResultReceiverWrapper() - 2);
        int i2 = 0;
        if (childAt != null) {
            i = childAt.getHeight();
        } else {
            i = 0;
        }
        RecyclerView recyclerView3 = oPRRewardsFragment.rcvTierRewards;
        View childAt2 = recyclerView3.getChildAt(recyclerView3.AppCompatActivity.MediaSessionCompat$ResultReceiverWrapper() - 2);
        if (childAt2 != null) {
            i2 = childAt2.getHeight();
        }
        recyclerView.scrollBy(i, i2);
    }
}
