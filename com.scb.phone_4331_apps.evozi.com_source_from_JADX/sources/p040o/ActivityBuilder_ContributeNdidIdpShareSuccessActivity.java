package p040o;

import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.registration.onboarding.RegistrationAccountsFragment;

/* renamed from: o.ActivityBuilder_ContributeNdidIdpShareSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeNdidIdpShareSuccessActivity implements View.OnClickListener {
    private final /* synthetic */ RegistrationAccountsFragment write;

    public /* synthetic */ ActivityBuilder_ContributeNdidIdpShareSuccessActivity(RegistrationAccountsFragment registrationAccountsFragment) {
        this.write = registrationAccountsFragment;
    }

    public final void onClick(View view) {
        RegistrationAccountsFragment registrationAccountsFragment = this.write;
        boolean z = false;
        registrationAccountsFragment.button.setEnabled(false);
        getKernelIDDstOver getkerneliddstover = registrationAccountsFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (registrationAccountsFragment.getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) registrationAccountsFragment.getActivity()).scbAnalytics, "registration_addaccounts");
        }
        C4955mO mOVar = registrationAccountsFragment.presenter;
        innerException innerexception = innerException.read;
        if (mOVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            innerexception.IconCompatParcelizer(mOVar.RatingCompat);
        }
    }
}
