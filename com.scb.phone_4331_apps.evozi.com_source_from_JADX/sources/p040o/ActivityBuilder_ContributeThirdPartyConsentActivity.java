package p040o;

import android.content.DialogInterface;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.transferandpay.EditFavouriteFragment;
import java.util.regex.Pattern;

/* renamed from: o.ActivityBuilder_ContributeThirdPartyConsentActivity */
public final /* synthetic */ class ActivityBuilder_ContributeThirdPartyConsentActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ EditFavouriteFragment read;

    public /* synthetic */ ActivityBuilder_ContributeThirdPartyConsentActivity(EditFavouriteFragment editFavouriteFragment, int i) {
        this.read = editFavouriteFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditFavouriteFragment editFavouriteFragment = this.read;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (String.valueOf(editFavouriteFragment.IconCompatParcelizer.mEditTextView.getText()) == null) {
            return;
        }
        if (String.valueOf(editFavouriteFragment.IconCompatParcelizer.mEditTextView.getText()).length() > 0) {
            if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(String.valueOf(editFavouriteFragment.IconCompatParcelizer.mEditTextView.getText())).matches()) {
                editFavouriteFragment.editFavouritePresenter.write(i2, String.valueOf(editFavouriteFragment.IconCompatParcelizer.mEditTextView.getText()));
                return;
            }
            CustomInputDialog customInputDialog = editFavouriteFragment.IconCompatParcelizer;
            String string = editFavouriteFragment.getString(R.string.favorite_invalid_character);
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(string);
            return;
        }
        CustomInputDialog customInputDialog2 = editFavouriteFragment.IconCompatParcelizer;
        String string2 = editFavouriteFragment.getString(R.string.edit_favourite_empty);
        customInputDialog2.mErrorTextView.setVisibility(0);
        customInputDialog2.mErrorTextView.setText(string2);
    }
}
