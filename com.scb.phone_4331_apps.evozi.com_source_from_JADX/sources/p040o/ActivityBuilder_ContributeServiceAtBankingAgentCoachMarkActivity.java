package p040o;

import android.animation.ValueAnimator;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;

/* renamed from: o.ActivityBuilder_ContributeServiceAtBankingAgentCoachMarkActivity */
public final /* synthetic */ class ActivityBuilder_ContributeServiceAtBankingAgentCoachMarkActivity implements Runnable {
    private final /* synthetic */ BillPaymentTabFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeServiceAtBankingAgentCoachMarkActivity(BillPaymentTabFragment billPaymentTabFragment, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = billPaymentTabFragment;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void run() {
        BillPaymentTabFragment billPaymentTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{billPaymentTabFragment.billPaymentTabNestedScrollView.getScrollY(), this.MediaBrowserCompat$ItemReceiver});
        ofInt.setDuration(400);
        ofInt.addUpdateListener(new ActivityBuilder_ContributeServiceAtBankingAgentActivity(billPaymentTabFragment));
        ofInt.start();
    }
}
