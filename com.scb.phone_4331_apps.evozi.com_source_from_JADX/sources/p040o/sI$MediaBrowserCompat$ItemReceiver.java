package p040o;

import p040o.CrashlyticsReport;
import p040o.access$2300;

/* renamed from: o.sI$MediaBrowserCompat$ItemReceiver */
public class sI$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<isMapToolbarEnabled> {
    private /* synthetic */ C7434sI MediaBrowserCompat$ItemReceiver;
    private final String write;

    public final /* synthetic */ void onNext(Object obj) {
        doStop read = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
        startUp RatingCompat = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder MediaMetadataCompat = this.MediaBrowserCompat$ItemReceiver.read;
        C7434sI sIVar = this.MediaBrowserCompat$ItemReceiver;
        boolean z = false;
        setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver = read.MediaBrowserCompat$CustomActionResultReceiver((isMapToolbarEnabled) obj, RatingCompat.IconCompatParcelizer(MediaMetadataCompat, C7434sI.MediaBrowserCompat$CustomActionResultReceiver(sIVar, sIVar.read.IconCompatParcelizer), false), this.write);
        C7434sI sIVar2 = this.MediaBrowserCompat$ItemReceiver;
        C10159tc tcVar = new C10159tc(MediaBrowserCompat$CustomActionResultReceiver);
        if (sIVar2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            tcVar.IconCompatParcelizer(sIVar2.RatingCompat);
        }
        C7434sI.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public sI$MediaBrowserCompat$ItemReceiver(C7434sI sIVar, String str) {
        this.MediaBrowserCompat$ItemReceiver = sIVar;
        this.write = str;
    }

    public final void onError(Throwable th) {
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            C7434sI sIVar = this.MediaBrowserCompat$ItemReceiver;
            sIVar.MediaBrowserCompat$ItemReceiver(sIVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
