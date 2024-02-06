package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.profilemanagement.promptpay.PromptPayTermsAndConditionsLandingFragment;
import p040o.C9924f;
import p040o.FocusStatistics;

/* renamed from: o.ActivityBuilder_ContributeMailingAddressSuccessfulActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMailingAddressSuccessfulActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ PromptPayTermsAndConditionsLandingFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeMailingAddressSuccessfulActivity(PromptPayTermsAndConditionsLandingFragment promptPayTermsAndConditionsLandingFragment) {
        this.IconCompatParcelizer = promptPayTermsAndConditionsLandingFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9924f.C43932 r2 = this.IconCompatParcelizer.presenter;
        FocusStatistics.C3393a aVar = new FocusStatistics.C3393a(z);
        if (r2.RatingCompat != null) {
            aVar.IconCompatParcelizer(r2.RatingCompat);
        }
    }
}
