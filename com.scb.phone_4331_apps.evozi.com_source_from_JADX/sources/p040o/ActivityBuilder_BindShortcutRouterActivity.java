package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindShortcutRouterActivity */
public final /* synthetic */ class ActivityBuilder_BindShortcutRouterActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment write;

    public /* synthetic */ ActivityBuilder_BindShortcutRouterActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.write = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.write.presenter;
        pageDetected pagedetected = new pageDetected(getposx);
        if (getposx.RatingCompat != null) {
            pagedetected.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
