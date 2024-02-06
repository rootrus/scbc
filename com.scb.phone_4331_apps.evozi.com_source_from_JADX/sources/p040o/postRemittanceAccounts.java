package p040o;

import android.view.View;
import com.scb.phone.view.adapter.creditcard.CreditCardDetailViewPagerAdapter;

/* renamed from: o.postRemittanceAccounts */
public final /* synthetic */ class postRemittanceAccounts implements View.OnClickListener {
    private final /* synthetic */ CreditCardDetailViewPagerAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ chain read;

    public /* synthetic */ postRemittanceAccounts(CreditCardDetailViewPagerAdapter creditCardDetailViewPagerAdapter, chain chain) {
        this.MediaBrowserCompat$CustomActionResultReceiver = creditCardDetailViewPagerAdapter;
        this.read = chain;
    }

    public final void onClick(View view) {
        CreditCardDetailViewPagerAdapter creditCardDetailViewPagerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        creditCardDetailViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver.read(this.read);
    }
}
