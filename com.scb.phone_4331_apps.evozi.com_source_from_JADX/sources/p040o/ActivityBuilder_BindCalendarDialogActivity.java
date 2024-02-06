package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindCalendarDialogActivity */
public final /* synthetic */ class ActivityBuilder_BindCalendarDialogActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment read;

    public /* synthetic */ ActivityBuilder_BindCalendarDialogActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.read = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        this.read.presenter.MediaBrowserCompat$ItemReceiver();
    }
}
