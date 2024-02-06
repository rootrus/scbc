package p040o;

import android.os.Bundle;
import android.view.View;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleFragment;
import p040o.isProximityOn;

/* renamed from: o.ActivityBuilder_ContributeCcSofReviewTermsAndConditionsActivity */
public final /* synthetic */ class ActivityBuilder_ContributeCcSofReviewTermsAndConditionsActivity implements View.OnClickListener {
    private final /* synthetic */ SetupScheduleFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeCcSofReviewTermsAndConditionsActivity(SetupScheduleFragment setupScheduleFragment) {
        this.MediaBrowserCompat$ItemReceiver = setupScheduleFragment;
    }

    public final void onClick(View view) {
        SetupScheduleFragment setupScheduleFragment = this.MediaBrowserCompat$ItemReceiver;
        Bundle bundle = new Bundle();
        isProximityOn.read read = isProximityOn.read();
        read.MediaBrowserCompat$SearchResultReceiver = true;
        bundle.putParcelable("RESULT_KEY", new isProximityOn(read, (byte) 0));
        if (setupScheduleFragment.getActivity() instanceof FragmentBuilder_BindBaseGiftTransferInputFragment) {
            ((FragmentBuilder_BindBaseGiftTransferInputFragment) setupScheduleFragment.getActivity()).MediaBrowserCompat$ItemReceiver(bundle);
        }
    }
}
