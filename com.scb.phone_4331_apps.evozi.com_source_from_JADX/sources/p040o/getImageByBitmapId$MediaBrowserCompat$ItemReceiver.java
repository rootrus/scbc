package p040o;

import p040o.access$2300;

/* renamed from: o.getImageByBitmapId$MediaBrowserCompat$ItemReceiver */
final class getImageByBitmapId$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<isScrollGesturesEnabled> {
    private /* synthetic */ getImageByBitmapId MediaBrowserCompat$CustomActionResultReceiver;
    private parseEvent MediaBrowserCompat$ItemReceiver;
    private newWeakInterner read;

    public final /* synthetic */ void onNext(Object obj) {
        isScrollGesturesEnabled isscrollgesturesenabled = (isScrollGesturesEnabled) obj;
        boolean z = true;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) {
            getImageByBitmapId getimagebybitmapid = this.MediaBrowserCompat$CustomActionResultReceiver;
            ApplicationContextImageStore applicationContextImageStore = ApplicationContextImageStore.write;
            if (getimagebybitmapid.RatingCompat != null) {
                applicationContextImageStore.IconCompatParcelizer(getimagebybitmapid.RatingCompat);
            }
            parseEventExecution write = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$ItemReceiver, isscrollgesturesenabled, this.read);
            getImageByBitmapId getimagebybitmapid2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            saveResultAndFinish saveresultandfinish = new saveResultAndFinish(write);
            if (getimagebybitmapid2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                saveresultandfinish.IconCompatParcelizer(getimagebybitmapid2.RatingCompat);
            }
        }
    }

    getImageByBitmapId$MediaBrowserCompat$ItemReceiver(getImageByBitmapId getimagebybitmapid, newWeakInterner newweakinterner, parseEvent parseevent) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getimagebybitmapid;
        this.read = newweakinterner;
        this.MediaBrowserCompat$ItemReceiver = parseevent;
    }

    public final void onError(Throwable th) {
        getImageByBitmapId getimagebybitmapid = this.MediaBrowserCompat$CustomActionResultReceiver;
        ApplicationContextImageStore applicationContextImageStore = ApplicationContextImageStore.write;
        if (getimagebybitmapid.RatingCompat != null) {
            applicationContextImageStore.IconCompatParcelizer(getimagebybitmapid.RatingCompat);
        }
        getImageByBitmapId getimagebybitmapid2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        getimagebybitmapid2.MediaBrowserCompat$ItemReceiver(getimagebybitmapid2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
