package p040o;

import p040o.access$2300;

/* renamed from: o.getPersonalShortCuts$MediaBrowserCompat$ItemReceiver */
public class getPersonalShortCuts$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
    final /* synthetic */ getPersonalShortCuts MediaBrowserCompat$ItemReceiver;

    private getPersonalShortCuts$MediaBrowserCompat$ItemReceiver(getPersonalShortCuts getpersonalshortcuts) {
        this.MediaBrowserCompat$ItemReceiver = getpersonalshortcuts;
    }

    public /* synthetic */ getPersonalShortCuts$MediaBrowserCompat$ItemReceiver(getPersonalShortCuts getpersonalshortcuts, byte b) {
        this(getpersonalshortcuts);
    }

    public final void onComplete() {
        getPersonalShortCuts.write(this.MediaBrowserCompat$ItemReceiver);
        getPersonalShortCuts getpersonalshortcuts = this.MediaBrowserCompat$ItemReceiver;
        DocumentType documentType = new DocumentType(this);
        if (getpersonalshortcuts.RatingCompat != null) {
            documentType.IconCompatParcelizer(getpersonalshortcuts.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
