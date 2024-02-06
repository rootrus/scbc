package p040o;

import android.view.View;
import com.scb.phone.view.adapter.accountsummary.C5725x3a81547f;
import com.scb.phone.view.adapter.accountsummary.MerchantWalletViewPagerAdapter;

/* renamed from: o.EasycashDFWYNRepositoryModule */
public final /* synthetic */ class EasycashDFWYNRepositoryModule implements View.OnClickListener {
    private final /* synthetic */ MerchantWalletViewPagerAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ EasycashDFWYNRepositoryModule(MerchantWalletViewPagerAdapter merchantWalletViewPagerAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = merchantWalletViewPagerAdapter;
        this.write = i;
    }

    public final void onClick(View view) {
        MerchantWalletViewPagerAdapter merchantWalletViewPagerAdapter = this.MediaBrowserCompat$ItemReceiver;
        int i = this.write;
        C5725x3a81547f merchantWalletViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver = merchantWalletViewPagerAdapter.read;
        if (merchantWalletViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver != null) {
            merchantWalletViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(i, merchantWalletViewPagerAdapter.IconCompatParcelizer);
        }
    }
}
