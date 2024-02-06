package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.adapter.investment.scbs.open.SuitabilityAssessmentAdapter;
import java.util.List;

/* renamed from: o.chubbConfirm */
public final /* synthetic */ class chubbConfirm implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ onReportSendComplete MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ chubbConfirm(List list, onReportSendComplete onreportsendcomplete) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = onreportsendcomplete;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SuitabilityAssessmentAdapter.SuitabilityItemViewHolder.MediaBrowserCompat$ItemReceiver(this.write, this.MediaBrowserCompat$ItemReceiver, z);
    }
}
