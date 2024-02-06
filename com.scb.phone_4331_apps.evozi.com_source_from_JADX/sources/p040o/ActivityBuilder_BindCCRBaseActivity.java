package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindCCRBaseActivity */
public final /* synthetic */ class ActivityBuilder_BindCCRBaseActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindCCRBaseActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        T t = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        getDocWidth getdocwidth = getDocWidth.write;
        if (t.RatingCompat != null) {
            getdocwidth.IconCompatParcelizer(t.RatingCompat);
        }
    }
}
