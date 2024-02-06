package p040o;

import android.os.Bundle;
import android.view.View;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleFragment;

/* renamed from: o.ActivityBuilder_ContributeCcSofHybridActivity */
public final /* synthetic */ class ActivityBuilder_ContributeCcSofHybridActivity implements View.OnClickListener {
    private final /* synthetic */ SetupScheduleFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeCcSofHybridActivity(SetupScheduleFragment setupScheduleFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setupScheduleFragment;
    }

    public final void onClick(View view) {
        SetupScheduleFragment setupScheduleFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        Bundle bundle = new Bundle();
        setGuidanceFrameColor setguidanceframecolor = setupScheduleFragment.presenter;
        bundle.putParcelable("RESULT_KEY", setguidanceframecolor.MediaBrowserCompat$ItemReceiver.get(setguidanceframecolor.IconCompatParcelizer));
        if (setupScheduleFragment.getActivity() instanceof FragmentBuilder_BindBaseGiftTransferInputFragment) {
            ((FragmentBuilder_BindBaseGiftTransferInputFragment) setupScheduleFragment.getActivity()).MediaBrowserCompat$ItemReceiver(bundle);
        }
    }
}
