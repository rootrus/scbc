package p040o;

import p040o.AutocompleteFilter;
import p040o.MetaDataStore;
import p040o.access$2300;

/* renamed from: o.getPosX$MediaBrowserCompat$ItemReceiver */
public class getPosX$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<AutocompleteFilter.Builder> {
    final /* synthetic */ getPosX MediaBrowserCompat$CustomActionResultReceiver;

    private getPosX$MediaBrowserCompat$ItemReceiver(getPosX getposx) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getposx;
    }

    public /* synthetic */ getPosX$MediaBrowserCompat$ItemReceiver(getPosX getposx, byte b) {
        this(getposx);
    }

    public final /* synthetic */ void onNext(Object obj) {
        AutocompleteFilter.Builder builder = (AutocompleteFilter.Builder) obj;
        super.onNext(builder);
        getPosX.MediaBrowserCompat$MediaItem(this.MediaBrowserCompat$CustomActionResultReceiver);
        MetaDataStore.C36551 IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.IconCompatParcelizer(builder);
        getPosX getposx = this.MediaBrowserCompat$CustomActionResultReceiver;
        PreviewFrameEvent previewFrameEvent = new PreviewFrameEvent(this, IconCompatParcelizer);
        if (getposx.RatingCompat != null) {
            previewFrameEvent.IconCompatParcelizer(getposx.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
