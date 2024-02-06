package p040o;

import android.view.View;
import com.scb.phone.view.adapter.creditcard.CreditCardDetailBilledAdapter;

/* renamed from: o.countryInfo */
public final /* synthetic */ class countryInfo implements View.OnClickListener {
    private final /* synthetic */ CreditCardDetailBilledAdapter IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ countryInfo(CreditCardDetailBilledAdapter creditCardDetailBilledAdapter, int i) {
        this.IconCompatParcelizer = creditCardDetailBilledAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        CreditCardDetailBilledAdapter creditCardDetailBilledAdapter = this.IconCompatParcelizer;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindBillPaymentBillerListFragment fragmentBuilder_BindBillPaymentBillerListFragment = creditCardDetailBilledAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindBillPaymentBillerListFragment != null) {
            fragmentBuilder_BindBillPaymentBillerListFragment.write(i);
        }
    }
}
