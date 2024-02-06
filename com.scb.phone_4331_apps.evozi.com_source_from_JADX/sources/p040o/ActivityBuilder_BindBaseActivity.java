package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindBaseActivity */
public final /* synthetic */ class ActivityBuilder_BindBaseActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindBaseActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        T t = this.MediaBrowserCompat$ItemReceiver.presenter;
        ClassificationResult classificationResult = ClassificationResult.write;
        if (t.RatingCompat != null) {
            classificationResult.IconCompatParcelizer(t.RatingCompat);
        }
    }
}
