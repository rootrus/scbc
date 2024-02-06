package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindBillPaymentSuccessActivity */
public final /* synthetic */ class ActivityBuilder_BindBillPaymentSuccessActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment read;

    public /* synthetic */ ActivityBuilder_BindBillPaymentSuccessActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.read = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        this.read.presenter.MediaBrowserCompat$ItemReceiver();
    }
}
