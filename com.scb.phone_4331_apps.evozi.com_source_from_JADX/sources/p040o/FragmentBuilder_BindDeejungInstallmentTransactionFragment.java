package p040o;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: o.FragmentBuilder_BindDeejungInstallmentTransactionFragment */
public final /* synthetic */ class FragmentBuilder_BindDeejungInstallmentTransactionFragment implements BondDeepLinkActivity {
    private final /* synthetic */ Context MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Bitmap read;

    public /* synthetic */ FragmentBuilder_BindDeejungInstallmentTransactionFragment(Context context, Bitmap bitmap) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = bitmap;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.read, addAccountConsentDeepLinkActivity);
    }
}
