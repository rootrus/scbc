package p040o;

import com.scb.phone.view.custom.common.CustomDeltaInput;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindAmortizationActivity */
public final /* synthetic */ class ActivityBuilder_BindAmortizationActivity implements CustomDeltaInput.write {
    private final /* synthetic */ HmlCalculatorFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindAmortizationActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlCalculatorFragment;
    }

    public final void aC_() {
        HmlCalculatorFragment hmlCalculatorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        hmlCalculatorFragment.tvTitle.setFocusable(true);
        hmlCalculatorFragment.tvTitle.setFocusableInTouchMode(true);
        hmlCalculatorFragment.tvTitle.requestFocus();
    }
}
