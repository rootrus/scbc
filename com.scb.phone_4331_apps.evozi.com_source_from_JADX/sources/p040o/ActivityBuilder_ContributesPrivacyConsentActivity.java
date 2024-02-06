package p040o;

import android.app.Dialog;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributesPrivacyConsentActivity */
public final /* synthetic */ class ActivityBuilder_ContributesPrivacyConsentActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BillPaymentSuccessFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributesPrivacyConsentActivity(BillPaymentSuccessFragment billPaymentSuccessFragment) {
        this.MediaBrowserCompat$ItemReceiver = billPaymentSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        BillPaymentSuccessFragment billPaymentSuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        billPaymentSuccessFragment.qrCodeImageView.setVisibility(8);
        TextView textView = billPaymentSuccessFragment.refIdTextView;
        billPaymentSuccessFragment.getResources();
        textView.setTextColor(-9031231);
        billPaymentSuccessFragment.refIdTextView.setTextSize(2, ((float) billPaymentSuccessFragment.getResources().getDimensionPixelSize(R.dimen.f75362131165998)) / billPaymentSuccessFragment.getResources().getDisplayMetrics().density);
        billPaymentSuccessFragment.qrCodeDescriptionTextView.setText(billPaymentSuccessFragment.getString(R.string.successful_qr_code_no_qr_code_bill_payment_header));
        Dialog dialog = billPaymentSuccessFragment.write;
        if (dialog != null && dialog.isShowing()) {
            billPaymentSuccessFragment.write.dismiss();
            billPaymentSuccessFragment.write = null;
        }
    }
}
