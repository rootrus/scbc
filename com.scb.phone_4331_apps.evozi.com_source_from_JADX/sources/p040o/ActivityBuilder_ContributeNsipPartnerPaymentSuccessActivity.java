package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.registration.onboarding.RegistrationPushNotificationFragment;

/* renamed from: o.ActivityBuilder_ContributeNsipPartnerPaymentSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeNsipPartnerPaymentSuccessActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ RegistrationPushNotificationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeNsipPartnerPaymentSuccessActivity(RegistrationPushNotificationFragment registrationPushNotificationFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = registrationPushNotificationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.registrationPushNotificationPresenter.MediaBrowserCompat$ItemReceiver();
    }
}
