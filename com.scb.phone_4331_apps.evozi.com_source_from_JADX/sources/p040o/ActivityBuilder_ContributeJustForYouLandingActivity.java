package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.profilemanagement.manageaccounts.AccountManagementFragment;

/* renamed from: o.ActivityBuilder_ContributeJustForYouLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributeJustForYouLandingActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ access$2300 read;

    public /* synthetic */ ActivityBuilder_ContributeJustForYouLandingActivity(access$2300 access_2300) {
        this.read = access_2300;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AccountManagementFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read, dialogInterface);
    }
}
