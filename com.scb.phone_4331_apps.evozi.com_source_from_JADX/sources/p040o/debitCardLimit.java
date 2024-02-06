package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter;
import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.debitCardLimit */
public final /* synthetic */ class debitCardLimit implements TileAdapter$MediaBrowserCompat$SearchResultReceiver {
    private final /* synthetic */ TileAdapter read;

    public /* synthetic */ debitCardLimit(TileAdapter tileAdapter) {
        this.read = tileAdapter;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.read.MediaBrowserCompat$ItemReceiver.write(((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj).setCheckable);
    }
}
