package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter;
import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.DealsService */
public final /* synthetic */ class DealsService implements TileAdapter$MediaBrowserCompat$SearchResultReceiver {
    private final /* synthetic */ TileAdapter IconCompatParcelizer;

    public /* synthetic */ DealsService(TileAdapter tileAdapter) {
        this.IconCompatParcelizer = tileAdapter;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.setForceShowIcon();
    }
}
