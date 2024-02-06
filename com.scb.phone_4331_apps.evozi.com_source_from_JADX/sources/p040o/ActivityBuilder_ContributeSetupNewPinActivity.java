package p040o;

import android.animation.ValueAnimator;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;

/* renamed from: o.ActivityBuilder_ContributeSetupNewPinActivity */
public final /* synthetic */ class ActivityBuilder_ContributeSetupNewPinActivity implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ BillPaymentTabFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeSetupNewPinActivity(BillPaymentTabFragment billPaymentTabFragment) {
        this.MediaBrowserCompat$ItemReceiver = billPaymentTabFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        BillPaymentTabFragment billPaymentTabFragment = this.MediaBrowserCompat$ItemReceiver;
        billPaymentTabFragment.billPaymentTabNestedScrollView.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
