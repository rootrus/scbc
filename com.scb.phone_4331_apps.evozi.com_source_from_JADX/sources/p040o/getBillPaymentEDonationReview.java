package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.AccountSelectorAdapter;

/* renamed from: o.getBillPaymentEDonationReview */
public final /* synthetic */ class getBillPaymentEDonationReview implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ AccountSelectorAdapter write;

    public /* synthetic */ getBillPaymentEDonationReview(AccountSelectorAdapter accountSelectorAdapter, int i) {
        this.write = accountSelectorAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        AccountSelectorAdapter accountSelectorAdapter = this.write;
        int i = this.IconCompatParcelizer;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = accountSelectorAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
