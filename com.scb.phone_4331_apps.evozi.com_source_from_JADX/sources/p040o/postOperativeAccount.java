package p040o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.scb.phone.view.activity.debitatm.DebitTransactionAdapter;
import com.scb.phone.view.fragment.debitatm.DebitCardTransactionTabFragment;
import java.util.List;

/* renamed from: o.postOperativeAccount */
public final /* synthetic */ class postOperativeAccount implements Toolbar.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ DebitCardTransactionTabFragment read;

    public /* synthetic */ postOperativeAccount(DebitCardTransactionTabFragment debitCardTransactionTabFragment, List list) {
        this.read = debitCardTransactionTabFragment;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final boolean read(MenuItem menuItem) {
        DebitCardTransactionTabFragment debitCardTransactionTabFragment = this.read;
        List list = this.MediaBrowserCompat$ItemReceiver;
        debitCardTransactionTabFragment.mTextTxnMonthDebit.setText(menuItem.getTitle());
        int indexOf = list.indexOf(menuItem);
        DebitTransactionAdapter debitTransactionAdapter = debitCardTransactionTabFragment.IconCompatParcelizer;
        debitTransactionAdapter.read.clear();
        debitTransactionAdapter.IconCompatParcelizer.write();
        debitCardTransactionTabFragment.MediaBrowserCompat$CustomActionResultReceiver.read(debitCardTransactionTabFragment.MediaBrowserCompat$SearchResultReceiver, indexOf);
        return true;
    }
}
