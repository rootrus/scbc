package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.registration.onboarding.RegistrationPushNotificationFragment;
import p040o.OnDeviceExtractionServer;

/* renamed from: o.ActivityBuilder_ContributeNdidNationalIdInputActivity */
public final /* synthetic */ class ActivityBuilder_ContributeNdidNationalIdInputActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ RegistrationPushNotificationFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeNdidNationalIdInputActivity(RegistrationPushNotificationFragment registrationPushNotificationFragment) {
        this.IconCompatParcelizer = registrationPushNotificationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RegistrationPushNotificationFragment registrationPushNotificationFragment = this.IconCompatParcelizer;
        getKernelIDDstOver getkerneliddstover = registrationPushNotificationFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (registrationPushNotificationFragment.getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) registrationPushNotificationFragment.getActivity()).scbAnalytics, "registration_allownotifications");
        }
        OnDeviceExtractionServer.C37093 r3 = registrationPushNotificationFragment.registrationPushNotificationPresenter;
        C10045mD mDVar = C10045mD.write;
        if (r3.RatingCompat != null) {
            mDVar.IconCompatParcelizer(r3.RatingCompat);
        }
    }
}
