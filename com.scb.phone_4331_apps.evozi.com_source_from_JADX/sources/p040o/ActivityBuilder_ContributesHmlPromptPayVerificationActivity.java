package p040o;

import android.content.DialogInterface;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentSuccessFragment;
import java.util.regex.Pattern;

/* renamed from: o.ActivityBuilder_ContributesHmlPromptPayVerificationActivity */
public final /* synthetic */ class ActivityBuilder_ContributesHmlPromptPayVerificationActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ BillPaymentSuccessFragment read;

    public /* synthetic */ ActivityBuilder_ContributesHmlPromptPayVerificationActivity(BillPaymentSuccessFragment billPaymentSuccessFragment) {
        this.read = billPaymentSuccessFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BillPaymentSuccessFragment billPaymentSuccessFragment = this.read;
        if (String.valueOf(billPaymentSuccessFragment.IconCompatParcelizer.mEditTextView.getText()) != null) {
            if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(String.valueOf(billPaymentSuccessFragment.IconCompatParcelizer.mEditTextView.getText())).matches()) {
                billPaymentSuccessFragment.successPresenter.write(billPaymentSuccessFragment.RatingCompat, String.valueOf(billPaymentSuccessFragment.IconCompatParcelizer.mEditTextView.getText()));
                return;
            }
            CustomInputDialog customInputDialog = billPaymentSuccessFragment.IconCompatParcelizer;
            String string = billPaymentSuccessFragment.getString(R.string.favorite_invalid_character);
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(string);
        }
    }
}
