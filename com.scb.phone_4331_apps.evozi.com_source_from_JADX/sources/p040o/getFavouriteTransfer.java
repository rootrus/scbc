package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.bulktransfer.ManageRecipientGroupFragment;

/* renamed from: o.getFavouriteTransfer */
public final /* synthetic */ class getFavouriteTransfer implements DialogInterface.OnClickListener {
    private final /* synthetic */ ManageRecipientGroupFragment read;

    public /* synthetic */ getFavouriteTransfer(ManageRecipientGroupFragment manageRecipientGroupFragment) {
        this.read = manageRecipientGroupFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.read.manageRecipientGroupPresenter;
        if (!autoValue_InstallationResponse.MediaBrowserCompat$ItemReceiver) {
            boolean z = true;
            autoValue_InstallationResponse.MediaBrowserCompat$ItemReceiver = true;
            if (autoValue_InstallationResponse.RatingCompat == null) {
                z = false;
            }
            if (z) {
                autoValue_InstallationResponse.RatingCompat.AlertController$RecycleListView();
            }
            isComputingReference IconCompatParcelizer = isComputingReference.IconCompatParcelizer();
            String str = autoValue_InstallationResponse.read;
            if (str == null) {
                str = "";
            }
            IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str;
            autoValue_InstallationResponse.write.IconCompatParcelizer(IconCompatParcelizer);
            autoValue_InstallationResponse.write.IconCompatParcelizer(new C9663x57af7285(autoValue_InstallationResponse, (byte) 0));
        }
    }
}
