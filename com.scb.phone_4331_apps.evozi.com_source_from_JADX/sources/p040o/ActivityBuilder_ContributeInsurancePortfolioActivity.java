package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.profilemanagement.accounts.AddAccountsFragment;

/* renamed from: o.ActivityBuilder_ContributeInsurancePortfolioActivity */
public final /* synthetic */ class ActivityBuilder_ContributeInsurancePortfolioActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ AddAccountsFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeInsurancePortfolioActivity(AddAccountsFragment addAccountsFragment) {
        this.MediaBrowserCompat$ItemReceiver = addAccountsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4915ks ksVar = this.MediaBrowserCompat$ItemReceiver.addAccountsPresenter;
        C4910kp kpVar = C4910kp.read;
        if (ksVar.RatingCompat != null) {
            kpVar.IconCompatParcelizer(ksVar.RatingCompat);
        }
    }
}
