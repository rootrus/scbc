package p040o;

import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessWithdrawAmountFragment;

/* renamed from: o.ActivityBuilder_ScbsFormActivity */
public final /* synthetic */ class ActivityBuilder_ScbsFormActivity implements Runnable {
    private final /* synthetic */ CardlessWithdrawAmountFragment.C61965 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ScbsFormActivity(CardlessWithdrawAmountFragment.C61965 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.write();
    }
}
