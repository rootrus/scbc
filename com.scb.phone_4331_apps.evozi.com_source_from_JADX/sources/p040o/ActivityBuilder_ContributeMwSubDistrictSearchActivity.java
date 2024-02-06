package p040o;

import android.view.View;
import com.scb.phone.view.fragment.registration.RegistrationNewPinFragment;

/* renamed from: o.ActivityBuilder_ContributeMwSubDistrictSearchActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwSubDistrictSearchActivity implements View.OnClickListener {
    private final /* synthetic */ RegistrationNewPinFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeMwSubDistrictSearchActivity(RegistrationNewPinFragment registrationNewPinFragment) {
        this.IconCompatParcelizer = registrationNewPinFragment;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.presenter.MediaBrowserCompat$ItemReceiver();
    }
}
