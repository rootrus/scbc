package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindActivateChequeReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindActivateChequeReviewActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ HmlCalculatorFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindActivateChequeReviewActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlCalculatorFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        HmlCalculatorFragment hmlCalculatorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!z) {
            hmlCalculatorFragment.presenter.write(hmlCalculatorFragment.schedulePayment.etAmount.write, true);
        }
    }
}
