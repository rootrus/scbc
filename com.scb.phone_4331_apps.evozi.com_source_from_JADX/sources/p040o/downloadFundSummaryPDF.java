package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomScheduleView;

/* renamed from: o.downloadFundSummaryPDF */
public final /* synthetic */ class downloadFundSummaryPDF implements View.OnClickListener {
    private final /* synthetic */ CustomScheduleView read;

    public /* synthetic */ downloadFundSummaryPDF(CustomScheduleView customScheduleView) {
        this.read = customScheduleView;
    }

    public final void onClick(View view) {
        FragmentBuilder_BindBranchTabFragment fragmentBuilder_BindBranchTabFragment = this.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindBranchTabFragment != null) {
            fragmentBuilder_BindBranchTabFragment.MediaBrowserCompat$SearchResultReceiver();
        }
    }
}
