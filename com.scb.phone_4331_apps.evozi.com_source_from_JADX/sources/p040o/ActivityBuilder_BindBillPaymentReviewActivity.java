package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindBillPaymentReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindBillPaymentReviewActivity implements View.OnClickListener {
    private final /* synthetic */ HmlCalculatorFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindBillPaymentReviewActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.IconCompatParcelizer = hmlCalculatorFragment;
    }

    public final void onClick(View view) {
        T t = this.IconCompatParcelizer.presenter;
        setCustomTag setcustomtag = setCustomTag.MediaBrowserCompat$ItemReceiver;
        if (t.RatingCompat != null) {
            setcustomtag.IconCompatParcelizer(t.RatingCompat);
        }
    }
}
