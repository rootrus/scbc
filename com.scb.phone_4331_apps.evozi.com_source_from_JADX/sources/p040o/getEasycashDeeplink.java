package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.EditFavouriteAdapter;
import p040o.CrashlyticsReport;

/* renamed from: o.getEasycashDeeplink */
public final /* synthetic */ class getEasycashDeeplink implements View.OnClickListener {
    private final /* synthetic */ EditFavouriteAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CrashlyticsReport.Session.Builder write;

    public /* synthetic */ getEasycashDeeplink(EditFavouriteAdapter editFavouriteAdapter, int i, CrashlyticsReport.Session.Builder builder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = editFavouriteAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = builder;
    }

    public final void onClick(View view) {
        EditFavouriteAdapter editFavouriteAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        editFavouriteAdapter.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$ItemReceiver, this.write.read());
    }
}
