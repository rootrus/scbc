package p040o;

import com.scb.phone.view.fragment.registration.onboarding.RegistrationPushNotificationFragment;

/* renamed from: o.ActivityBuilder_ContributeNtbUserInfoActivity */
public final class ActivityBuilder_ContributeNtbUserInfoActivity {
    private static final String[] read = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public static void MediaBrowserCompat$ItemReceiver(RegistrationPushNotificationFragment registrationPushNotificationFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(registrationPushNotificationFragment.requireActivity(), read)) {
            registrationPushNotificationFragment.registrationPushNotificationPresenter.IconCompatParcelizer();
        } else {
            registrationPushNotificationFragment.requestPermissions(read, 47);
        }
    }

    public static void IconCompatParcelizer(RegistrationPushNotificationFragment registrationPushNotificationFragment, int i, int[] iArr) {
        if (i != 47) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            registrationPushNotificationFragment.registrationPushNotificationPresenter.IconCompatParcelizer();
        } else if (!ProxySourceAdapter$ItemViewHolder.write(registrationPushNotificationFragment, read)) {
            RegistrationPushNotificationFragment.MediaBrowserCompat$ItemReceiver();
        } else {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
            registrationPushNotificationFragment.registrationPushNotificationPresenter.MediaBrowserCompat$ItemReceiver();
        }
    }
}
