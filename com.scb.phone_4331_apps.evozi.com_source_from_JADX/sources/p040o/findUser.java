package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.creditcard.UnbilledTabFragment;

/* renamed from: o.findUser */
public final /* synthetic */ class findUser implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ UnbilledTabFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ findUser(UnbilledTabFragment unbilledTabFragment) {
        this.MediaBrowserCompat$ItemReceiver = unbilledTabFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        UnbilledTabFragment unbilledTabFragment = this.MediaBrowserCompat$ItemReceiver;
        Intent intent = (Intent) obj;
        if (intent.getExtras() != null) {
            unbilledTabFragment.unbilledTabPresenter.read(intent.getStringExtra("CREDIT_CARD_NUMBER"));
        }
    }
}
