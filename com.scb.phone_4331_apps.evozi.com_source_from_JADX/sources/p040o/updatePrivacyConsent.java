package p040o;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.creditcard.SettingTabFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.updatePrivacyConsent */
public final /* synthetic */ class updatePrivacyConsent implements BaseFragment.write {
    private final /* synthetic */ SettingTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ updatePrivacyConsent(SettingTabFragment settingTabFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = settingTabFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context) {
        SettingTabFragment settingTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent IconCompatParcelizer = ManageEmailLandingActivity.IconCompatParcelizer(context);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        SettingTabFragment.write((Fragment) settingTabFragment, IconCompatParcelizer);
    }
}
