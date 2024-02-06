package p040o;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.creditcard.InformationTabFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.getBanks */
public final /* synthetic */ class getBanks implements BaseFragment.write {
    private final /* synthetic */ InformationTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getBanks(InformationTabFragment informationTabFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = informationTabFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context) {
        InformationTabFragment informationTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent IconCompatParcelizer = ManageEmailLandingActivity.IconCompatParcelizer(context);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        InformationTabFragment.read((Fragment) informationTabFragment, IconCompatParcelizer);
    }
}
