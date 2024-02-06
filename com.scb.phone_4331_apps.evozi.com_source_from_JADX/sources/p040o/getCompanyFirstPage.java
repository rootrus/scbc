package p040o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.scb.phone.R;
import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getCompanyFirstPage */
public final /* synthetic */ class getCompanyFirstPage implements Toolbar.IconCompatParcelizer {
    private final /* synthetic */ DepositDetailTransactionFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getCompanyFirstPage(DepositDetailTransactionFragment depositDetailTransactionFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = depositDetailTransactionFragment;
    }

    public final boolean read(MenuItem menuItem) {
        OffsetDateTime offsetDateTime;
        DepositDetailTransactionFragment depositDetailTransactionFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (menuItem.getItemId() != R.id.menu_filter) {
            return false;
        }
        try {
            offsetDateTime = OffsetDateTime.now();
        } catch (RuntimeException unused) {
            offsetDateTime = OffsetDateTime.now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("UTC"));
        }
        setOverflowReserved setoverflowreserved = new setOverflowReserved(depositDetailTransactionFragment.getContext(), depositDetailTransactionFragment.mToolbarTxn.findViewById(R.id.menu_filter));
        MenuItemImpl menuItemImpl = setoverflowreserved.MediaBrowserCompat$CustomActionResultReceiver;
        showNow MediaBrowserCompat$ItemReceiver = showNow.MediaBrowserCompat$ItemReceiver(0, 6);
        show show = new show(MediaBrowserCompat$ItemReceiver.read, new getExitTransitionCallback(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, new hmlSetupResult(offsetDateTime)));
        show show2 = new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new getSetupEmail(depositDetailTransactionFragment, offsetDateTime)));
        getBusinessInfo getbusinessinfo = new getBusinessInfo(menuItemImpl);
        while (show2.IconCompatParcelizer.hasNext()) {
            getbusinessinfo.MediaBrowserCompat$ItemReceiver(show2.IconCompatParcelizer.next());
        }
        setoverflowreserved.write = new getDocumentsByType(depositDetailTransactionFragment);
        setoverflowreserved.IconCompatParcelizer.IconCompatParcelizer();
        return true;
    }
}
