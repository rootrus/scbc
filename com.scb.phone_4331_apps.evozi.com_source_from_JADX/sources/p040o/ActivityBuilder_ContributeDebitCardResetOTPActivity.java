package p040o;

import android.content.DialogInterface;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.landingpage.LandingFragment;

/* renamed from: o.ActivityBuilder_ContributeDebitCardResetOTPActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDebitCardResetOTPActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ LandingFragment read;

    public /* synthetic */ ActivityBuilder_ContributeDebitCardResetOTPActivity(LandingFragment landingFragment) {
        this.read = landingFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LandingFragment landingFragment = this.read;
        if (landingFragment.getActivity() instanceof HomeActivity) {
            BottomBar bottomBar = ((HomeActivity) landingFragment.getActivity()).mBottomNavigationView;
            bottomBar.read(((BottomBarTab) bottomBar.MediaBrowserCompat$ItemReceiver.findViewById(R.id.more_options_tab)).read);
        }
        dialogInterface.dismiss();
    }
}
