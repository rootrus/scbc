package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.bulktransfer.EditRecipientFragment;
import p040o.getFid;

/* renamed from: o.deleteTile */
public final /* synthetic */ class deleteTile implements DialogInterface.OnClickListener {
    private final /* synthetic */ EditRecipientFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ deleteTile(EditRecipientFragment editRecipientFragment) {
        this.MediaBrowserCompat$ItemReceiver = editRecipientFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditRecipientFragment editRecipientFragment = this.MediaBrowserCompat$ItemReceiver;
        getFid getfid = editRecipientFragment.editRecipientPresenter;
        String string = editRecipientFragment.getArguments().getString("com.scb.phone.EXTRA_GROUP_ID");
        if (getfid.RatingCompat != null) {
            getfid.RatingCompat.AlertController$RecycleListView();
        }
        MapStyleOptions mapStyleOptions = getfid.MediaBrowserCompat$ItemReceiver;
        long j = getfid.IconCompatParcelizer.MediaDescriptionCompat;
        copyFor MediaBrowserCompat$CustomActionResultReceiver = copyFor.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = string;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = j;
        mapStyleOptions.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver);
        getfid.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getFid.read(getfid, (byte) 0));
    }
}
