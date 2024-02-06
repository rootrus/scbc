package p040o;

import android.app.Dialog;
import android.graphics.Bitmap;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributesHmlNTBRepaymentAboutActivity */
public final /* synthetic */ class ActivityBuilder_ContributesHmlNTBRepaymentAboutActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BillPaymentSuccessFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributesHmlNTBRepaymentAboutActivity(BillPaymentSuccessFragment billPaymentSuccessFragment) {
        this.MediaBrowserCompat$ItemReceiver = billPaymentSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        BillPaymentSuccessFragment billPaymentSuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        billPaymentSuccessFragment.qrCodeSectionHeaderTextView.setText(billPaymentSuccessFragment.getString(R.string.successful_qr_code_bill_payment_header));
        billPaymentSuccessFragment.qrCodeDescriptionTextView.setText(billPaymentSuccessFragment.getString(R.string.successful_qr_code_bill_payment_description));
        billPaymentSuccessFragment.qrCodeImageView.setImageBitmap((Bitmap) obj);
        Dialog dialog = billPaymentSuccessFragment.write;
        if (dialog != null && dialog.isShowing()) {
            billPaymentSuccessFragment.write.dismiss();
            billPaymentSuccessFragment.write = null;
        }
    }
}
