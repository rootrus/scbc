package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindAddNewRecipientActivity */
public final /* synthetic */ class ActivityBuilder_BindAddNewRecipientActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment write;

    public /* synthetic */ ActivityBuilder_BindAddNewRecipientActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.write = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        HmlCalculatorFragment hmlCalculatorFragment = this.write;
        hmlCalculatorFragment.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(hmlCalculatorFragment.IconCompatParcelizer);
    }
}
