package p040o;

import android.content.DialogInterface;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.transferandpay.FixedTransferSuccessFragment;
import java.util.regex.Pattern;
import p040o.CrashlyticsReport;
import p040o.ImmutableList;

/* renamed from: o.ActivityBuilder_ContributeTouchPointLivenessCheckActivity */
public final /* synthetic */ class ActivityBuilder_ContributeTouchPointLivenessCheckActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ FixedTransferSuccessFragment write;

    public /* synthetic */ ActivityBuilder_ContributeTouchPointLivenessCheckActivity(FixedTransferSuccessFragment fixedTransferSuccessFragment) {
        this.write = fixedTransferSuccessFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FixedTransferSuccessFragment fixedTransferSuccessFragment = this.write;
        if (String.valueOf(fixedTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText()) != null) {
            boolean z = false;
            if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(String.valueOf(fixedTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText())).matches()) {
                C5174qT qTVar = fixedTransferSuccessFragment.presenter;
                CrashlyticsReport.Session.Event.Application application = fixedTransferSuccessFragment.IconCompatParcelizer;
                String valueOf = String.valueOf(fixedTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText());
                String str = application.MediaMetadataCompat;
                String str2 = str == null || str.length() == 0 ? "TRANSFER" : application.MediaMetadataCompat;
                String str3 = application.ParcelableVolumeInfo;
                String str4 = str3 == null || str3.length() == 0 ? "ALL" : application.ParcelableVolumeInfo;
                ImmutableList.SerializedForm read = ImmutableList.SerializedForm.read();
                read.ActionMenuItemView = valueOf;
                read.AppCompatDelegateImpl$ListMenuDecorView = application.setHasDecor;
                read.AppCompatViewInflater = str2;
                read.setShortcut = str4;
                read.setExpandedFormat = application.MediaBrowserCompat$SearchResultReceiver;
                read.setContentView = application.read;
                read.setShortcut = str4;
                if (qTVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    qTVar.RatingCompat.AlertController$RecycleListView();
                }
                qTVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(read);
                qTVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new qT$MediaBrowserCompat$CustomActionResultReceiver(qTVar, read.ActionMenuItemView));
                return;
            }
            CustomInputDialog customInputDialog = fixedTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
            String string = fixedTransferSuccessFragment.getString(R.string.favorite_invalid_character);
            customInputDialog.mErrorTextView.setVisibility(0);
            customInputDialog.mErrorTextView.setText(string);
        }
    }
}
