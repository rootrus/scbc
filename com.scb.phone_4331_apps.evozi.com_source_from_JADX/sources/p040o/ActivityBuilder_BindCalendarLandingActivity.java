package p040o;

import com.scb.phone.view.custom.common.CustomDeltaInput;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindCalendarLandingActivity */
public final /* synthetic */ class ActivityBuilder_BindCalendarLandingActivity implements CustomDeltaInput.IconCompatParcelizer {
    private final /* synthetic */ HmlCalculatorFragment write;

    public /* synthetic */ ActivityBuilder_BindCalendarLandingActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.write = hmlCalculatorFragment;
    }

    public final void aB_() {
        HmlCalculatorFragment hmlCalculatorFragment = this.write;
        hmlCalculatorFragment.tvTitle.setFocusable(true);
        hmlCalculatorFragment.tvTitle.setFocusableInTouchMode(true);
        hmlCalculatorFragment.tvTitle.requestFocus();
    }
}
