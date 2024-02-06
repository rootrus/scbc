package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindCardActivationActivity */
public final /* synthetic */ class ActivityBuilder_BindCardActivationActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindCardActivationActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.IconCompatParcelizer = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.presenter.MediaBrowserCompat$ItemReceiver();
    }
}
