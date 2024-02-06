package p040o;

import android.content.DialogInterface;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.bulktransfer.ManageRecipientGroupFragment;
import java.util.regex.Pattern;

/* renamed from: o.getPromptPayVersion */
public final /* synthetic */ class getPromptPayVersion implements DialogInterface.OnClickListener {
    private final /* synthetic */ ManageRecipientGroupFragment read;

    public /* synthetic */ getPromptPayVersion(ManageRecipientGroupFragment manageRecipientGroupFragment) {
        this.read = manageRecipientGroupFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ManageRecipientGroupFragment manageRecipientGroupFragment = this.read;
        if (String.valueOf(manageRecipientGroupFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText()) != null) {
            boolean z = false;
            if (String.valueOf(manageRecipientGroupFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText()).length() > 0) {
                if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(String.valueOf(manageRecipientGroupFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText())).matches()) {
                    AutoValue_InstallationResponse autoValue_InstallationResponse = manageRecipientGroupFragment.manageRecipientGroupPresenter;
                    String valueOf = String.valueOf(manageRecipientGroupFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText());
                    if (!autoValue_InstallationResponse.MediaBrowserCompat$ItemReceiver) {
                        autoValue_InstallationResponse.MediaBrowserCompat$ItemReceiver = true;
                        if (autoValue_InstallationResponse.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            autoValue_InstallationResponse.RatingCompat.AlertController$RecycleListView();
                        }
                        notifyValueReclaimed write = notifyValueReclaimed.write();
                        String str = autoValue_InstallationResponse.read;
                        if (str == null) {
                            str = "";
                        }
                        write.IconCompatParcelizer = str;
                        write.write = valueOf;
                        autoValue_InstallationResponse.write.MediaBrowserCompat$CustomActionResultReceiver(write);
                        autoValue_InstallationResponse.write.IconCompatParcelizer(new AutoValue_InstallationResponse$MediaBrowserCompat$ItemReceiver(autoValue_InstallationResponse, valueOf));
                        return;
                    }
                    return;
                }
                CustomInputDialog customInputDialog = manageRecipientGroupFragment.MediaBrowserCompat$CustomActionResultReceiver;
                String string = manageRecipientGroupFragment.getString(R.string.favorite_invalid_character);
                customInputDialog.mErrorTextView.setVisibility(0);
                customInputDialog.mErrorTextView.setText(string);
                return;
            }
            CustomInputDialog customInputDialog2 = manageRecipientGroupFragment.MediaBrowserCompat$CustomActionResultReceiver;
            String string2 = manageRecipientGroupFragment.getString(R.string.edit_favourite_empty);
            customInputDialog2.mErrorTextView.setVisibility(0);
            customInputDialog2.mErrorTextView.setText(string2);
        }
    }
}
