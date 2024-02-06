package p040o;

import android.widget.ScrollView;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferLandingBottomFragment;

/* renamed from: o.incomingSummary */
public final /* synthetic */ class incomingSummary implements Runnable {
    private final /* synthetic */ ScrollView IconCompatParcelizer;
    private final /* synthetic */ DeejungTransferLandingBottomFragment write;

    public /* synthetic */ incomingSummary(DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment, ScrollView scrollView) {
        this.write = deejungTransferLandingBottomFragment;
        this.IconCompatParcelizer = scrollView;
    }

    public final void run() {
        this.IconCompatParcelizer.smoothScrollTo(0, this.write.plansLoaderView.getBottom());
    }
}
