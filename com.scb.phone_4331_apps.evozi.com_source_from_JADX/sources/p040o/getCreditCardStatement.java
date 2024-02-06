package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter;
import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.getCreditCardStatement */
public final /* synthetic */ class getCreditCardStatement implements TileAdapter$MediaBrowserCompat$SearchResultReceiver {
    private final /* synthetic */ TileAdapter write;

    public /* synthetic */ getCreditCardStatement(TileAdapter tileAdapter) {
        this.write = tileAdapter;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.write.MediaBrowserCompat$ItemReceiver.read(((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj).setBackgroundResource);
    }
}
