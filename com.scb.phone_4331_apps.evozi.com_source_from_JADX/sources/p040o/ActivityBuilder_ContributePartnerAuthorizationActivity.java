package p040o;

import android.view.View;
import com.scb.phone.view.fragment.registration.preregistration.PreregistrationPinFragment;

/* renamed from: o.ActivityBuilder_ContributePartnerAuthorizationActivity */
public final /* synthetic */ class ActivityBuilder_ContributePartnerAuthorizationActivity implements View.OnClickListener {
    private final /* synthetic */ PreregistrationPinFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributePartnerAuthorizationActivity(PreregistrationPinFragment preregistrationPinFragment) {
        this.IconCompatParcelizer = preregistrationPinFragment;
    }

    public final void onClick(View view) {
        PreregistrationPinFragment preregistrationPinFragment = this.IconCompatParcelizer;
        C5075nw nwVar = preregistrationPinFragment.presenter;
        C5071np npVar = new C5071np(Boolean.valueOf(preregistrationPinFragment.IconCompatParcelizer));
        if (nwVar.RatingCompat != null) {
            npVar.IconCompatParcelizer(nwVar.RatingCompat);
        }
    }
}
