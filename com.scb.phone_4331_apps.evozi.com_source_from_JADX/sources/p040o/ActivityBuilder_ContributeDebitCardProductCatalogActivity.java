package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.landingpage.LandingFragment;
import java.util.List;

/* renamed from: o.ActivityBuilder_ContributeDebitCardProductCatalogActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDebitCardProductCatalogActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ LandingFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ ActivityBuilder_ContributeDebitCardProductCatalogActivity(LandingFragment landingFragment, List list) {
        this.MediaBrowserCompat$ItemReceiver = landingFragment;
        this.write = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LandingFragment landingFragment = this.MediaBrowserCompat$ItemReceiver;
        landingFragment.landingPagePresenter.MediaBrowserCompat$CustomActionResultReceiver((List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver>) this.write);
    }
}
