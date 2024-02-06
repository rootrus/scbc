package p040o;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributeEDonationConsentActivity */
public final class ActivityBuilder_ContributeEDonationConsentActivity implements Runnable {
    private FundFactSheetActivity<? super View, HmlVerifyPhoneValidateOtpActivity> IconCompatParcelizer;
    private WeakReference<View> MediaBrowserCompat$CustomActionResultReceiver;

    public ActivityBuilder_ContributeEDonationConsentActivity(View view) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ActivityBuilder_ContributeEDonationConsentActivity(View view, FundFactSheetActivity<? super View, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        this(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) fundFactSheetActivity, "func");
        this.IconCompatParcelizer = fundFactSheetActivity;
    }

    public final void run() {
        View view = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (view != null) {
            FundFactSheetActivity<? super View, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = this.IconCompatParcelizer;
            if (fundFactSheetActivity != null) {
                fundFactSheetActivity.invoke(view);
            }
            view.setVisibility(8);
        }
    }
}
