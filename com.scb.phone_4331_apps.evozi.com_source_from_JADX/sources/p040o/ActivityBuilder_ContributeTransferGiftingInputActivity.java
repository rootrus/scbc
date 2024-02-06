package p040o;

import android.content.DialogInterface;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.transferandpay.SuccessFragment;
import java.util.regex.Pattern;

/* renamed from: o.ActivityBuilder_ContributeTransferGiftingInputActivity */
public final /* synthetic */ class ActivityBuilder_ContributeTransferGiftingInputActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ SuccessFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeTransferGiftingInputActivity(SuccessFragment successFragment) {
        this.IconCompatParcelizer = successFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SuccessFragment successFragment = this.IconCompatParcelizer;
        if (String.valueOf(successFragment.IconCompatParcelizer.mEditTextView.getText()) != null) {
            if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(String.valueOf(successFragment.IconCompatParcelizer.mEditTextView.getText())).matches()) {
                successFragment.successPresenter.write(successFragment.RatingCompat, String.valueOf(successFragment.IconCompatParcelizer.mEditTextView.getText()));
                return;
            }
            CustomInputDialog customInputDialog = successFragment.IconCompatParcelizer;
            String string = successFragment.getString(R.string.favorite_invalid_character);
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(string);
        }
    }
}
