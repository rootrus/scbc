package p040o;

import com.scb.phone.view.adapter.profilemanagement.promptpay.DepositAccountsAdapter;

/* renamed from: o.getBillerInfo */
public final /* synthetic */ class getBillerInfo implements FragmentBuilder_BindCategoriesListFragment {
    private final /* synthetic */ DepositAccountsAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getBillerInfo(DepositAccountsAdapter depositAccountsAdapter) {
        this.MediaBrowserCompat$CustomActionResultReceiver = depositAccountsAdapter;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        DepositAccountsAdapter depositAccountsAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        depositAccountsAdapter.MediaBrowserCompat$ItemReceiver = ((Integer) obj).intValue();
        depositAccountsAdapter.IconCompatParcelizer.write();
        depositAccountsAdapter.read.MediaBrowserCompat$ItemReceiver(depositAccountsAdapter.write.get(depositAccountsAdapter.MediaBrowserCompat$ItemReceiver));
    }
}
