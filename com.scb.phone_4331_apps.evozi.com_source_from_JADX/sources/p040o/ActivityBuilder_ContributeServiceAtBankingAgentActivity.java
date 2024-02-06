package p040o;

import android.animation.ValueAnimator;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;

/* renamed from: o.ActivityBuilder_ContributeServiceAtBankingAgentActivity */
public final /* synthetic */ class ActivityBuilder_ContributeServiceAtBankingAgentActivity implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ BillPaymentTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeServiceAtBankingAgentActivity(BillPaymentTabFragment billPaymentTabFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = billPaymentTabFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        BillPaymentTabFragment billPaymentTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        billPaymentTabFragment.billPaymentTabNestedScrollView.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
