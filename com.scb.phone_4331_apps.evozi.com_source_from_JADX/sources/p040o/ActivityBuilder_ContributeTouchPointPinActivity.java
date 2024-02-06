package p040o;

import android.app.Dialog;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.SuccessFragment;

/* renamed from: o.ActivityBuilder_ContributeTouchPointPinActivity */
public final /* synthetic */ class ActivityBuilder_ContributeTouchPointPinActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ SuccessFragment read;

    public /* synthetic */ ActivityBuilder_ContributeTouchPointPinActivity(SuccessFragment successFragment) {
        this.read = successFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        SuccessFragment successFragment = this.read;
        if (successFragment.getContext() != null) {
            successFragment.qrCodeImageView.setVisibility(8);
            successFragment.refIdTextView.setTextColor(setLastBaselineToBottomHeight.read(successFragment.getContext(), R.color.f67252131099881));
            successFragment.refIdTextView.setTextSize(2, ((float) successFragment.getResources().getDimensionPixelSize(R.dimen.f75362131165998)) / successFragment.getResources().getDisplayMetrics().density);
            if ("TRANSFER".equals(successFragment.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat())) {
                successFragment.qrCodeDescriptionTextView.setText(successFragment.getString(R.string.successful_qr_code_no_qr_code_transfer_header));
            } else if ("BILLPAYMENT".equals(successFragment.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat())) {
                successFragment.qrCodeDescriptionTextView.setText(successFragment.getString(R.string.successful_qr_code_no_qr_code_bill_payment_header));
            }
            Dialog dialog = successFragment.write;
            if (dialog != null && dialog.isShowing()) {
                successFragment.write.dismiss();
                successFragment.write = null;
            }
        }
    }
}
