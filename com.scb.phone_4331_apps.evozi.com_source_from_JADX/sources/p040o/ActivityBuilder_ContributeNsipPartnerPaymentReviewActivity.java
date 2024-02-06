package p040o;

import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.registration.onboarding.RegistrationFingerprintFragment;
import p040o.OnDeviceExtractionServer;

/* renamed from: o.ActivityBuilder_ContributeNsipPartnerPaymentReviewActivity */
public final /* synthetic */ class ActivityBuilder_ContributeNsipPartnerPaymentReviewActivity implements View.OnClickListener {
    private final /* synthetic */ RegistrationFingerprintFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeNsipPartnerPaymentReviewActivity(RegistrationFingerprintFragment registrationFingerprintFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = registrationFingerprintFragment;
    }

    public final void onClick(View view) {
        RegistrationFingerprintFragment registrationFingerprintFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        getKernelIDDstOver getkerneliddstover = registrationFingerprintFragment.IconCompatParcelizer;
        if (registrationFingerprintFragment.getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) registrationFingerprintFragment.getActivity()).scbAnalytics, "registration_fingerprint");
        }
        OnDeviceExtractionServer.C37082 r4 = registrationFingerprintFragment.presenter;
        C4951mE mEVar = C4951mE.MediaBrowserCompat$ItemReceiver;
        if (r4.RatingCompat != null) {
            mEVar.IconCompatParcelizer(r4.RatingCompat);
        }
    }
}
