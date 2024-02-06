package p040o;

import android.content.DialogInterface;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.transferandpay.AddFavoriteTransferInputFragment;
import java.util.regex.Pattern;
import p040o.C4316e;
import p040o.ImmutableList;

/* renamed from: o.ActivityBuilder_ContributeRiskFormSheetActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRiskFormSheetActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ AddFavoriteTransferInputFragment write;

    public /* synthetic */ ActivityBuilder_ContributeRiskFormSheetActivity(AddFavoriteTransferInputFragment addFavoriteTransferInputFragment) {
        this.write = addFavoriteTransferInputFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        AddFavoriteTransferInputFragment addFavoriteTransferInputFragment = this.write;
        if (String.valueOf(addFavoriteTransferInputFragment.MediaMetadataCompat.mEditTextView.getText()) != null) {
            boolean z = false;
            if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(String.valueOf(addFavoriteTransferInputFragment.MediaMetadataCompat.mEditTextView.getText())).matches()) {
                C4316e.C43171 r11 = addFavoriteTransferInputFragment.presenter;
                parseSession parsesession = addFavoriteTransferInputFragment.MediaBrowserCompat$SearchResultReceiver;
                String str2 = addFavoriteTransferInputFragment.MediaBrowserCompat$MediaItem;
                String str3 = addFavoriteTransferInputFragment.IconCompatParcelizer;
                double d = addFavoriteTransferInputFragment.MediaBrowserCompat$CustomActionResultReceiver;
                String valueOf = String.valueOf(addFavoriteTransferInputFragment.MediaMetadataCompat.mEditTextView.getText());
                if ((("TRANSFER".hashCode() != 2063509483 || !"TRANSFER".equals("TRANSFER")) ? (char) 65535 : 0) == 0) {
                    ImmutableList.SerializedForm read = ImmutableList.SerializedForm.read();
                    read.AppCompatViewInflater = "TRANSFER";
                    read.setShortcut = parsesession.RatingCompat.name();
                    read.setContentView = str2;
                    read.AppCompatDelegateImpl$ListMenuDecorView = str3;
                    read.setCheckable = null;
                    read.setIcon = null;
                    read.setChecked = d;
                    read.ActionMenuItemView = valueOf;
                    if (IGoogleMapDelegate.PROMPTPAY.equals(parsesession.RatingCompat)) {
                        str = ((eventFromJson) parsesession).MediaBrowserCompat$MediaItem.name();
                    } else {
                        str = ((eventToJson) parsesession).MediaBrowserCompat$ItemReceiver;
                    }
                    read.setExpandedFormat = str;
                    if (r11.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        r11.RatingCompat.AlertController$RecycleListView();
                    }
                    r11.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(read);
                    r11.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new e$1$MediaBrowserCompat$ItemReceiver(r11, read.ActionMenuItemView));
                    return;
                }
                return;
            }
            CustomInputDialog customInputDialog = addFavoriteTransferInputFragment.MediaMetadataCompat;
            String string = addFavoriteTransferInputFragment.getString(R.string.favorite_invalid_character);
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(string);
        }
    }
}
