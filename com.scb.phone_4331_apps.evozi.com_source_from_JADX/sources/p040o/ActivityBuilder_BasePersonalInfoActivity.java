package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BasePersonalInfoActivity */
public final /* synthetic */ class ActivityBuilder_BasePersonalInfoActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BasePersonalInfoActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        T t = this.MediaBrowserCompat$ItemReceiver.presenter;
        isForceMatch isforcematch = isForceMatch.write;
        if (t.RatingCompat != null) {
            isforcematch.IconCompatParcelizer(t.RatingCompat);
        }
    }
}
