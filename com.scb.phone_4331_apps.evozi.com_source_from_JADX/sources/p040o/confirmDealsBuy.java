package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter;
import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.confirmDealsBuy */
public final /* synthetic */ class confirmDealsBuy implements TileAdapter$MediaBrowserCompat$SearchResultReceiver {
    private final /* synthetic */ TileAdapter write;

    public /* synthetic */ confirmDealsBuy(TileAdapter tileAdapter) {
        this.write = tileAdapter;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.write.MediaBrowserCompat$ItemReceiver.setTitle();
    }
}
