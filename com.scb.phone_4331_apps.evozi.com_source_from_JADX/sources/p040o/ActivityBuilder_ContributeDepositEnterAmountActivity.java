package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$MediaItem;
import com.scb.phone.view.fragment.landingpage.LandingFragment;

/* renamed from: o.ActivityBuilder_ContributeDepositEnterAmountActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDepositEnterAmountActivity implements TileAdapter$MediaBrowserCompat$MediaItem {
    private final /* synthetic */ LandingFragment write;

    public /* synthetic */ ActivityBuilder_ContributeDepositEnterAmountActivity(LandingFragment landingFragment) {
        this.write = landingFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.write.scrollView.setEnableScrolling(z);
    }
}
