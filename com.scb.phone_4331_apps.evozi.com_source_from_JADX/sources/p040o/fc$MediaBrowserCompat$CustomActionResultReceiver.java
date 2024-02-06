package p040o;

import java.util.List;
import p040o.GoogleMap;
import p040o.access$2300;

/* renamed from: o.fc$MediaBrowserCompat$CustomActionResultReceiver */
class fc$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<GoogleMap.OnInfoWindowClickListener>> {
    private /* synthetic */ C4419fc read;

    public final void onComplete() {
    }

    private fc$MediaBrowserCompat$CustomActionResultReceiver(C4419fc fcVar) {
        this.read = fcVar;
    }

    /* synthetic */ fc$MediaBrowserCompat$CustomActionResultReceiver(C4419fc fcVar, byte b) {
        this(fcVar);
    }

    public final void onError(Throwable th) {
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        boolean unused = this.read.MediaSessionCompat$QueueItem = true;
        C4419fc.MediaDescriptionCompat(this.read);
    }
}
