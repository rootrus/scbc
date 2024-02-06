package p040o;

import p040o.access$2300;

/* renamed from: o.nativeGetRows$MediaBrowserCompat$CustomActionResultReceiver */
public class nativeGetRows$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTransparency> {
    private /* synthetic */ nativeGetRows MediaBrowserCompat$CustomActionResultReceiver;

    public nativeGetRows$MediaBrowserCompat$CustomActionResultReceiver(nativeGetRows nativegetrows) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nativegetrows;
    }

    public final void onError(Throwable th) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            nativeGetRows.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        nativeGetRows.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        nativeGetRows nativegetrows = this.MediaBrowserCompat$CustomActionResultReceiver;
        Page page = Page.MediaBrowserCompat$CustomActionResultReceiver;
        if (nativegetrows.RatingCompat != null) {
            page.IconCompatParcelizer(nativegetrows.RatingCompat);
        }
    }
}
