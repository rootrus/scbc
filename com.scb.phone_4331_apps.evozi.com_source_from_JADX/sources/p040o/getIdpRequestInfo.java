package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.merchant.MerchantWalletIncomingTransactionFragment;
import com.scb.phone.view.fragment.merchant.MerchantWalletOutgoingTransactionFragment;

/* renamed from: o.getIdpRequestInfo */
public final class getIdpRequestInfo extends setCardElevation {
    private Context IconCompatParcelizer;
    public doWriteToLog MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    private int[] RatingCompat = {R.string.wallet_detail_incoming_tab, R.string.wallet_detail_outgoing_tab};
    public String read;
    public String write;

    public final int getCount() {
        return 2;
    }

    public getIdpRequestInfo(setTitleMarginStart settitlemarginstart, Context context, doWriteToLog dowritetolog, String str, String str2, boolean z) {
        super(settitlemarginstart);
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = dowritetolog;
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return MerchantWalletIncomingTransactionFragment.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.read, this.MediaBrowserCompat$ItemReceiver);
        }
        if (i != 1) {
            return null;
        }
        return MerchantWalletOutgoingTransactionFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.read);
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.getString(this.RatingCompat[i]);
    }
}
