package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.investment.FundActionsSuccessFragment;

/* renamed from: o.ActivityBuilder_BindHowToAddFavouriteTopUpActivity */
public final /* synthetic */ class ActivityBuilder_BindHowToAddFavouriteTopUpActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FundActionsSuccessFragment read;

    public /* synthetic */ ActivityBuilder_BindHowToAddFavouriteTopUpActivity(FundActionsSuccessFragment fundActionsSuccessFragment) {
        this.read = fundActionsSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        FundActionsSuccessFragment.MediaBrowserCompat$ItemReceiver(this.read, (Uri) obj);
    }
}
