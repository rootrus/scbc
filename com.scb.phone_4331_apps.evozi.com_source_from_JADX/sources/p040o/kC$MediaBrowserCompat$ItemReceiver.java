package p040o;

/* renamed from: o.kC$MediaBrowserCompat$ItemReceiver */
public class kC$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    final /* synthetic */ C4889kC MediaBrowserCompat$ItemReceiver;

    private kC$MediaBrowserCompat$ItemReceiver(C4889kC kCVar) {
        this.MediaBrowserCompat$ItemReceiver = kCVar;
    }

    public /* synthetic */ kC$MediaBrowserCompat$ItemReceiver(C4889kC kCVar, byte b) {
        this(kCVar);
    }

    public final void onComplete() {
        C4889kC.MediaSessionCompat$QueueItem(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        C4889kC.ParcelableVolumeInfo(this.MediaBrowserCompat$ItemReceiver);
        C4889kC kCVar = this.MediaBrowserCompat$ItemReceiver;
        C4872jk jkVar = new C4872jk(this, th);
        if (kCVar.RatingCompat != null) {
            jkVar.IconCompatParcelizer(kCVar.RatingCompat);
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        if (this.MediaBrowserCompat$ItemReceiver.read) {
            this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.write, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.read);
        }
        C4889kC kCVar = this.MediaBrowserCompat$ItemReceiver;
        C4870ji jiVar = new C4870ji(this);
        if (kCVar.RatingCompat != null) {
            jiVar.IconCompatParcelizer(kCVar.RatingCompat);
        }
    }
}
