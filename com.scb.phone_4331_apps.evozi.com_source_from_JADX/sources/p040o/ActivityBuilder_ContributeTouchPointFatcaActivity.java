package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.transferandpay.EditFavouriteFragment;

/* renamed from: o.ActivityBuilder_ContributeTouchPointFatcaActivity */
public final /* synthetic */ class ActivityBuilder_ContributeTouchPointFatcaActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ EditFavouriteFragment read;

    public /* synthetic */ ActivityBuilder_ContributeTouchPointFatcaActivity(EditFavouriteFragment editFavouriteFragment, int i) {
        this.read = editFavouriteFragment;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditFavouriteFragment editFavouriteFragment = this.read;
        editFavouriteFragment.editFavouritePresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
