package p040o;

import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter;
import com.scb.phone.view.fragment.investment.scbs.open.SCBSMaritalStatusFragment;

/* renamed from: o.ActivityBuilder_BindTopUpActivity */
public final /* synthetic */ class ActivityBuilder_BindTopUpActivity implements SelectableChoiceAdapter.IconCompatParcelizer {
    private final /* synthetic */ SCBSMaritalStatusFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindTopUpActivity(SCBSMaritalStatusFragment sCBSMaritalStatusFragment) {
        this.IconCompatParcelizer = sCBSMaritalStatusFragment;
    }

    public final void IconCompatParcelizer(String str, int i) {
        getVisibility getvisibility = this.IconCompatParcelizer.scbsMaritalPresenter;
        getvisibility.MediaSessionCompat$Token = getvisibility.f2861x50fd9e4a.get(i);
        boolean z = false;
        boolean z2 = i == 1;
        setVibrationEnabled setvibrationenabled = new setVibrationEnabled(z2);
        if (getvisibility.RatingCompat != null) {
            setvibrationenabled.IconCompatParcelizer(getvisibility.RatingCompat);
        }
        if (!z2) {
            isFocusEnabled isfocusenabled = isFocusEnabled.MediaBrowserCompat$ItemReceiver;
            if (getvisibility.RatingCompat != null) {
                z = true;
            }
            if (z) {
                isfocusenabled.IconCompatParcelizer(getvisibility.RatingCompat);
                return;
            }
            return;
        }
        getvisibility.read();
    }
}
