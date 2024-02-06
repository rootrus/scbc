package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.EditFavouriteAdapter;

/* renamed from: o.getCreditPowerLanding */
public final /* synthetic */ class getCreditPowerLanding implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ EditFavouriteAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getCreditPowerLanding(EditFavouriteAdapter editFavouriteAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = editFavouriteAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        EditFavouriteAdapter editFavouriteAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        editFavouriteAdapter.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.IconCompatParcelizer);
    }
}
