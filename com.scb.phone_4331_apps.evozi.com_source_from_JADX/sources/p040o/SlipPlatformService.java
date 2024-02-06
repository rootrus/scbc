package p040o;

import com.scb.phone.view.fragment.creditcard.SettingTabFragment;
import p040o.getContour;

/* renamed from: o.SlipPlatformService */
public final /* synthetic */ class SlipPlatformService implements Runnable {
    private final /* synthetic */ SettingTabFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ SlipPlatformService(SettingTabFragment settingTabFragment, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = settingTabFragment;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void run() {
        SettingTabFragment settingTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        getContour getcontour = settingTabFragment.settingTabPresenter;
        String str = settingTabFragment.IconCompatParcelizer.setItemInvoker;
        String str2 = settingTabFragment.IconCompatParcelizer.MediaSessionCompat$Token;
        FirebaseMessagingRegistrar firebaseMessagingRegistrar = FirebaseMessagingRegistrar.IconCompatParcelizer;
        if (getcontour.RatingCompat != null) {
            firebaseMessagingRegistrar.IconCompatParcelizer(getcontour.RatingCompat);
        }
        getcontour.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(getcontour.read, new Object(z ? endTransaction.unlock : endTransaction.tempLock, new beginTransaction(str, str2)) {
            private final endTransaction MediaBrowserCompat$ItemReceiver;
            private beginTransaction read;
        });
        getcontour.IconCompatParcelizer.IconCompatParcelizer(new getContour.read(getcontour, (byte) 0));
    }
}
