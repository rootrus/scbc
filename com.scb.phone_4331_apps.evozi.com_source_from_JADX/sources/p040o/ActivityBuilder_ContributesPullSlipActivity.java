package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributesPullSlipActivity */
public final /* synthetic */ class ActivityBuilder_ContributesPullSlipActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BillPaymentSuccessFragment write;

    public /* synthetic */ ActivityBuilder_ContributesPullSlipActivity(BillPaymentSuccessFragment billPaymentSuccessFragment) {
        this.write = billPaymentSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        BillPaymentSuccessFragment.write(this.write, (Uri) obj);
    }
}
