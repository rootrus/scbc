package p040o;

import android.app.Dialog;
import android.graphics.Bitmap;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.SuccessFragment;

/* renamed from: o.ActivityBuilder_ContributeTouchPointInstructionActivity */
public final /* synthetic */ class ActivityBuilder_ContributeTouchPointInstructionActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ SuccessFragment write;

    public /* synthetic */ ActivityBuilder_ContributeTouchPointInstructionActivity(SuccessFragment successFragment) {
        this.write = successFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        SuccessFragment successFragment = this.write;
        Bitmap bitmap = (Bitmap) obj;
        if ("TRANSFER".equals(successFragment.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat())) {
            successFragment.qrCodeSectionHeaderTextView.setText(successFragment.getString(R.string.successful_qr_code_transfer_header));
            successFragment.qrCodeDescriptionTextView.setText(successFragment.getString(R.string.successful_qr_code_transfer_description));
        } else if ("BILLPAYMENT".equals(successFragment.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat())) {
            successFragment.qrCodeSectionHeaderTextView.setText(successFragment.getString(R.string.successful_qr_code_bill_payment_header));
            successFragment.qrCodeDescriptionTextView.setText(successFragment.getString(R.string.successful_qr_code_bill_payment_description));
        }
        successFragment.qrCodeImageView.setImageBitmap(bitmap);
        Dialog dialog = successFragment.write;
        if (dialog != null && dialog.isShowing()) {
            successFragment.write.dismiss();
            successFragment.write = null;
        }
    }
}
