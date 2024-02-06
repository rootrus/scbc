package p040o;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerListFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.ActivityBuilder_ContributesStatementChannelLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributesStatementChannelLandingActivity implements View.OnTouchListener {
    private final /* synthetic */ BillPaymentBillerListFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributesStatementChannelLandingActivity(BillPaymentBillerListFragment billPaymentBillerListFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = billPaymentBillerListFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        BillPaymentBillerListFragment billPaymentBillerListFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = BillPaymentSearchActivity.MediaBrowserCompat$CustomActionResultReceiver(billPaymentBillerListFragment.getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        BillPaymentBillerListFragment.write(billPaymentBillerListFragment, MediaBrowserCompat$CustomActionResultReceiver2);
        return true;
    }
}
