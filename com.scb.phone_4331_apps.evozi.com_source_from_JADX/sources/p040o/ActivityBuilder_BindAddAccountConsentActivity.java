package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindAddAccountConsentActivity */
public final /* synthetic */ class ActivityBuilder_BindAddAccountConsentActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindAddAccountConsentActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver.presenter.read();
    }
}
