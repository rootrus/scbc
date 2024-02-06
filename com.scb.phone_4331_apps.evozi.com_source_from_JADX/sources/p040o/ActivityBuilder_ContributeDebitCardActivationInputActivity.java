package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$MediaItem;
import com.scb.phone.view.fragment.landingpage.BaseDragAndDropFragment;

/* renamed from: o.ActivityBuilder_ContributeDebitCardActivationInputActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDebitCardActivationInputActivity implements TileAdapter$MediaBrowserCompat$MediaItem {
    private final /* synthetic */ BaseDragAndDropFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ TileAdapter$MediaBrowserCompat$MediaItem read;

    public /* synthetic */ ActivityBuilder_ContributeDebitCardActivationInputActivity(BaseDragAndDropFragment baseDragAndDropFragment, TileAdapter$MediaBrowserCompat$MediaItem tileAdapter$MediaBrowserCompat$MediaItem) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDragAndDropFragment;
        this.read = tileAdapter$MediaBrowserCompat$MediaItem;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        BaseDragAndDropFragment baseDragAndDropFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        TileAdapter$MediaBrowserCompat$MediaItem tileAdapter$MediaBrowserCompat$MediaItem = this.read;
        baseDragAndDropFragment.IconCompatParcelizer.setExpandedFormat = z;
        if (tileAdapter$MediaBrowserCompat$MediaItem != null) {
            tileAdapter$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(z);
        }
    }
}
