package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter;
import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.debitCardsSummary */
public final /* synthetic */ class debitCardsSummary implements TileAdapter$MediaBrowserCompat$SearchResultReceiver {
    private final /* synthetic */ TileAdapter write;

    public /* synthetic */ debitCardsSummary(TileAdapter tileAdapter) {
        this.write = tileAdapter;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.write.MediaBrowserCompat$ItemReceiver.setGroupDividerEnabled();
    }
}
