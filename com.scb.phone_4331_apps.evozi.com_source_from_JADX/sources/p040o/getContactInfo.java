package p040o;

import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter;
import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;

/* renamed from: o.getContactInfo */
public final /* synthetic */ class getContactInfo implements DepositTransactionAdapter.read {
    private final /* synthetic */ DepositDetailTransactionFragment read;

    public /* synthetic */ getContactInfo(DepositDetailTransactionFragment depositDetailTransactionFragment) {
        this.read = depositDetailTransactionFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        DepositDetailTransactionFragment depositDetailTransactionFragment = this.read;
        if (z) {
            depositDetailTransactionFragment.mDepositTransactionPresenter.read(true, depositDetailTransactionFragment.MediaMetadataCompat.MediaBrowserCompat$MediaItem.size() - 1);
        }
    }
}
