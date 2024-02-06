package p040o;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.cardmanagement.ExportCardStatementActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.creditcard.SettingTabFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.getReferralProductDFWYN */
public final /* synthetic */ class getReferralProductDFWYN implements BaseFragment.write {
    private final /* synthetic */ SettingTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getReferralProductDFWYN(SettingTabFragment settingTabFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = settingTabFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context) {
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        if (chain != null) {
            Intent IconCompatParcelizer = ExportCardStatementActivity.IconCompatParcelizer(context, chain);
            IntentTidInjectionContextAspect.aspectOf();
            SettingTabFragment.read(context, IconCompatParcelizer);
        }
    }
}
