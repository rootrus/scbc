package p040o;

import androidx.core.widget.NestedScrollView;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;
import java.util.Calendar;

/* renamed from: o.ActivityBuilder_ContributeStaticTileCustomizationActivity */
public final /* synthetic */ class ActivityBuilder_ContributeStaticTileCustomizationActivity implements NestedScrollView.IconCompatParcelizer {
    private final /* synthetic */ BillPaymentTabFragment write;

    public /* synthetic */ ActivityBuilder_ContributeStaticTileCustomizationActivity(BillPaymentTabFragment billPaymentTabFragment) {
        this.write = billPaymentTabFragment;
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        BillPaymentTabFragment billPaymentTabFragment = this.write;
        if (i >= i2 && nestedScrollView != null) {
            boolean z = false;
            if (nestedScrollView.getChildAt(0) != null && i >= nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) {
                if (Calendar.getInstance().getTimeInMillis() - billPaymentTabFragment.MediaBrowserCompat$CustomActionResultReceiver > 750) {
                    z = true;
                }
                if (z) {
                    billPaymentTabFragment.aw_();
                    billPaymentTabFragment.MediaBrowserCompat$CustomActionResultReceiver = Calendar.getInstance().getTimeInMillis();
                }
            }
        }
    }
}
