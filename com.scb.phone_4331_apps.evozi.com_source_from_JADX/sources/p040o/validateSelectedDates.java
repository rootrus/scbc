package p040o;

import com.scb.phone.view.activity.mwpartner.WalletAdapter;
import com.squareup.picasso.Picasso$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.validateSelectedDates */
public final /* synthetic */ class validateSelectedDates implements Picasso$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ WalletAdapter.WalletHolder read;

    public /* synthetic */ validateSelectedDates(WalletAdapter.WalletHolder walletHolder) {
        this.read = walletHolder;
    }

    public final void read() {
        WalletAdapter.WalletHolder walletHolder = this.read;
        walletHolder.ivShopCover.setVisibility(8);
        walletHolder.llAddShopCoverContainer.setVisibility(0);
    }
}
